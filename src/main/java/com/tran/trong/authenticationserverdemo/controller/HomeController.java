package com.tran.trong.authenticationserverdemo.controller;

import java.security.Principal;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/home")
public class HomeController {
    @GetMapping(value="")
    public String home(@RequestParam String param) {
        return "Hello "+ param;
    }

    @GetMapping(value="/authorize")
    public ResponseEntity<Principal> authoried(Principal principal) {
        System.out.println(principal);
        return ResponseEntity.ok().body(principal);
    }
    
    
}
