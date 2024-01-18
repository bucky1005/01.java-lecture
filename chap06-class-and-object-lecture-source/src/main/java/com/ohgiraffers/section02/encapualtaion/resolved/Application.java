package com.ohgiraffers.section02.encapualtaion.resolved;

public class Application {
    public static void main(String[] args) {

        /* 필기. 객체지향프로그래밍(OOP)란?
            OOP(Object Oriented Programing language)
            추상화, 캡슐화, 상속, 다형성을 적용하여 유지보수성을 고려한 응집력 높고 결합도 낮은
            객체 위주의 개발 방식을 적용한 프로그래밍을 말한다.

           필기.
            객체지향의 특징(4대특징)
            - 추상화(Abstraction)(추상화를 제외하면 3대 특징)
            - 캡슐화(Encapsulation): 직접 접근을 제한하고, 정보를 은닉
            - 상속(Inheritance)
            - 다형성(Polymorphism)
         */

        /* 수업목표. 접근제어자와 캡슐화에 대해 이해하고 직접 필드 접근을 막는 이유를 이해할 수 있다. */
        Monster monter = new Monster();
//        monster.name = "슬라임";
//        monster.hp = 1000;

        /* 설명. 필드에 직접 접근 대신 메소드를 통해 우회하여 접근한다. */
        monter.setInfo1("슬라임");
        monter.setInfo2(400);

        /* 필기. 캡슐화(Encapsulation)란?
            캡슐화는 유지보수를 증가시키기 위해 필드의 직접 접근을 제한하고
            public 메소드를 이용해서 간접적으로(우회해서) 접근하여 사용할 수 있도록 만든 기술이다.
            클래스 작성 시 특별한 목적이 있지 않다면 캡슐화를 적용하는 것을 기본 원칙으로 한다.
         */
    }
}
