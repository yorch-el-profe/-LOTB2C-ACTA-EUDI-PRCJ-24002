package org.bedu.todo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.bedu.todo.model.Task;

@Controller
public class WebController {

    /**
     * URL: http://localhost:8080/
     * 
     * Método que abre el archivo index.html.
     * 
     * La clase Model (del paquete de Spring) se utiliza
     * para enviar datos de Java al HTML.
     * 
     * @return El nombre del archivo "index.html"
     */
    @GetMapping()
    public String index(Model model) {
        Task empty = new Task();

        // Enviando un String llamado "author" al HTML
        model.addAttribute("author", "Jorge :)");

        // Enviando un objeto llamado "task" al HTML
        model.addAttribute("task", empty);

        return "index.html";
    }    
}
