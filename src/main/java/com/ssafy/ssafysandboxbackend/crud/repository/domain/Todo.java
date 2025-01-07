package com.ssafy.ssafysandboxbackend.crud.repository.domain;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@AllArgsConstructor(access = AccessLevel.PROTECTED)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Builder
public class Todo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 1000, nullable = false)
    private String content;
    @Column(nullable = false)
    private boolean completed;

    public void toggleCompleted() {
        completed = !completed;
    }
}
