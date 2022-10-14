package com.cjh.eduservice.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("com.cjh.eduservice.mapper")
public class EduConfig {

}