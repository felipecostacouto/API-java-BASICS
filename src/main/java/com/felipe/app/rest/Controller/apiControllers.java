package com.felipe.app.rest.Controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class apiControllers {

    @GetMapping(value = "/")
    public String getPage() {
        return "Welcome";
    }
}
