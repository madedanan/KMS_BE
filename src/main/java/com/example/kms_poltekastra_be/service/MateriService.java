package com.example.kms_poltekastra_be.service;

import java.util.Map;

public interface MateriService {

    public String getDataMateri(Map<String, Object> data);
    public String saveDataMateri(Map<String, Object> data);
    public String getListKategoriProgram(Map<String, Object> data);
    public String updateDataMateri(Map<String, Object> data);
    public String setStatusMateri(Map<String, Object> data);;
    public String saveProgresMateri(Map<String, Object> data);
    public String getProgresMateri(Map<String, Object> data);
}
