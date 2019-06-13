package com.sihyuk.billiardManage.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
//설정파일이다
@Configuration
//컴포넌트를 읽기위한 지정
@ComponentScan(basePackages = { "com.sihyuk.billiardManage.dao", " com.sihyuk.billiardManage.service"})
//DBConfig값 사용
@Import({DBConfig.class})
public class ApplicationConfig {

}
