package com.example.kms_poltekastra_be.rest;

import com.example.kms_poltekastra_be.service.MateriService;
import com.example.kms_poltekastra_be.service.impl.MateriServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@CrossOrigin
@RestController
@RequestMapping("/Materis")
public class MateriRest {
    @Autowired
    private MateriService materiService;

    public MateriRest(MateriServiceImpl materiServiceImpl){
        this.materiService = materiServiceImpl;
    }

    @PostMapping("/GetDataMateri")
    public String getDataMateri(@RequestBody Map<String, Object> data){
        System.out.println("EAAA"+data);
        return materiService.getDataMateri(data);
    }

    @CrossOrigin
    @PostMapping("/SaveDataMateri")
    public String saveDataMateri(@RequestBody Map<String, Object> data){
        System.out.println("DAAA"+data);
        return materiService.saveDataMateri(data);
    }

    @PostMapping("/GetProgresMateri")
    public String getProgresMateri(@RequestBody Map<String, Object> data){
        System.out.println("EAAA"+data);
        return materiService.getProgresMateri(data);
    }

    @CrossOrigin
    @PostMapping("/SaveProgresMateri")
    public String saveProgresMateri(@RequestBody Map<String, Object> data){
        System.out.println("DAAA"+data);
        return materiService.saveProgresMateri(data);
    }

    @CrossOrigin
    @PostMapping("/UpdateProgresMateri")
    public String updateProgresMateri(@RequestBody Map<String, Object> data){
        System.out.println("DAAA"+data);
        return materiService.updateProgresMateri(data);
    }
}
