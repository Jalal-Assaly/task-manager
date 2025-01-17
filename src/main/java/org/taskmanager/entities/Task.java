package org.taskmanager.entities;

import jakarta.persistence.*;
import lombok.Data;
import org.taskmanager.entities.enums.Priority;
import org.taskmanager.entities.enums.Status;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "tasks")
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
