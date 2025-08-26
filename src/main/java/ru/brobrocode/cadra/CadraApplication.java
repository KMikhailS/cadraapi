package ru.brobrocode.cadra;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients(basePackages = "ru.brobrocode.cadra.client.api")
public class CadraApplication {

	public static void main(String[] args) {
		SpringApplication.run(CadraApplication.class, args);
	}

}
