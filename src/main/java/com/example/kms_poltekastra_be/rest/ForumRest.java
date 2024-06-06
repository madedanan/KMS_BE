package com.example.kms_poltekastra_be.rest;

import com.example.kms_poltekastra_be.service.ForumService;
import com.example.kms_poltekastra_be.service.MateriService;
import com.example.kms_poltekastra_be.service.impl.ForumServiceImpl;
import com.example.kms_poltekastra_be.service.impl.MateriServiceImpl;
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

    @PostMapping("/SaveDataForum")
    public String saveDataForum(@RequestBody Map<String, Object> data){
        System.out.println("FAAA"+data);
        return forumService.saveDataForum(data);
    }

    @PostMapping("/GetDataForum")
    public String getDataForum(@RequestBody Map<String, Object> data){
        System.out.println("FAAA"+data);
        return forumService.getDataForum(data);
    }

    @PostMapping("/SaveTransaksiForum")
    public String saveTransaksiForum(@RequestBody Map<String, Object> data){
        System.out.println("FAAA"+data);
        return forumService.saveTransaksiForum(data);
    }
}
