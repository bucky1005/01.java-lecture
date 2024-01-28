package com.ohgiraffers.section04.assignment.service;

/* 설명. 트랜잭션 성공 실패 여부 확인 및 회원 관련 비즈니스 로직 처리하는 클래스 */

import com.ohgiraffers.section04.assignment.aggregate.Member;
import com.ohgiraffers.section04.assignment.repository.MemberRepository;

import java.util.ArrayList;

public class MemberService {

    /* 메모. mr에는 최종적으로 MemberRepository의 필드에 선언되어 있는 값들 (= memberList)이 담겨있다. */
    /* 질문. Application에선 Service클래스를 static final로 선언했는데
        Repository 클래스는 왜 final로 선언을 하는것일까 */
    private final MemberRepository mr = new MemberRepository();

    public MemberService() {
    }

    public void selectAllMembers() {
        /* 메모. MemberRepository의 selectAllMembers() 메소드는 memberList 배열을 반환하는 메소드이다. */
       ArrayList<Member> selectedMembers = mr.selectAllMembers();

       if(!selectedMembers.isEmpty()) {      // 회원이 한명이라도 있는지 검사
           /* 메모. MemberRepository에서 받아온 memberList가 selectedMembers 배열에 잘 넘어왔는지 확인한다. */
           System.out.println("==== service까지 잘 반환되어 오나 확인 ====");
           for(Member m: selectedMembers){
               System.out.println(m);
           }

           /* 메모. 최근에는 else를 사용하지 않고 조건이 맞으면 return으로 처리하여 바로 상황이 종료되도록 함
               (if-return, if-return... 의 형태로 사용) */
           return;      // 이후 코드와 상관 없이 메소드 종료
       }

       /* 설명. 조건이 맞지 않아 출력을 하는 구문(feat. else 쓰지 않기) */
        System.out.println("슬프게도 우리 사이트는 아직 회원이 없습니다...");
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

    /* 설명. 입력받아 넘어온 회원이 가질 번호를 만들고 추가 후 repository로 전달 후 결과 확인 */
    public void registMember(Member member) {
        System.out.println("사용자가 입력해서 넘겨준 Member 확인: " + member);

        int lastMemberNo = mr.selectLastMemberNo();
        member.setMemNo(lastMemberNo + 1);              // 현재 멤버에 저장되어있는 가장 마지막 멤버변호 + 1을 하여 새 멤버에게 부여함

        int result = mr.saveMembers(member);
        if(result == 1) {
            System.out.println(member.getId() + "님의 회원 가입이 성공하였습니다.");
        }
    }

    /* 메모. 입력받은 회원 정보를 MemberRepository에 전달 후 삭제처리 여부를 결과값으로 받아옴 */
    public void deleteMember(int memNo) {
        int result = mr.deleteMember(memNo);
        if(result > 0) {
            System.out.println(memNo + "번 회원 탈퇴를 성공하였습니다.");
            return;         // 회원 탈퇴에 성공한 경우 아래 작성된 코드들(회원탈퇴 실패 메세지)를 실행하지 않고 바로 메소드 종료
        }

        System.out.println("회원 탈퇴에 실패하였습니다.");
    }
}
