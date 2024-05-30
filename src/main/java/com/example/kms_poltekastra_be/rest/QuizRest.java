package com.example.kms_poltekastra_be.rest;

import com.example.kms_poltekastra_be.service.QuizService;
import com.example.kms_poltekastra_be.service.impl.QuizServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@CrossOrigin
@RestController
@RequestMapping("/Quiz")
public class QuizRest {
    @Autowired
    private QuizService quizService;

    public QuizRest(QuizServiceImpl quizServiceImpl){
        this.quizService = quizServiceImpl;
    }

    @PostMapping("/GetDataQuestion")
    public String getDataQuestion(@RequestBody Map<String, Object> data){
        System.out.println("EAAA"+data);
        return quizService.getDataQuestion(data);
    }

    @PostMapping("/GetDataResultQuiz")
    public String getDataResultQuiz(@RequestBody Map<String, Object> data){
        System.out.println("EAAA"+data);
        return quizService.getDataResultQuiz(data);
    }

    @CrossOrigin
    @PostMapping("/SaveDataQuiz")
    public String saveDataQuiz(@RequestBody Map<String, Object> data) {
        System.out.println("quiz" + data);
        return quizService.saveDataQuiz(data);
    }

}
