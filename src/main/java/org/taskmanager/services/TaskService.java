package org.taskmanager.services;

import jakarta.persistence.EntityExistsException;
import jakarta.persistence.EntityNotFoundException;
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

    public TaskDTO getTaskById(Integer id) {
        Task task = taskRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Task was not found"));
        return taskMapper.taskToTaskDTO(task);
    }

    public void addTask(TaskDTO taskDTO) {
        Task task = taskMapper.taskDTOToTask(taskDTO);
        if (taskRepository.existsById(task.getId())) {
            throw new EntityExistsException("Task already exists");
        }
        taskRepository.save(task);
    }
}
