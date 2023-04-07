package com.marcop0lo.base.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.io.InputStream;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/any")
public class AnyController {

    @Autowired
    private ResourceLoader resourceLoader;

    @GetMapping
    public ResponseEntity<Object> getAny() throws IOException {
        final Resource resource = resourceLoader.getResource("classpath:static/any_response.json");
        final InputStream inputStream = resource.getInputStream();
        final ObjectMapper objectMapper = new ObjectMapper();
        Object any = objectMapper.readValue(inputStream, Object.class);
        return ResponseEntity.ok(any);
    }
}
