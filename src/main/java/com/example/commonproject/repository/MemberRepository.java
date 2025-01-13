package com.example.commonproject.repository;

import com.example.commonproject.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MemberRepository extends JpaRepository<Member, Long> {
    // 기본적인 CRUD 메서드는 JpaRepository가 자동으로 제공
    // 필요한 추가 메서드만 정의하면 됩니다.
    Optional<Member> findByEmail(String email);
}


