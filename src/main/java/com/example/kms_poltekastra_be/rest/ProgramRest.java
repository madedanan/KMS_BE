package com.example.kms_poltekastra_be.rest;

import com.example.kms_poltekastra_be.service.MateriService;
import com.example.kms_poltekastra_be.service.ProgramService;
import com.example.kms_poltekastra_be.service.impl.MateriServiceImpl;
import com.example.kms_poltekastra_be.service.impl.ProgramServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@CrossOrigin
@RestController
@RequestMapping("/Program")
public class ProgramRest {
    @Autowired
    private ProgramService programService;

    public ProgramRest(ProgramServiceImpl programServiceImpl){
        this.programService = programServiceImpl;
    }

    @PostMapping("/GetDataKKByPIC")
    public String getDataKKByPIC(@RequestBody Map<String, Object> data){
        System.out.println("kk"+data);
        return programService.getDataKKByPIC(data);
    }
    @PostMapping("/GetProgramByKK")
    public String getDataProgramByKK(@RequestBody Map<String, Object> data){
        System.out.println("program"+data);
        return programService.getDataProgramByKK(data);
    }
    @PostMapping("/GetKategoriByProgram")
    public String getDataKategoriByProgram(@RequestBody Map<String, Object> data){
        System.out.println("kategori"+data);
        return programService.getDataKategoriByProgram(data);
    }
}
