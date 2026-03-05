package org.example.awsstudy.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RequiredArgsConstructor
@RestController
@RequestMapping("/hello")
public class HelloController {

    @GetMapping
    public String hello(){
        log.info("Hello AWS");
        return "Hello AWS";
    }
}
