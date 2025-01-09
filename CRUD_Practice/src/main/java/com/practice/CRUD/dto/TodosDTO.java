package com.practice.CRUD.dto;

import com.practice.CRUD.model.Todos;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class TodosDTO {
    private Integer id;
    private String content;
    private boolean completed;

    public static TodosDTO toTodosDTO(Todos todos){
        TodosDTO todosDTO = new TodosDTO();
        todosDTO.setId(todos.getId());
        todosDTO.setContent(todos.getContent());
        todosDTO.setCompleted(todos.isCompleted());

        return todosDTO;
    }
}
