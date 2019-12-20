package com.example.myapplicationtetsintbook;

import java.util.ArrayList;
import java.util.List;

public class Examenator {
    List <String> GetExams(String a) {
        List<String> ExamList = new ArrayList<>();
            if (a.equals("Math")) {
                ExamList.add("18");
                ExamList.add("Cool!");
            }
            if (a.equals("Physics")) {
                ExamList.add("33");
                ExamList.add("Cool!");
            }
            if (a.equals("Informatics")) {
                ExamList.add("70");
                ExamList.add("Cool!");
            }
            return ExamList;
    }
}
