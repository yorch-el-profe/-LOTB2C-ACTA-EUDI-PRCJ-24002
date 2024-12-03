package org.bedu.todo.model;

import org.hibernate.annotations.ColumnDefault;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    // La columna descripción es obligatoria
    @Column(nullable = false)
    private String description;

    @Column
    @ColumnDefault("false")
    private boolean completed;

    public String getDescription() {
        return description;
    }
    
    public void setDescription(String text) {
        this.description = text;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }
}
