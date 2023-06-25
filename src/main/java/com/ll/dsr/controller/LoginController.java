package com.ll.dsr.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.ll.dsr.common.Result;
import com.ll.dsr.entity.Administrator;
import com.ll.dsr.entity.DrivingSchool;
import com.ll.dsr.entity.Instructor;
import com.ll.dsr.entity.Student;
import com.ll.dsr.service.AdministratorService;
import com.ll.dsr.service.DrivingSchoolService;
import com.ll.dsr.service.InstructorService;
import com.ll.dsr.service.StudentService;
import com.ll.dsr.utils.JWTUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/userSort")
public class LoginController {

    /**
     * 驾校默认id
     */
    Long dsId=123456L;

    @Autowired
    StudentService studentService;
    @Autowired
    DrivingSchoolService drivingSchoolService;

    @Autowired
    AdministratorService administratorService;

    @Autowired
    InstructorService instructorService;


    /**
     * 用户注册
     * @param id 账号
     * @param password 密码
     * @param user_code 认证码
     */
    @PostMapping("register")
    public Result register(Long id,String password,String user_code)
    {
        DrivingSchool drivingSchool=drivingSchoolService.getById(dsId);

        String code = drivingSchool.getUserCode();
        String token=JWTUtils.createToken(id);

        if (user_code.equals(code))
        {
            log.info("管理员注册");
            Administrator administrator=new Administrator(id,password);
            administratorService.save(administrator);
            Result<Administrator> result=Result.success(administrator);
            result.add("type",0);
            result.add("token",token);
            return result;
        }
        else {
            log.info("学员注册");
            Student student=new Student(id,password);
            studentService.login(student);
            Result<Student> result=Result.success(student);
            result.add("type",1);
            result.add("token",token);
            return result;
        }

    }

    /**
     * 登录
     * @param id 账号
     * @param password 密码
     */
    @PostMapping("login")
    public Result<Object> login(Long id,String password)
    {
        log.info("用户id："+id+"使用密码："+password+"登录");

        //根据用户id查找用户

        LambdaQueryWrapper<Administrator> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(Administrator::getAdministratorNumber,id);
        Administrator administrator = administratorService.getOne(queryWrapper);

        LambdaQueryWrapper<Student> queryWrapper1 = new LambdaQueryWrapper<>();
        queryWrapper1.eq(Student::getStudentNumber,id);
        Student student = studentService.getOne(queryWrapper1);


        LambdaQueryWrapper<Instructor> queryWrapper2 = new LambdaQueryWrapper<>();
        queryWrapper2.eq(Instructor::getCoachNumber,id);
        Instructor instructor = instructorService.getOne(queryWrapper2);

        String token=JWTUtils.createToken(id);

        Result<Object> result;

        if (administrator!=null&&administrator.getPassword().equals(password))
        {
            log.info("管理员登录");
            result=Result.success(administrator);
            result.add("type",0);
        }

        else if (student!=null&&student.getPassword().equals(password))
        {
            log.info("学员登录");
            result=Result.success(student);
            result.add("type",1);
        }

        else if (instructor!=null&&instructor.getPassword().equals(password)){
            log.info("教练登录");
            result=Result.success(instructor);
            result.add("type",2);
        }

        else {
            log.info("账号或密码错误");
            return Result.error("账号或密码错误");
        }

        result.add("token",token);
        return result;
    }

    @PostMapping("test")
    public Result<Student> getStudent(@RequestBody Student student){
        return Result.success(student);
    }

}
