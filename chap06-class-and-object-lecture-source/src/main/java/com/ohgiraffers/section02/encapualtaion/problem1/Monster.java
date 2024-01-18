package com.ohgiraffers.section02.encapualtaion.problem1;

public class Monster {

    /* 필기. 클래스는 객체에 대한 설계도일 뿐 데이터가 저장될 장소가 아니다.
        데이터를 저장하기 위해서는 반드시 객체를 생성하여 각각의 객체에 데이터를 넣어야 한다. */
    String name;
    int hp;

    public void setHp(int hp) {
        if(hp > 0)
            this.hp = hp;               // this는 해당 메소드를 호출한 Moster 객체를 뜻하고
                                        // this.hp는 해당 객체의 hp를 의미한다.(매우 중요)
        else if (hp <= 0) this.hp = 0;
    }
}
