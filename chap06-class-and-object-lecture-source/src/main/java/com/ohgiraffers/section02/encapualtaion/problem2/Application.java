package com.ohgiraffers.section02.encapualtaion.problem2;

public class Application {
    public static void main(String[] args) {

        /* 수업목표. 필드값 수정 시 발생할 수 있는 문제점을 이해할 수 있다. */
        /* 설명. 필드에 직접 접근하게 되는 경우 객체 클래스에서 값을 수정하여 오류가 발생하였을 때,
            객체를 호출한 메소드에서도 오류가 발생할 수 있다.
            객체의 가장 중요한 원칙인 단일 책임의 원칙에 따르면 객체 클래스의 값이 수정되거나, 오류가 발생해도 객체 클래스 내에서만 발생하고
            객체를 사용하는 메소드에는 문제가 발생하지 않아야 한다.
            이 역시 getter와 setter를 사용하여 방지할 수 있다.
         */
        Monster monster1 = new Monster();
//        monster1.name = "파란버섯";
//        monster1.hp = 400;                // name과 hp가 private로 선언되어 해당 클래스에서 사용 불가

//        System.out.println("monster1 name : " + monster1.name);
//        System.out.println("monster1 hp: " + monster1.hp);

        Monster monster2 = new Monster();
        monster2.setInfo1("광분한 파란버섯");
        monster2.setInfo2(500);
    }
}