package com.spring.jrrepo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootJasperReportApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootJasperReportApplication.class, args);
	}

}


/**
 * Spring Boot Report Generation Using Jasper Libarary
 * https://github.com/90rajibgarai/spring-boot-jasper-report
 *
 * Maven无法下载 com.lowagie itext 2.1.7.js10版本的itext依赖
 * https://blog.csdn.net/lewky_liu/article/details/109322686
 *
 */