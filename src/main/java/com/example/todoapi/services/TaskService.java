package com.example.todoapi.services;

import com.example.todoapi.entity.Task;

import java.util.List;

public interface TaskService {
    List<Task> GetTaskAll();

    String PostTask(Task task);

    List<Task> DeleteTask(Long id);

    List<Task> PutTask(Task task, Long id);
}
