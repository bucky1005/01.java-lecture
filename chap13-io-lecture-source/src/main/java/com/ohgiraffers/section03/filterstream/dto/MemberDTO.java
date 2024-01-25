package com.ohgiraffers.section03.filterstream.dto;

import java.io.Serializable;

/* 설명. MemberDTO 타입의 객체를 객체단위 입출력(Object 관련 스트림) 을 하기 위해서는 Serializable 인터페이스를 구현해야 한다. */
public class MemberDTO implements Serializable {
    private String id;

    /* 설명. transient 키워드가 붙은 필드는 직렬화에서 제외된다. */
    private transient String pwd;
    private String name;
    private String email;
    private int age;
    private char gender;

    public MemberDTO(String id, String pwd, String name, String email, int age, char gender) {
        this.id = id;
        this.pwd = pwd;
        this.name = name;
        this.email = email;
        this.age = age;
        this.gender = gender;
    }

    public MemberDTO() {
    }

    // getter
    public String getId() {
        return id;
    }

    public String getPwd() {
        return pwd;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public int getAge() {
        return age;
    }

    public char getGender() {
        return gender;
    }

    // setter
    public void setId(String id) {
        this.id = id;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "MemberDTO{" +
                "id='" + id + '\'' +
                ", pwd='" + pwd + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
