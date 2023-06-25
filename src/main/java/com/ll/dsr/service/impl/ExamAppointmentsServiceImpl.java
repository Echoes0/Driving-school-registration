package com.ll.dsr.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ll.dsr.entity.ExamAppointments;
import com.ll.dsr.mapper.ExamAppointmentsMapper;
import com.ll.dsr.service.ExamAppointmentsService;
import org.springframework.stereotype.Service;

@Service
public class ExamAppointmentsServiceImpl extends ServiceImpl<ExamAppointmentsMapper, ExamAppointments> implements ExamAppointmentsService {
}
