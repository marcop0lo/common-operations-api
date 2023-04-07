package com.marcop0lo.base.controller;

import com.marcop0lo.base.dto.UserBaseDto;
import java.net.URI;
import java.util.concurrent.atomic.AtomicInteger;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {
    final static AtomicInteger ID = new AtomicInteger(); 
    @PostMapping
    public ResponseEntity<?> createUser(@RequestBody UserBaseDto user) {
        final String id = String.valueOf(ID.incrementAndGet());
        return ResponseEntity.created(URI.create(id)).build();
    }
}
