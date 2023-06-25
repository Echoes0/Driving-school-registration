package com.ll.dsr.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ll.dsr.entity.Student;
import com.ll.dsr.mapper.StudentMapper;
import com.ll.dsr.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl extends ServiceImpl<StudentMapper, Student> implements StudentService {

    @Autowired
    private StudentMapper studentMapper;

    @Override
    public void login(Student student) {
        studentMapper.login(student.getStudentNumber(), student.getPassword());
    }
}
