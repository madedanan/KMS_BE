package com.example.kms_poltekastra_be.rest;

import com.example.kms_poltekastra_be.service.ForumService;
import com.example.kms_poltekastra_be.service.impl.ForumServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@CrossOrigin
@RestController
@RequestMapping("/Forum")
public class ForumRest {
    @Autowired
    private ForumService forumService;

    public ForumRest(ForumServiceImpl forumServiceImpl){
        this.forumService = forumServiceImpl;
    }

    @PostMapping("/GetDataForum")
    public String getDataQuestion(@RequestBody Map<String, Object> data){
        System.out.println("EAAA"+data);
        return forumService.getDataForum(data);
    }

    @PostMapping("/SaveTransaksiForum")
    public String getDataResultForum(@RequestBody Map<String, Object> data){
        System.out.println("EAAA"+data);
        return forumService.saveTransaksiForum(data);
    }

    @CrossOrigin
    @PostMapping("/SaveDataForum")
    public String saveDataForum(@RequestBody Map<String, Object> data){
        System.out.println("DAAA"+data);
        return forumService.saveDataForum(data);
    }

}
