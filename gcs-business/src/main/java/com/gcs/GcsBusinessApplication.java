package com.gcs;

import com.alibaba.dubbo.config.spring.context.annotation.DubboComponentScan;
import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication
@EnableDubboConfiguration
@DubboComponentScan(basePackages = "com.gcs.business.impl")
public class GcsBusinessApplication {

	public static void main(String[] args) {
		SpringApplication.run(GcsBusinessApplication.class, args);
	}

}
