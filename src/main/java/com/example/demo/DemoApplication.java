package com.example.demo;

import com.example.demo.model.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);


        Student student = new Student(
                1,
                1,
                "Asuka",
                "Verduijn"
        );

        System.out.println(student);

    }
}
