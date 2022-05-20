package kz.dar.tech.secure.tempate.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/template")
public class TemplateController {

    @GetMapping("/healthcheck")
    public String healthCheck() {
        return "Hello! It's work!";
    }

}
