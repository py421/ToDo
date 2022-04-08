package com.kholapooja33.lld.ToDo.controllers;

import com.kholapooja33.lld.ToDo.dao.TaskDaoService;
import com.kholapooja33.lld.ToDo.entities.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TaskController {
    @Autowired
    private TaskDaoService taskDaoService;

    @PostMapping("/tasks")
    public String createTask(@RequestBody Task task){
        return taskDaoService.save(task);
    }

    @GetMapping("/tasks")
    public List<Task>retrieveTasks(){
        return taskDaoService.retrieveTasks();
    }

    @GetMapping("/tasks/{id}")
    public Task retrieveTaskByID(@PathVariable String id){
        return taskDaoService.retrieveTaskByID(id);
    }

    @DeleteMapping("/tasks/{id}")
    public Task deleteTaskById(@PathVariable String id){
        return taskDaoService.deleteTaskById(id);
    }

//    @PutMapping("/tasks/{id}")
//    public void updateTaskByID(@RequestBody Task task ) {
//    }
}
