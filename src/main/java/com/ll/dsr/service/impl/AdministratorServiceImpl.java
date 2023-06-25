package com.ll.dsr.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ll.dsr.entity.Administrator;
import com.ll.dsr.mapper.AdministratorMapper;
import com.ll.dsr.service.AdministratorService;
import org.springframework.stereotype.Service;

@Service
public class AdministratorServiceImpl extends ServiceImpl<AdministratorMapper, Administrator> implements AdministratorService {
}
