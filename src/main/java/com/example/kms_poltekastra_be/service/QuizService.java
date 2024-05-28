package com.example.kms_poltekastra_be.service;

import java.util.Map;

public interface QuizService {

    public String getDataQuestion(Map<String, Object> data);
    public String getDataResultQuiz(Map<String, Object> data);
    public String saveDataQuiz(Map<String, Object> data);
}
