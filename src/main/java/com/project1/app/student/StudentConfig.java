package com.project1.app.student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {
	
	@Bean
	CommandLineRunner commandLineRunner(StudentRepository repository) {
		return args -> {
			Student mariam = new Student("Mariam", "mariam@gmail.com",LocalDate.of(1997,Month.JUNE,3));
			
			Student john =  new Student("John", "john@gmail.com",LocalDate.of(1994,Month.JANUARY,9));
			Student alex =  new Student("Alex", "alex@gmail.com",LocalDate.of(1999,Month.JULY,9));
			
			repository.saveAll(List.of(mariam, john, alex));
		};
	}
}
