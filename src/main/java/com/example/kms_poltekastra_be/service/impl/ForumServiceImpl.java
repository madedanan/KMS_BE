package com.example.kms_poltekastra_be.service.impl;

import com.example.kms_poltekastra_be.repository.PolmanAstraRepository;
import com.example.kms_poltekastra_be.service.ForumService;
import com.example.kms_poltekastra_be.service.MateriService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
@Transactional
public class ForumServiceImpl implements ForumService {
    @Autowired
    PolmanAstraRepository polmanAstraRepository;

    @Override
    public String saveDataForum(Map<String, Object> data) {
        System.out.println("Forums : "+data);
        List<String> forumList = new ArrayList<>();
        for(Map.Entry<String, Object>entry : data.entrySet()){
            forumList.add(entry.getValue().toString());
        }
        String result = polmanAstraRepository.callProcedure("kms_createForum", forumList.toArray(new String[0]));
        System.out.println(forumList);
        return result;
    }

    @Override
    public String updateDataForum(Map<String, Object> data) {
        List<String> forumList = new ArrayList<>();
        for(Map.Entry<String, Object>entry : data.entrySet()){
            forumList.add(entry.getValue().toString());
        }
        String result = polmanAstraRepository.callProcedure("kms_editForum", forumList.toArray(new String[0]));
        System.out.println(forumList);
        return result;
    }

    @Override
    public String getDataForum(Map<String, Object> data) {
        System.out.println("Forums : "+data);
        List<String> forumList = new ArrayList<>();
        for(Map.Entry<String, Object>entry : data.entrySet()){
            forumList.add(entry.getValue().toString());
        }
        String result = polmanAstraRepository.callProcedure("kms_getDataForum", forumList.toArray(new String[0]));
        System.out.println(forumList);
        return result;
    }

    @Override
    public String getDataForumByMateri(Map<String, Object> data) {
        System.out.println("ForumsByMateri : "+data);
        List<String> forumList = new ArrayList<>();
        for(Map.Entry<String, Object>entry : data.entrySet()){
            forumList.add(entry.getValue().toString());
        }
        String result = polmanAstraRepository.callProcedure("kms_getDataForumByMateri", forumList.toArray(new String[0]));
        System.out.println("ForumsByMateridd : "+forumList);
        return result;
    }

    @Override
    public String saveTransaksiForum(Map<String, Object> data) {
        System.out.println("Forums : "+data);
        List<String> forumList = new ArrayList<>();
        for(Map.Entry<String, Object>entry : data.entrySet()){
            forumList.add(entry.getValue().toString());
        }
        String result = polmanAstraRepository.callProcedure("kms_saveTransaksiForum", forumList.toArray(new String[0]));
        System.out.println(forumList);
        return result;
    }
}
