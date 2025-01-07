package com.ssafy.ssafysandboxbackend.crud.service;

import com.ssafy.ssafysandboxbackend.crud.dto.CreateTodoRequest;
import com.ssafy.ssafysandboxbackend.crud.dto.TodoListResponse;
import com.ssafy.ssafysandboxbackend.crud.dto.TodoVo;
import com.ssafy.ssafysandboxbackend.crud.repository.TodoRepository;
import com.ssafy.ssafysandboxbackend.crud.repository.domain.Todo;
import lombok.RequiredArgsConstructor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class CRUDService {

    private final CrudRepository crudRepository;
    private final TodoRepository todoRepository;

    @Transactional(readOnly = true)
    public TodoListResponse getTodos(){
        List<TodoVo> todos = todoRepository.findAllProjectsBy();
        return TodoListResponse.from(todos);
    }

    public void createTodo(String content) {
        Todo todo = Todo.builder()
                .content(content)
                .completed(false)
                .build();

        todoRepository.save(todo);
    }
}
