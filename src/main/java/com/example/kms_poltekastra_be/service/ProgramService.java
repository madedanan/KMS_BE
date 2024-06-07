package com.example.kms_poltekastra_be.service;

import java.util.Map;

public interface ProgramService {
    public String getDataKKByPIC(Map<String, Object> data);
    public String getDataProgramByKK(Map<String, Object> data);
    public String getDataKategoriByProgram(Map<String, Object> data);

    public String countAnggotaByKK(Map<String, Object> data);
    public String countProgramByKK(Map<String, Object> data);
    public String countMateriByKategori(Map<String, Object> data);

    public String getDataKategoriKKById(Map<String, Object> data);
}
