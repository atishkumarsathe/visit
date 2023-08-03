package com.example.tour;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Docker {
    @GetMapping("/Docker")
    public String getData() {return  "Docker-engine runs the docker-daemon which does heavy lifting of creating, " +
            "deleting, and managing containers."; }
}