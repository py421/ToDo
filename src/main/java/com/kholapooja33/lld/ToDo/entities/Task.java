package com.kholapooja33.lld.ToDo.entities;

import java.util.UUID;

enum TaskStatus{
    NEW,PROGRESS,COMPLETE;
};
public class Task {
    private String  id ;
    private String title;
    private TaskStatus status;
    private String description;

    public Task(String title,String description) {
        this.id  = UUID.randomUUID().toString();
        this.title = title;
        this.status = TaskStatus.NEW;
        this.description = description;
    }


    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public TaskStatus getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return "Task{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", status=" + status +
                ", description='" + description + '\'' +
                '}';
    }

    public void setStatus(TaskStatus status) {
        this.status = status;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
