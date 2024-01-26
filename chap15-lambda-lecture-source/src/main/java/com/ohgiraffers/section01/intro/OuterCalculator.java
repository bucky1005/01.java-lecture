package com.ohgiraffers.section01.intro;

public interface OuterCalculator {
    /* 메모. 인터페이스 안에 여러개의 인터페이스를 만들 수 있다.
        해당 인터페이스를 모두 FunctionalInterface로 선언하여 람다식을 여러개 활용할 수 있다
     */
    @FunctionalInterface
    public interface Sum {
        int sumTwoNumber(int a, int b);
    }

    @FunctionalInterface
    public interface Minus {
        int minusTwoNumber(int a, int b);
    }

    @FunctionalInterface
    public interface Multiple {
        int multiplyTwoNumber(int a, int b);
    }

    @FunctionalInterface
    public interface Divide {
        int divideTwoNumber(int a, int b);
    }
}
