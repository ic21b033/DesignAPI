package fhtw.at.DesignAPI.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import static fhtw.at.DesignAPI.DesignApiApplication.findColor;
@RestController
public class Controller {

    @GetMapping("/{color}")
    String capital(@PathVariable String color) {
        return findColor(color);
    }
}
