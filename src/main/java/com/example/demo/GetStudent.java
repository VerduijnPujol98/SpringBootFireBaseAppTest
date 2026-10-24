package com.example.demo;

import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.Firestore;
import com.google.cloud.firestore.QueryDocumentSnapshot;
import com.google.cloud.firestore.QuerySnapshot;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.concurrent.ExecutionException;

@RestController
public class GetStudent {

    private Firestore db;

    public GetStudent(Firestore db) {
        this.db = db;
    }
    @GetMapping("/getStudent")
            public void getStudent() throws ExecutionException, InterruptedException {
            ApiFuture<QuerySnapshot> queryStudent =
                    db.collection("students").get();

        QuerySnapshot querySnapshot = queryStudent.get();
            for (QueryDocumentSnapshot document : querySnapshot.getDocuments()) {
                System.out.println(document.getData().toString());
            }

            return;


    }

}
