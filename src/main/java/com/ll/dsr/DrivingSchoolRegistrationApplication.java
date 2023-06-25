package com.ll.dsr;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Slf4j //日志记录
@ServletComponentScan //扫描拦截器的相应注解
@SpringBootApplication //springboot启动类注解
@EnableTransactionManagement //开启事务注解的支持
public class DrivingSchoolRegistrationApplication {

    public static void main(String[] args) {
        SpringApplication.run(DrivingSchoolRegistrationApplication.class, args);
    }

}
