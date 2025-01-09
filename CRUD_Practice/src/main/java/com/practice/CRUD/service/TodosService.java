package com.practice.CRUD.service;

import java.util.List;

import com.practice.CRUD.model.Todos;
import com.practice.CRUD.repository.TodosRepository;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class TodosService {
    private final TodosRepository todosRepository;

    public List<Todos> getList() {
    	System.out.println("Fetching todos...");
        return this.todosRepository.findAll();
    }
}
