package com.practice.CRUD.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.practice.CRUD.model.Todos;

public interface TodosRepository extends JpaRepository<Todos, Integer> {

}
