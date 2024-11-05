package org.taskmanager.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.taskmanager.dtos.TaskDTO;
import org.taskmanager.dtos.mappers.TaskMapper;
import org.taskmanager.entities.Task;
import org.taskmanager.repositories.TaskRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TaskService {

    private final TaskRepository taskRepository;
    private final TaskMapper taskMapper;

    public List<TaskDTO> getAllTasks() {
        return taskRepository.findAll()
                .stream().map(taskMapper::taskToTaskDTO)
                .toList();
    }



}
