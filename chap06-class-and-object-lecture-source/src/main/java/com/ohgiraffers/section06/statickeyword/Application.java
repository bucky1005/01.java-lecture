package com.ohgiraffers.section06.statickeyword;

public class Application {
    public static void main(String[] args) {

        /* 수업목표. static 키워드에 대해 이해할 수 있다. */
        /* 필기. static
            프로그램이 실행될 때 정적 메모리 영역(static 영역 또는 클래스 영역)에 할당하는 키워드이다.
            여러 인스턴스가 공유해서 사용할 목적의 공간이다.
            대표적인 예로 singleton 객체가 있다.
         */

        /* 목차 1. static 키워드를 필드에서 사용 */
        StaticFieldTest stf1 = new StaticFieldTest();

        /* 설명. 현재 두 필드가 가지고 있는 값 확인 */
        System.out.println("non-static-field: " + stf1.getNonStaticCount());
        System.out.println("static field: " + StaticFieldTest.getStaticCount());

        /* 설명. 각 필드 값들을 하나씩 증가 */
        stf1.increaseNonStaticCount();
        StaticFieldTest.increaseStaticCount();

        /* 설명. 두 필드값 확인 */
        System.out.println("non-static-field: " + stf1.getNonStaticCount());
        System.out.println("static field: " + StaticFieldTest.getStaticCount());

        /* 설명. 새로운 객체 생성 */
        StaticFieldTest stf2 = new StaticFieldTest();
        System.out.println("non-static-field: " + stf2.getNonStaticCount());            // non-static은 객체마다 다른 주소값을 가지기 때문에 stf1과 stf2가 가진 값이 다르다.
        System.out.println("static field: " + StaticFieldTest.getStaticCount());        // static은 ram의 static 메모리에 올라간 하나의 값을 공유해서 쓰기 때문에 동일한 값이 출력된다.
    }
}
