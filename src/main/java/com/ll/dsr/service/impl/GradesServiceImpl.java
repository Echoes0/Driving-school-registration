package com.ll.dsr.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ll.dsr.entity.Grades;
import com.ll.dsr.mapper.GradesMapper;
import com.ll.dsr.service.GradesService;
import org.springframework.stereotype.Service;

@Service
public class GradesServiceImpl extends ServiceImpl<GradesMapper, Grades> implements GradesService {
}
