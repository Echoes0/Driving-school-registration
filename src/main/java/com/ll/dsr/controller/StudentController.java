package com.ll.dsr.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.ll.dsr.common.Result;
import com.ll.dsr.entity.*;
import com.ll.dsr.service.*;
import com.ll.dsr.utils.FileOutIn;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Slf4j
@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @Autowired
    private RegistrationFormService registrationFormService;

    @Autowired
    private OrdersService ordersService;

    @Autowired
    private CourseService courseService;

    @Autowired
    private ExamAppointmentsService examAppointmentsService;

    /**
     * 获取所有学员
     */
    @GetMapping("list")
    @ResponseBody
    public Result<List<Student>> getStudent(Long num,String name){

        log.info(String.valueOf(num));
        log.info(name);

        LambdaQueryWrapper<Student> queryWrapper=new LambdaQueryWrapper<>();

        if (num!=null){
            queryWrapper.like(Student::getStudentNumber,num);
        }

        if (!name.equals("")){
            queryWrapper.like(Student::getLearnerName,name);
        }

        List<Student> students = studentService.list(queryWrapper);

        return Result.success(students);
    }

    /**
     * 完善学员个人信息，即提交报名表
     */
    @PostMapping("improveBasic")
    public Result<Student> improveBasicInformation(@RequestBody Student student){

        LambdaQueryWrapper<Student> queryWrapper=new LambdaQueryWrapper<>();
        queryWrapper.eq(Student::getStudentNumber,student.getStudentNumber());
        studentService.update(queryWrapper);

        //新增报名表信息
        RegistrationForm registrationForm=new RegistrationForm(0,null,student.getStudentNumber());

        registrationFormService.save(registrationForm);

        return Result.success(student);
    }

    /**
     * 更新学员审核状态
     * @param studentNum 学员编号
     * @param status 学员审核状态 0 1 2
     * @param administratorNum 管理员编号
     */
    @GetMapping("changeStudentStatus")
    @ResponseBody
    public Result<String> changeStudentStatus(Long studentNum,int status,int administratorNum){

        UpdateWrapper<Student> updateWrapper = new UpdateWrapper<>();//照搬

        updateWrapper.eq("student_number",studentNum);
        updateWrapper.set("audit_status",status);

        studentService.update(updateWrapper);

        //将所有的课程及学生存入order表

        List<Course> courses = courseService.list();

        List<Orders> ordersList=new ArrayList<>();

        for (Course course : courses) {
            Orders orders=new Orders(0,course.getCourseNumber(),studentNum,administratorNum,null,course.getTheoreticalHours(),course.getPracticalHours());
            ordersList.add(orders);
        }

        ordersService.saveBatch(ordersList);

        return Result.success("状态修改成功");
    }

    /**
     * 更换学员的教练
     * @param num 学员编号
     * @param auditNum 教练编号
     */
    @GetMapping("changeAuditNum")
    @ResponseBody
    public Result<String> changeAuditNum(Long num,Long auditNum){

        UpdateWrapper<Student> updateWrapper = new UpdateWrapper<>();

        updateWrapper.eq("student_number",num);
        updateWrapper.set("audit_num",auditNum);

        studentService.update(updateWrapper);

        return Result.success("分配教练成功");
    }

    /**
     * 新增学员
     */
    @PostMapping("addStudent")
    public Result<Student> addStudent(@RequestBody Student student){
        studentService.save(student);
        return Result.success(student);
    }

    /**
     * 删除学员
     */
    @DeleteMapping("deleteStudent")
    @ResponseBody
    public Result<String> deleteStudent(Long num){

        studentService.removeById(num);

        return Result.success("删除学员成功");
    }

    /**
     * 导出学生数据
     */
    @GetMapping("export")
    public void export(HttpServletResponse response) throws Exception {
        List<Student> students=studentService.list();
        Map<String, String> headers=new HashMap<String,String>(){{
                put("studentNumber", "编号");
                put("password", "密码");
                put("birthday", "出生日期");
                put("major", "专业");
                put("grade", "班级");
                put("source_address", "生源地");
                put("scores", "入学成绩");
                put("phone", "电话号码");
                put("id", "身份证号");
            }
        };
        FileOutIn.FileOut(students,response,headers);
    }

    /**
     * excel 导入学生数据
     * @param file 文件
     */
    @PostMapping("import")
    @ResponseBody //返回的值将被视为正常类型，否则为页面
    public Result<String> imp(MultipartFile file) throws Exception {

        List<Student> students = FileOutIn.FileIn(file, Student.class);

        studentService.saveBatch(students);
        return Result.success("导入成功");
    }

    /**
     * 报名考试
     * @param studentNum 学员编号
     * @param examinationNum 考试编号
     */
    @PostMapping("appointment")
    @ResponseBody
    public Result<String> appointment(Long studentNum,Long examinationNum) {
        ExamAppointments examAppointments=new ExamAppointments();
        examAppointments.setExamNumber(examinationNum);
        examAppointments.setStudentNumber(studentNum);
        examAppointments.setAppointmentTime(null);
        examAppointments.setExamAppointmentNumber(0);

        examAppointmentsService.save(examAppointments);

        return Result.success("考试报名成功");
    }
}
