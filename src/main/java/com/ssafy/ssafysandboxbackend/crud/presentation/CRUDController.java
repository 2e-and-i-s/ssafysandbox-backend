package com.ssafy.ssafysandboxbackend.crud.presentation;

import com.ssafy.ssafysandboxbackend.crud.dto.TodoListResponse;
import com.ssafy.ssafysandboxbackend.crud.service.CRUDService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
