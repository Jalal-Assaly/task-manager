package org.taskmanager.dtos.mappers;

import org.mapstruct.Mapper;
import org.taskmanager.dtos.TaskDTO;
import org.taskmanager.entities.Task;

@Mapper(componentModel = "spring")
public interface TaskMapper {
    TaskDTO taskToTaskDTO(Task task);
    Task taskDTOToTask(TaskDTO taskDTO);
}
