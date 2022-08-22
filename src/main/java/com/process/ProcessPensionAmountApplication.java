package com.process;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;


@SpringBootApplication
@EnableFeignClients
public class ProcessPensionAmountApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProcessPensionAmountApplication.class, args);
	}

}

