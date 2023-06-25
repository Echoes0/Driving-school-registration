package com.ll.dsr.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ll.dsr.entity.DrivingSchool;
import com.ll.dsr.entity.Instructor;
import com.ll.dsr.mapper.DrivingSchoolMapper;
import com.ll.dsr.mapper.InstructorMapper;
import com.ll.dsr.service.DrivingSchoolService;
import com.ll.dsr.service.InstructorService;
import org.springframework.stereotype.Service;

@Service
public class InstructorServiceImpl extends ServiceImpl<InstructorMapper, Instructor> implements InstructorService {
}
