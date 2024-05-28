package com.example.kms_poltekastra_be.service.impl;

import com.example.kms_poltekastra_be.repository.PolmanAstraRepository;
import com.example.kms_poltekastra_be.service.QuestionService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
@Transactional
public class QuestionServiceImpl implements QuestionService {
    @Autowired
    PolmanAstraRepository polmanAstraRepository;

    @Override
    public String saveDataQuestion(Map<String, Object> data) {
        System.out.println("Questions : " + data);
        List<String> questionList = new ArrayList<>();
        for (Map.Entry<String, Object> entry : data.entrySet()) {
            questionList.add(entry.getValue().toString());
        }
        String result = polmanAstraRepository.callProcedure("kms_createQuestion", questionList.toArray(new String[0]));
        System.out.println("ada" + questionList);
        return result;
    }
}
