package com.example.kms_poltekastra_be.service.impl;

import com.example.kms_poltekastra_be.repository.PolmanAstraRepository;
import com.example.kms_poltekastra_be.service.MateriService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
@Transactional
public class MateriServiceImpl implements MateriService {
    @Autowired
    PolmanAstraRepository polmanAstraRepository;

    @Override
    public String getDataMateri(Map<String, Object> data){
        List<String> materiList = new ArrayList<>();
        for(Map.Entry<String, Object>entry : data.entrySet()){
            materiList.add(entry.getValue().toString());
        }
        String result = polmanAstraRepository.callProcedure("kms_getDataMateri", materiList.toArray(new String[0]));
        return result;
    }

    @Override
    public String saveDataMateri(Map<String, Object> data){
        System.out.println("Materis : "+data);
        List<String> materiList = new ArrayList<>();
        for(Map.Entry<String, Object>entry : data.entrySet()){
            materiList.add(entry.getValue().toString());
        }
        String result = polmanAstraRepository.callProcedure("kms_createMateri", materiList.toArray(new String[0]));
        System.out.println(materiList);
        return result;
    }
    @Override
    public String getListKategoriProgram(Map<String, Object> data) {
        List<String> dataList = new ArrayList<>();
        for(Map.Entry<String, Object>entry : data.entrySet()){
            dataList.add(entry.getValue().toString());
        }
        String result = polmanAstraRepository.callProcedure("kms_getDataKategoriProgram", dataList.toArray(new String[0]));
        return result;
    }
}
