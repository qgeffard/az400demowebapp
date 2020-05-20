package com.in28minutes.springboot;

import com.in28minutes.springboot.model.Student;
import com.in28minutes.springboot.service.StudentService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class StudentServicesApplicationTests {

	@Autowired
	StudentService service;

	@Test
	public void checkStudent() {

		List<Student> students = service.allStudent();

		assertThat(students.get(0).getId()).isEqualTo("Student1");

	}

}
