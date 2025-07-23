package dev.pet.todolist.mapper;

import dev.pet.todolist.dto.request.UserCreateRequest;
import dev.pet.todolist.dto.request.UserUpdateRequest;
import dev.pet.todolist.dto.response.UserResponse;
import dev.pet.todolist.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;


@Mapper(componentModel="spring")
public interface UserMapper {
    User toUser(UserCreateRequest request);

    UserResponse toUserResponse(User user);

    void updateUser(@MappingTarget User user, UserUpdateRequest request);
}
