package com.ll.dsr.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ll.dsr.entity.Orders;
import com.ll.dsr.mapper.OrdersMapper;
import com.ll.dsr.service.OrdersService;
import org.springframework.stereotype.Service;

@Service
public class OrdersServiceImpl extends ServiceImpl<OrdersMapper, Orders> implements OrdersService {
}
