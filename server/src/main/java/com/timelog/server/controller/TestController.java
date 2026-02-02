package com.timelog.server.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.tags.Param;

import com.timelog.server.models.Test;
import com.timelog.server.repositories.TestRepository;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
public class TestController {

    TestRepository testRepository;
    
    @GetMapping("/api/ping")
    public String pong() {
        return "pong";
    }

    @GetMapping("/api/test/{id}")
    public Test tryGet(Param id) {
        Long i = Long.parseLong(id.getValue());
        return testRepository.getReferenceById(i);
    }

    @PostMapping("/api/test/{id}")
    public boolean tryInsert(Param id) {
        var inserted = testRepository.save(new Test(1L, "test"));
        
        if(inserted != null) {
            return true;
        } else {
            return false;
        }
    }

}
