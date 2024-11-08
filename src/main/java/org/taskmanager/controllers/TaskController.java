package org.taskmanager.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.taskmanager.dtos.TaskDTO;
import org.taskmanager.services.TaskService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/task-manager-app")
public class TaskController {

    private final TaskService taskService;

    @GetMapping("/tasks")
    ResponseEntity<List<TaskDTO>> getAllTasks() {
        List<TaskDTO> taskDTOList = taskService.getAllTasks();
        return new ResponseEntity<>(taskDTOList, HttpStatus.OK);
    }

    @GetMapping("/tasks/{id}")
    ResponseEntity<TaskDTO> getTaskById(@RequestParam Integer id) {
        TaskDTO taskDTO = taskService.getTaskById(id);
        return new ResponseEntity<>(taskDTO, HttpStatus.OK);
    }
}
