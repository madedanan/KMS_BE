package com.example.kms_poltekastra_be.service;

import java.util.Map;

public interface MateriService {

    public String getDataMateri(Map<String, Object> data);
    public String saveDataMateri(Map<String, Object> data);
    public String getListKategoriProgram(Map<String, Object> data);
}
