package org.bedu.todo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {

    /**
     * URL: http://localhost:8080/
     * 
     * Método que abre el archivo index.html
     * @return El nombre del archivo "index.html"
     */
    @GetMapping()
    public String index() {
        return "index.html";
    }    
}
