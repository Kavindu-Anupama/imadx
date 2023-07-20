package com.rhinopartners.springboot.api;


import org.springframework.web.bind.annotation.*;
import java.lang.String;

@RestController
@CrossOrigin
@RequestMapping("api/v1/app")
public class ReqHttpController {

    @PostMapping
    public String create() {
        return "create working";
    }

    @GetMapping
    public String read() {
        return "read working";
    }

    @PatchMapping
    public String update() {
        return "update working";
    }

    @DeleteMapping
    public String delete() {
        return "delete working";
    }

}

