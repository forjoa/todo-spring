package com.example.todoapi.controller;

import com.example.todoapi.entity.Task;
import com.example.todoapi.services.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/api/task")
public class TaskController {

    @Autowired
    public TaskService taskService;

    @GetMapping
    public ResponseEntity<List<Task>> getTasks() {
        return ResponseEntity.ok(taskService.GetTaskAll());
    }

    @PostMapping
    public ResponseEntity<String> postTask(@RequestBody Task task) {
        return ResponseEntity.ok(taskService.PostTask(task));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<List<Task>> deleteTask(@PathVariable Long id) {
        return ResponseEntity.ok(taskService.DeleteTask(id));
    }

    @PutMapping("/{id}")
    public ResponseEntity<List<Task>> editTask(@RequestBody Task task, @PathVariable Long id) {
        return ResponseEntity.ok(taskService.PutTask(task, id));
    }

}
