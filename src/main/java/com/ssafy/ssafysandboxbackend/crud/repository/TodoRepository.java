package com.ssafy.ssafysandboxbackend.crud.repository;

import com.ssafy.ssafysandboxbackend.crud.dto.TodoVo;
import com.ssafy.ssafysandboxbackend.crud.repository.domain.Todo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TodoRepository extends JpaRepository<Todo, Long> {

    List<TodoVo> findAllProjectsBy();
}
