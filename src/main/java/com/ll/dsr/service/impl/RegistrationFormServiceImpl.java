package com.ll.dsr.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ll.dsr.entity.RegistrationForm;
import com.ll.dsr.mapper.RegistrationFormMapper;
import com.ll.dsr.service.RegistrationFormService;
import org.springframework.stereotype.Service;

@Service
public class RegistrationFormServiceImpl extends ServiceImpl<RegistrationFormMapper, RegistrationForm> implements RegistrationFormService {
}
