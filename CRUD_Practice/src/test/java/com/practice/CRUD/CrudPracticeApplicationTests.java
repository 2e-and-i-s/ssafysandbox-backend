package com.practice.CRUD;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.practice.CRUD.repository.TodosRepository;
import com.practice.CRUD.model.*;

import org.springframework.beans.factory.annotation.Autowired;


@SpringBootTest
class CrudPracticeApplicationTests {
	
	@Autowired
    private TodosRepository todosRepository; 
	
	@Test
	void contextLoads() {
		Todos t1 = new Todos();
		t1.setContent("빨래하기");
		this.todosRepository.save(t1);
		
		
	}

}
