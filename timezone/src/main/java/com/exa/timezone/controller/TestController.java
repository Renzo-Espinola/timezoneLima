package com.exa.timezone.controller;

import com.exa.timezone.service.DateService;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    private final com.exa.timezone.service.DateService dateService;

    public TestController(DateService dateService) {
        this.dateService = dateService;
    }

    @GetMapping("/Gettime")
    public ResponseEntity<String> getTime() {
         return  ResponseEntity.ok(dateService.obtenerFechaHora());
    }
}
