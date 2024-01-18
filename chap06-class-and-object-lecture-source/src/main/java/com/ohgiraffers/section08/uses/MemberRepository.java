package com.ohgiraffers.section08.uses;

public class MemberRepository {

    /* 설명. static 변수인 Member 객체 배열은 데이터베이스라고 생각하자 */
    private final static Member[] members;
    /* 설명. 현재 가입되어 있는 회원 수이자 마지막 회원 번호 +1을 의미한다.(데이터베이스 auto_incrememnt 같은 개념이다.)  */
    private static int count;

    static {
        members = new Member[10];
    }

    /* 설명. 데이터베이스는 개념  */
    public static boolean store(Member[] newMembers) {

        for(int i = 0; i < newMembers.length; i++) {
            members[count++] = newMembers[i];
        }

        return true;
    }

    public static Member[] findAllMembers() {

        return members;
    }
}