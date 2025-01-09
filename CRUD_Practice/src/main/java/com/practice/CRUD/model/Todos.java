package com.practice.CRUD.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

//import lombok.NoArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Todos {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
	
	@Column(columnDefinition = "TEXT", nullable = false)
    private String content;
	
	@Column(nullable = false)
    private boolean completed;
	
	public void changeCompleted() {
		completed = !completed;
	}
}
