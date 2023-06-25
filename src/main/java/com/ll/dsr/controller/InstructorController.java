package com.ll.dsr.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.ll.dsr.common.Result;
import com.ll.dsr.entity.Instructor;
import com.ll.dsr.entity.Student;
import com.ll.dsr.service.InstructorService;
import com.ll.dsr.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/instructor")
public class InstructorController {
    
    @Autowired
    InstructorService instructorService;

    @Autowired
    StudentService studentService;

    /**
     * 获取所有教练
     */
    @GetMapping("list")
    public Result<List<Instructor>> getInstructor(){
        return Result.success(instructorService.list());
    }

    /**
     * 修改教练个人信息
     */
    @PostMapping("changeInstructor")
    public Result<Instructor> improveBasicInformation(@RequestBody Instructor instructor){

        LambdaQueryWrapper<Instructor> queryWrapper=new LambdaQueryWrapper<>();
        queryWrapper.eq(Instructor::getCoachNumber,instructor.getCoachNumber());
        instructorService.update(queryWrapper);

        return Result.success(instructor);
    }

    /**
     * 新增教练
     */
    @PostMapping("addInstructor")
    public Result<Instructor> addInstructor(@RequestBody Instructor instructor){
        instructorService.save(instructor);
        return Result.success(instructor);
    }

    /**
     * 删除教练
     */
    @DeleteMapping("deleteInstructor")
    public Result<String> deleteInstructor(Long num){

        instructorService.removeById(num);

        return Result.success("删除教练成功");
    }

    /**
     * 获取教练的所有学生
     * @param num 教练编号
     */
    @GetMapping("getInstructorStudent")
    public Result<List<Student>> getInstructorStudent(Long num){
        LambdaQueryWrapper<Student> queryWrapper=new LambdaQueryWrapper<>();
        queryWrapper.eq(Student::getAuditNumber,num);
        return Result.success(studentService.list(queryWrapper));
    }

}


