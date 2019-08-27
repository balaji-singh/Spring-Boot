package com.masterjavaonline.graphql;

import com.masterjavaonline.graphql.model.Student;
import com.masterjavaonline.graphql.service.StudentService;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.stream.Stream;

@SpringBootApplication
public class SpringbootGraphqlGuiAnnotationsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootGraphqlGuiAnnotationsApplication.class, args);
	}

	@Bean
	ApplicationRunner init(StudentService studentService) {
		return args -> {
			Stream.of("Bala S Singh", "Vimal Tiwari", "Dragan Gaic").forEach(name -> {
				Student student = new Student();
				student.setName(name);
				studentService.addStudent(student);
			});
			studentService.getStudents().forEach(System.out::println);
		};
	}
}

