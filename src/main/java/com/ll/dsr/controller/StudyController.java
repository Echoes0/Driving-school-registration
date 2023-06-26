package com.ll.dsr.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.ll.dsr.common.Result;
import com.ll.dsr.entity.Course;
import com.ll.dsr.entity.Orders;
import com.ll.dsr.service.CourseService;
import com.ll.dsr.service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/study")
public class StudyController {
    
    @Autowired
    CourseService courseService;

    @Autowired
    OrdersService ordersService;

    /**
     * 获取所有课程
     */
    @GetMapping("list")
    public Result<List<Course>> getCourse(){
        return Result.success(courseService.list());
    }

    /**
     * 完善课程个人信息
     */
    @PostMapping("improveBasic")
    public Result<Course> improveBasicInformation(@RequestBody Course course){

        LambdaQueryWrapper<Course> queryWrapper=new LambdaQueryWrapper<>();
        queryWrapper.eq(Course::getCourseNumber,course.getCourseNumber());
        courseService.update(queryWrapper);

        return Result.success(course);
    }

    /**
     * 更新课程学习时长
     * @param courseNum 课程编号
     * @param studentNum 学员编号
     * @param minutes 理论/联系本次学习的时长
     * @param type 本次学习的类型 理论/实际
     */
    @GetMapping("changeCourseMinute")
    @ResponseBody
    public Result<String> changeCourseStatus(Long courseNum,int studentNum,int minutes,int type){

        LambdaQueryWrapper<Orders> queryWrapper=new LambdaQueryWrapper<>();

        queryWrapper.eq(Orders::getCourseNumber,courseNum);
        queryWrapper.eq(Orders::getStudentNumber,studentNum);

        Orders orders = ordersService.getOne(queryWrapper);

        UpdateWrapper<Orders> updateWrapper = new UpdateWrapper<>();

        updateWrapper.eq("course_number",courseNum);

        if (type==0){
            int theoreticalHours=orders.getTheoreticalHours()-minutes;

            if (theoreticalHours<0){
                theoreticalHours=0;
            }

            updateWrapper.set("theoretical_hours",theoreticalHours);
        }
        else {
            int practicalHours=orders.getPracticalHours()-minutes;

            if (practicalHours<0){
                practicalHours=0;
            }

            updateWrapper.set("theoretical_hours",practicalHours);
        }

        ordersService.update(queryWrapper);

        return Result.success("学习进度已更新");
    }

    /**
     * 新增课程
     */
    @PostMapping("addCourse")
    public Result<Course> addCourse(@RequestBody Course course){
        courseService.save(course);
        return Result.success(course);
    }

    /**
     * 删除课程
     */
    @DeleteMapping("deleteCourse")
    @ResponseBody
    public Result<String> deleteCourse(Long num){

        courseService.removeById(num);

        return Result.success("删除课程成功");
    }

}
