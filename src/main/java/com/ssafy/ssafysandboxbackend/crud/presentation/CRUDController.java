package com.ssafy.ssafysandboxbackend.crud.presentation;

import com.ssafy.ssafysandboxbackend.crud.dto.CreateTodoRequest;
import com.ssafy.ssafysandboxbackend.crud.dto.TodoListResponse;
import com.ssafy.ssafysandboxbackend.crud.service.CRUDService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/todos")
public class CRUDController {

    private final CRUDService crudService;

    @GetMapping()
    public ResponseEntity<TodoListResponse> getTodos() {
        TodoListResponse result = crudService.getTodos();
        return ResponseEntity.ok().body(result);
    }

    @PostMapping()
    public ResponseEntity<?> createTodo(@RequestBody CreateTodoRequest body){
        String content = body.getContent();
        crudService.createTodo(content);
        return ResponseEntity.created(null).build();
    }

    @PatchMapping("/{todoId}")
    public ResponseEntity<?> updateTodo(@PathVariable long todoId){
        try {
            crudService.updateTodo(todoId);
        } catch (Exception e) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.created(null).build();
    }

    @DeleteMapping("/{todoId}")
    public ResponseEntity<?> deleteTodo(@PathVariable long todoId){
        crudService.deleteTodoById(todoId);
        return ResponseEntity.noContent().build();
    }
}
