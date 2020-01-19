package com.spring5.practice;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
@ComponentScan(basePackages = {"com.spring5.practice.service"})
public class RootConfig {
	@Bean
	public ServiceInitializer serviceInitializer() {
		return new ServiceInitializer();
	}
}
