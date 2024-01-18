package com.ohgiraffers.section02.encapualtaion.problem2;

public class Monster {

    /* 필기. 접근제어자 private를 활용하여 캡슐화를 적용한다.(같은 클래스를 제외한 곳에서는 접근 불가) */
    String kinds;
    int mp;

    public void setInfo1(String info1) {
//        this.name = info1;
        this.kinds = info1;
    }


    public void setInfo2(int info2){
//        this.hp = info2;
        this.mp = info2;
    }
}
