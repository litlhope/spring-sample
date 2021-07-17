package com.budit.sample.springsample.controller;

import com.google.common.net.HttpHeaders;
import io.swagger.annotations.Api;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

@Slf4j
@RequiredArgsConstructor
@RestController
@Api("파일 처리 API V1")
@RequestMapping("/file")
public class FileController {
    @GetMapping("")
    public ResponseEntity<Resource> downloadFile() {
        // FIXME: 다운로드 할 파일의 경로를 입력해 주세요.
        String fileFullPath = "/Volumes/litlhdd/project/bud-it/study/SpringSample/data/sample.pdf";
        File file = new File(fileFullPath);
        Resource resource = new FileSystemResource(file);

        return ResponseEntity.ok()
                .contentType(MediaType.parseMediaType("application/octet-stream"))
                .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"sample.pdf\"")
                .body(resource);
    }
}
