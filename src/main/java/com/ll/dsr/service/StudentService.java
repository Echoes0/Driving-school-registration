package com.ll.dsr.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ll.dsr.entity.Student;

public interface StudentService extends IService<Student> {

    public void login(Student student);
}
