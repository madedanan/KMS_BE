package com.example.kms_poltekastra_be.service.impl;

import com.example.kms_poltekastra_be.repository.PolmanAstraRepository;
import com.example.kms_poltekastra_be.service.QuizService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
@Transactional
public class QuizServiceImpl implements QuizService {
    @Autowired
    PolmanAstraRepository polmanAstraRepository;

    @Override
    public String getDataQuestion(Map<String, Object> data){
        List<String> quizList = new ArrayList<>();
        for(Map.Entry<String, Object>entry : data.entrySet()){
            quizList.add(entry.getValue().toString());
        }
        String result = polmanAstraRepository.callProcedure("kms_getDataQuestion", quizList.toArray(new String[0]));
        return result;
    }

    @Override
    public String getDataResultQuiz(Map<String, Object> data){
        List<String> quizList = new ArrayList<>();
        for(Map.Entry<String, Object>entry : data.entrySet()){
            quizList.add(entry.getValue().toString());
        }
        String result = polmanAstraRepository.callProcedure("kms_getDataResultQuiz", quizList.toArray(new String[0]));
        return result;
    }

    @Override
    public String saveDataQuiz(Map<String, Object> data){
        System.out.println("Quiz : "+data);
        List<String> quizList = new ArrayList<>();
        for(Map.Entry<String, Object>entry : data.entrySet()){
            quizList.add(entry.getValue().toString());
        }
        String result = polmanAstraRepository.callProcedure("kms_createTransaksiQuiz", quizList.toArray(new String[0]));
        System.out.println("adada"+quizList);
        return result;
    }
}
