package com.example.todoapi.services;

import com.example.todoapi.entity.Task;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskServiceImpl implements TaskService {
    @Override
    public List<Task> GetTaskAll() {
        return null;
    }

    @Override
    public String PostTask(Task task) {
        return null;
    }

    @Override
    public List<Task> DeleteTask(Long id) {
        return null;
    }

    @Override
    public List<Task> PutTask(Task task, Long id) {
        return null;
    }
}
