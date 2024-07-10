package com.example.todoapi.services;

import com.example.todoapi.entity.Task;
import com.example.todoapi.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskServiceImpl implements TaskService {

    @Autowired
    public TaskRepository taskRepository;

    @Override
    public List<Task> GetTaskAll() {
        return taskRepository.findAll();
    }

    @Override
    public List<Task> PostTask(Task task) {
        taskRepository.save(task);
        return GetTaskAll();
    }

    @Override
    public List<Task> DeleteTask(Long id) {
        taskRepository.deleteById(id);
        return GetTaskAll();
    }

    @Override
    public List<Task> PutTask(Task task, Long id) {
        Task taskPut = taskRepository.findById(id).get();
        if (taskPut.getId() != null) {
            taskPut.setName(task.getName());
            taskRepository.save(taskPut);
        }
        return GetTaskAll();
    }
}
