package org.bedu.todo.model;

public class Task {
    private String description;
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
