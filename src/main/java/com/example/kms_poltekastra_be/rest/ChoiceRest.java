package com.example.kms_poltekastra_be.rest;

import com.example.kms_poltekastra_be.service.ChoiceService;
import com.example.kms_poltekastra_be.service.impl.ChoiceServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@CrossOrigin
@RestController
@RequestMapping("/Choices")
public class ChoiceRest {
    @Autowired
    private ChoiceService choiceService;

    public ChoiceRest(ChoiceServiceImpl choiceServiceImpl){
        this.choiceService = choiceServiceImpl;
    }

    @PostMapping("/SaveDataChoice")
    public String saveDataChoice(@RequestBody Map<String, Object> data) {
        System.out.println("ADA" + data);
        return choiceService.saveDataChoice(data);
    }
}