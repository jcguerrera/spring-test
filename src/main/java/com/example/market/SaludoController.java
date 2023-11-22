package com.example.market;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/index")
public class SaludoController {
    @GetMapping("/hola")
    public String saludar(){
        return "Buenas Buenas";
    }
}
