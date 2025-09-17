package ru.brobrocode.cadra;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;


@SpringBootApplication
@EnableFeignClients(basePackages = {"ru.brobrocode.cadra.client.api", "ru.brobrocode.cadra.client.yukassa"})
public class CadraApplication {

	public static void main(String[] args) {
		SpringApplication.run(CadraApplication.class, args);
	}

}
