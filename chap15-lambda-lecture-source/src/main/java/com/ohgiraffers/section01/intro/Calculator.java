package com.ohgiraffers.section01.intro;

/* 메모. FunctionalInterface는 문법적으로 추상메소드를 1개만 만들 수 있는 인터페이스이다. */
@FunctionalInterface
public interface Calculator {
    /* 메모. 추상메소드: 바디부 {} 가 구현되지 않은 메소드 */
    int sumTwoNumber(int num1, int num2);
//    int sumTwoNumber2(int num1, int num2);      // FunctionalInterface는 추상메소드가 하나여야 한다.
}
