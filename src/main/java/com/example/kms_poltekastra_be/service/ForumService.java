package com.example.kms_poltekastra_be.service;

import java.util.Map;

public interface ForumService {

    public String getDataForum(Map<String, Object> data);
    public String saveTransaksiForum(Map<String, Object> data);
    public String saveDataForum(Map<String, Object> data);
}
