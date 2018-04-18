package com.shikshaniketan.school;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages="com.shikshaniketan.school.repo")
@EnableJpaAuditing(auditorAwareRef="auditorAwareImpl")
public class ShikshaNiketanApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShikshaNiketanApplication.class, args);
	}
}
