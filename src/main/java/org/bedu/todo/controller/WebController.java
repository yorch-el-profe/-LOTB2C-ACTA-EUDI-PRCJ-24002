package org.bedu.todo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

import org.bedu.todo.model.Task;
import org.bedu.todo.repository.TaskRepository;

@Controller
public class WebController {

    @Autowired
    private TaskRepository repository;

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

        // Recuperando todas las tareas de la base de datos
        List<Task> tasks = repository.findAll();

        // Enviando un String llamado "author" al HTML
        model.addAttribute("author", "Bedu");

        // Enviando un objeto llamado "task" al HTML
        model.addAttribute("task", empty);

        // Enviando una lista de tareas llamada "tasks" al HTML
        model.addAttribute("tasks", tasks);

        return "index.html";
    }    
}
