package com.libro.v1.tomik;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import util.ApplicationRunner;

@SpringBootApplication
@EnableMongoRepositories
public class TomikApplication {
	public static void main(String[] args) {
		SpringApplication.run(TomikApplication.class, args);
	}
	@Bean
	public ApplicationRunner applicationStartupRunner() {
		return new ApplicationRunner();
	}
}
