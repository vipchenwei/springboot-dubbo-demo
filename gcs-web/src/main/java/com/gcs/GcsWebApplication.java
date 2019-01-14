package com.gcs;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubboConfiguration
public class GcsWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(GcsWebApplication.class, args);
	}

}

