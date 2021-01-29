package com.example.springangularhelloworld.controller;

import org.eclipse.jdt.annotation.Nullable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springangularhelloworld.service.HelloWorldService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class HelloWorldController {

    private final HelloWorldService helloWorldService;

    @GetMapping("helloworld")
    public @Nullable String helloworld() {
        return helloWorldService.getValue();
    }
}
