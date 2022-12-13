package pe.com.polleria_peperos.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class registroController {
    @GetMapping("/login")
    public String IniciarSesion(){
        return "login";
    }
}
