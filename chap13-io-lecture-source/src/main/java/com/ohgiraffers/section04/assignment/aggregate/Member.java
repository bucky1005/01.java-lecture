package com.ohgiraffers.section04.assignment.aggregate;

import java.io.Serializable;
import java.util.Arrays;

/* 설명. 객체 입출력의 대상이 되는 클래스이자 엔티티 개념의 클래스(DB에 저장된 데이터를 담거나 넣을 데이터를 담을 객체) */
public class Member implements Serializable {   // 객체 입출력을 위해 Serializable 인터페이스 구현

    private int memNo;              // 회원 번호
    private String id;              // 회원 아이디
    private String pwd;             // 회원 비밀번호
    private int age;                // 회원 나이
    private String[] hobbies;       // 회원 취미
    private BloodType bloodType;    // 혈액형(Enum타입으로 4가지만 들어가도록 제약조건을 설정 한 것)

    /* 설명. 엔티티 클래스는 setter를 꼭 필요한 것만 만든다.(불변객체이기 때문) */
    // 생성자
    public Member() {
    }

    public Member(String id, String pwd, int age, String[] hobbies) {
        this.id = id;
        this.pwd = pwd;
        this.age = age;
        this.hobbies = hobbies;
    }

    public Member(int memNo, String id, String pwd, int age, String[] habbies, BloodType bloodType) {
        this.memNo = memNo;
        this.id = id;
        this.pwd = pwd;
        this.age = age;
        this.hobbies = habbies;
        this.bloodType = bloodType;
    }

    // setter
    public void setBloodType(BloodType bloodType) {
        this.bloodType = bloodType;
    }

    public void setMemNo(int memNo) {
        this.memNo = memNo;
    }

    // getter
    public int getMemNo() {
        return memNo;
    }

    public String getId() {
        return id;
    }

    public String getPwd() {
        return pwd;
    }

    public int getAge() {
        return age;
    }

    public String[] getHabbies() {
        return hobbies;
    }

    public BloodType getBloodType() {
        return bloodType;
    }

    // toString()
    @Override
    public String toString() {
        return "Member{" +
                "memNo=" + memNo +
                ", id='" + id + '\'' +
                ", pwd='" + pwd + '\'' +
                ", age=" + age +
                ", habbies=" + Arrays.toString(hobbies) +
                ", bloodType=" + bloodType +
                '}';
    }
}
