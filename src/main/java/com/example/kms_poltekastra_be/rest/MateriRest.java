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
//        System.out.println("EAAA"+data);
        return materiService.getDataMateri(data);
    }

    @PostMapping("/SaveDataMateri")
    public String saveDataMateri(@RequestBody Map<String, Object> data){
//        System.out.println("DAAA"+data);
        return materiService.saveDataMateri(data);
    }
    @PostMapping("/EditDataMateri")
    public String editDataMateri(@RequestBody Map<String, Object> data){
//        System.out.println("DAAA"+data);
        return materiService.updateDataMateri(data);
    }
    @PostMapping("/GetListKategoriProgram")
    public String getListKategoriProgram(@RequestBody Map<String, Object> data){
        return materiService.getListKategoriProgram(data);
    }

    @PostMapping("/setStatusMateri")
    public String setStatusMateri(@RequestBody Map<String, Object> data){
        System.out.println("Status: "+data);
        return materiService.setStatusMateri(data);
    }
}
