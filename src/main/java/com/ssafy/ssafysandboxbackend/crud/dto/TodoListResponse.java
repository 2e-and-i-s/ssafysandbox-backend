package com.ssafy.ssafysandboxbackend.crud.dto;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class TodoListResponse {
    private final List<TodoVo> todos;

    public static TodoListResponse from(List<TodoVo> todos){
        return new TodoListResponse(todos);
    }
}
