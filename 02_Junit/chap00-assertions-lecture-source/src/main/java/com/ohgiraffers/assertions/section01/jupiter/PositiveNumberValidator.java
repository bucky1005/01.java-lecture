package com.ohgiraffers.assertions.section01.jupiter;

public class PositiveNumberValidator {

    public void checkDividableNumbers(int firstNum, int secondNum) {
        if(secondNum == 0) {
            throw new IllegalArgumentException("0으로 나눌 수 없습니다.");  // 매개변수로 넘어온 Argument가 잘못되었을 때 발생시키는 예외
        }
    }
}
