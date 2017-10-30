package org.unskilled.myapp2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MyApp2Application {

	public static void main(String[] args) {
		SpringApplication.run(MyApp2Application.class, args);
	}
}
