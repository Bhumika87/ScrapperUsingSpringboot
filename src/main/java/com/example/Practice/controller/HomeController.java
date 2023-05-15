package com.example.Practice.controller;

import com.example.Practice.model.Use;
import com.example.Practice.repository.UseRepo;
import com.example.Practice.service.ServiceLayer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    private final ServiceLayer serviceLayer;

    private UseRepo useRepo;
    public HomeController(ServiceLayer serviceLayer)
    {
        this.serviceLayer=serviceLayer;
    }
    @GetMapping("/")
    public ResponseEntity<?> getData(){

        return ResponseEntity.ok(serviceLayer.consumeAPI());

    }

}
