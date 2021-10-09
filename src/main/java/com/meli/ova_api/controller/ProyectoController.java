package com.meli.ova_api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/proyect")
public class ProyectoController {

    @GetMapping("/ping")
    public String test() {
        return "pong";
    }
}
