package com.ohgiraffers.section04.assignment.service;

/* 설명. 트랜잭션 성공 실패 여부 확인 및 회원 관련 비즈니스 로직 처리하는 클래스 */

import com.ohgiraffers.section04.assignment.aggregate.Member;
import com.ohgiraffers.section04.assignment.repository.MemberRepository;

import java.util.ArrayList;

public class MemberService {

    /* 추가. mr에는 최종적으로 MemberRepository의 필드에 선언되어 있는 값들 (= memberList)이 담겨있다. */
    private final MemberRepository mr = new MemberRepository();

    public MemberService() {
    }

    public void selectAllMembers() {
        /* 추가. MemberRepository의 selectAllMembers() 메소드는 memberList 배열을 반환하는 메소드이다. */
       ArrayList<Member> selectedMembers = mr.selectAllMembers();

       /* 추가. MemberRepository에서 받아온 memberList가 selectedMembers 배열에 잘 넘어왔는지 확인한다. */
        System.out.println("==== service까지 잘 반환되어 오나 확인 ====");
       for(Member m: selectedMembers){
           System.out.println(m);
       }
    }

    /* 설명. 전달된 회원 번호를 활용해 repository에 있는 memberList로부터 해당 회원 찾아 반환 받기 */
    public void selectMember(int memNo) {
        Member selectedMember = mr.selectMember(memNo);

        if(selectedMember == null) {
            System.out.println("그런 회원이 없네요~");
        } else {
            System.out.println("조회된 회원은 " + selectedMember);
        }
    }
}
