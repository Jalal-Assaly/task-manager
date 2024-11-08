package org.taskmanager.dtos;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.NotNull;
import org.taskmanager.entities.enums.Priority;
import org.taskmanager.entities.enums.Status;

import java.time.LocalDateTime;

public class TaskDTO {
    private Integer id;
    private String name;
    private String description;
    private LocalDateTime dueDate;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private Status status;
    private Priority priority;
    private String tags;
    private Integer timeSpent;
    private Boolean recurring;
}
