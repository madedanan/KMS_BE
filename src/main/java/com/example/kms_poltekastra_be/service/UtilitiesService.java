package com.example.kms_poltekastra_be.service;

import org.springframework.core.io.Resource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.multipart.MultipartFile;

import java.util.Map;

public interface UtilitiesService {
    public ResponseEntity<?> uploadFile(MultipartFile file);
    public ResponseEntity<Resource> downloadFile(String fileName);
    public ResponseEntity<byte[]> previewFile(String fileName);
}
