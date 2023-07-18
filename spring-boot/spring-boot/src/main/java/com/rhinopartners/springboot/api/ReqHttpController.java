package com.rhinopartners.springboot.api;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/app")
public class ReqHttpController {

    @PostMapping
    public void create() {
    }

}

