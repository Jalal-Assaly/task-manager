package org.taskmanager.dtos.mappers;

import org.mapstruct.Mapper;
import org.taskmanager.dtos.UserDTO;
import org.taskmanager.entities.User;

@Mapper(componentModel = "spring")
public interface UserMapper {
    UserDTO userToUserDTO(User user);
    User userDTOToUser(UserDTO userDTO);
}
