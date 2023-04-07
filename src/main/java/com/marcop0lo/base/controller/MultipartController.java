package com.marcop0lo.base.controller;

import com.marcop0lo.base.dto.UserBaseDto;
import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/multiparts")
public class MultipartController {

    @PostMapping
    public ResponseEntity<String> createUser(
        UserBaseDto user,
        @RequestParam("files") List<MultipartFile> files
    ) {
        // Code to handle user creation and file processing
        return ResponseEntity.ok("User created successfully");
    }
}
