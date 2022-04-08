package com.kholapooja33.lld.ToDo.dao;

import com.kholapooja33.lld.ToDo.entities.Task;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Component
public class TaskDaoService {
    private HashMap<String,Task> tasks = new HashMap<>();
    public String save(Task task){
        tasks.put(task.getId(),task);
        return task.getId();
    }
    public List<Task>retrieveTasks(){
        return tasks.values().stream().toList();
    }

    public Task retrieveTaskByID(String id) {
        if(!tasks.containsKey(id)){
            return null;
            // throw tasknotfoundexception
        }
        return tasks.get(id);
    }

    public Task deleteTaskById(String id){
        if(!tasks.containsKey(id)){
            return null;
            // throw tasknotfoundexception
        }
        return tasks.remove(id);
    }
}
