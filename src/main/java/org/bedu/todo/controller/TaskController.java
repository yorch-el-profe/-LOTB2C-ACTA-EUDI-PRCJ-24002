package org.bedu.todo.controller;

import org.bedu.todo.model.Task;
import org.bedu.todo.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class TaskController {

    @Autowired
    private TaskRepository repository;

    /**
     * Método que guarda la tarea que recibe
     * del HTML en la base de datos y
     * redige al usuario a la página principal.
     * 
     * @return La redirección a la página principal.
     */
    @PostMapping("guardar")
    public String saveTask(@ModelAttribute("task") Task newTask) {

        // Guardando la tarea directamente en la base de datos
        repository.save(newTask);

        // Al final redirige el navegador a la página principal (/)
        return "redirect:/";
    }

}
