package com.pv.jwtHW.controller;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@RestController
@Validated
@RequestMapping("/api/hello")
public class HelloController {

    @GetMapping("/all")
    public String helloAll() {
        return "Hello All!";
    }

    @GetMapping("/user")
    public String helloUser() {
        return "Hello User!";
    }

    @GetMapping("/admin")
    public String helloAdmin() {
        return "Hello Admin!";
    }
}
