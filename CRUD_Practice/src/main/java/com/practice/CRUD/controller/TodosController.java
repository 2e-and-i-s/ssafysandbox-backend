package com.practice.CRUD.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.practice.CRUD.model.Todos;
import com.practice.CRUD.service.TodosService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Controller
public class TodosController {
	private final TodosService todosService;
	
	@GetMapping("/todos")
    public List<Todos> read() {
		 return todosService.getList();
    }
	
	@PostMapping("/todos")
    @ResponseBody
    public String create() {
        return "Create";
    }
	
	@PatchMapping("/todos/{todoId}")
    @ResponseBody
    public String update() {
        return "Update";
    }
	
	@DeleteMapping("/todos/{todoId}")
    @ResponseBody
    public String delete() {
        return "Delete";
    }
}
