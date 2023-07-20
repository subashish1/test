package com.spring.security.springsecuritydemo.controller;

import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class EntryController {

    @GetMapping("/")
    public String hello(){
        return "hello";
    }

    @GetMapping("/csrfToken")
    public CsrfToken helloCsrf(HttpServletRequest httpServletRequest){
        return (CsrfToken) httpServletRequest.getAttribute("_csrf");
    }
}
