package com.ll.dsr.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.ll.dsr.common.Result;
import com.ll.dsr.entity.Examination;
import com.ll.dsr.entity.Grades;
import com.ll.dsr.service.ExaminationService;
import com.ll.dsr.service.GradesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/examination")
public class ExaminationController {
    
    @Autowired
    ExaminationService examinationService;

    @Autowired
    GradesService gradesService;

    /**
     * 获取所有考试
     */
    @GetMapping("list")
    public Result<List<Examination>> getExamination(){
        return Result.success(examinationService.list());
    }

    /**
     * 修改考试
     */
    @PostMapping("changeExamination")
    public Result<Examination> improveBasicInformation(@RequestBody Examination examination){

        LambdaQueryWrapper<Examination> queryWrapper=new LambdaQueryWrapper<>();
        queryWrapper.eq(Examination::getExamNumber,examination.getExamNumber());
        examinationService.update(queryWrapper);

        return Result.success(examination);
    }

    /**
     * 新增考试
     */
    @PostMapping("addExamination")
    public Result<Examination> addExamination(@RequestBody Examination examination){
        examinationService.save(examination);
        return Result.success(examination);
    }

    /**
     * 删除考试
     */
    @DeleteMapping("deleteExamination")
    public Result<String> deleteExamination(Long num){

        examinationService.removeById(num);

        return Result.success("删除考试成功");
    }

    /**
     * 录入成绩
     * @param studentNum 学员编号
     * @param grade 考试成绩
     * @param examinationNum 考试编号
     */
    @PostMapping("setGrade")
    @ResponseBody
    public Result<Grades> setGrade(Long studentNum,Long grade,Long examinationNum){
        Grades grades=new Grades();
        grades.setGradeNumber(0);
        grades.setGrades(grade);
        grades.setExamNumber(examinationNum);
        grades.setPublicityTime(null);
        grades.setStudentNumber(studentNum);

        gradesService.save(grades);

        return Result.success(grades);
    }

}
