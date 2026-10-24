package com.example.demo.controller;

import com.example.demo.model.Student;
import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.DocumentReference;
import com.google.cloud.firestore.Firestore;
import com.google.cloud.firestore.WriteResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.ExecutionException;

@RestController
public class StudentController {

    private Firestore db;

    public StudentController(Firestore db) {
        this.db = db;
    }


    Student student = new Student(
            1,
            1,
            "Asuka",
            "Verduijn"
    );

    @PostMapping("/Student")
    public Student saveStudent()
        throws ExecutionException, InterruptedException {
        DocumentReference docRef = db.collection("students").document("1");

        Student student = new Student(
                1,
                1,
                "Asuka",
                "Verduijn"
        );

        ApiFuture<WriteResult> result  = docRef.set(student);
        System.out.println("Update time" + result.get().getUpdateTime());

        return student;
    }
}
