package com.mspr_kawa.db.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.TestConfiguration;

@TestConfiguration(proxyBeanMethods = false)
public class TestMainApplication {

	public static void main(String[] args) {
		SpringApplication.from(MainApplication::main).with(TestMainApplication.class).run(args);
	}

}
