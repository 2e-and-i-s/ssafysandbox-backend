package com.example.commonproject.service;

import com.example.commonproject.entity.Member;
import com.example.commonproject.repository.MemberRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class MemberService {
    private final MemberRepository memberRepository;

    @Autowired
    public MemberService(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }
    //create
    public Member createMember(Member member) {
        //이메일 중복 검사 같은 비즈니스 로직을 추가할 수 있습니다.
        return memberRepository.save(member);
    }

    //Read
    public Member getMember(Long id) {
        return memberRepository.findById(id).orElseThrow(() -> new RuntimeException("Member not found"));
    }

    //Update
    public Member updateMember(Long id, Member memberDetails) {
        Member member = getMember(id); //기존 회원 조회
        member.setName(memberDetails.getName()); //정보 업데이트
        member.setEmail(memberDetails.getEmail());
        return memberRepository.save(member);
    }

    //Delete
    public void deleteMember(Long id) {
        memberRepository.deleteById(id);
    }

}//클래스 끝
