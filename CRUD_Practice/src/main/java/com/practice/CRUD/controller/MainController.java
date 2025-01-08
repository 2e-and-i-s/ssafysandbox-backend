package com.practice.CRUD.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {
	@GetMapping("/todos")
    @ResponseBody
    public String read() {
        return "Read";
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
