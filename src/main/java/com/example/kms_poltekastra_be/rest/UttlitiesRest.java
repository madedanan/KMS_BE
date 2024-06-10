package com.example.kms_poltekastra_be.rest;

import com.example.kms_poltekastra_be.service.UtilitiesService;
import com.example.kms_poltekastra_be.service.impl.UtilitiesServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.Map;

@CrossOrigin
@RestController
@RequestMapping("/Utilities")
public class UttlitiesRest {

    @Autowired
    private UtilitiesService utilitiesService;

    public UttlitiesRest(UtilitiesServiceImpl utilitiesServiceImpl) {
        this.utilitiesService = utilitiesServiceImpl;
    }

    @PostMapping("/Upload")
    public ResponseEntity<?> UploadFile (@RequestBody MultipartFile file){
        return utilitiesService.uploadFile(file);
    }

    @GetMapping("/Upload/DownloadFile")
    public ResponseEntity<Resource> downloadFile(@RequestParam String namaFile) {
        return utilitiesService.downloadFile(namaFile);
    }

    @GetMapping("/Upload/PreviewFile")
    public ResponseEntity<byte[]> previewFile(@RequestParam String namaFile) {
        return utilitiesService.previewFile(namaFile);
    }
}
