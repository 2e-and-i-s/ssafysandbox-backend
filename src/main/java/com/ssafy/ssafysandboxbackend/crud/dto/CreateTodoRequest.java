package com.ssafy.ssafysandboxbackend.crud.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class CreateTodoRequest {
    private String content;

    public static CreateTodoRequest from(String content){
        return new CreateTodoRequest(content);
    }
}
