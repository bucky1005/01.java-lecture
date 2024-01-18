package com.ohgiraffers.section08.uses;

/* 회원을  */
public class MemberFinder {

    public Member[] findAllMembers() {

        return MemberRepository.findAllMembers();
    }
}