package com.ohgiraffers.section01.intro;

public class Application02 {
    public static void main(String[] args) {

        /* 수업목표. 람다식 활용을 위한 내부 인터페이스 관리 기법에 대해 이해할 수 있다. */
        /* 설명. 내부 인터페이스인 Sum의 하위 구현체에 존재하는 메소드를 오버라이딩(feat. 람다식 활용) */
        /* 설명. 람다식으로 내부 인터페이스의 하위 구현체를 변수명으로 정의함 */
        /* 메모. 인터페이스에 있는 유일한 추상메소드를 구현해서 하위구현체 */
        OuterCalculator.Sum sum = (x, y) -> x + y;
        OuterCalculator.Minus minus = (x, y) -> x - y;
        OuterCalculator.Multiple multi = (x, y) -> x * y;
        OuterCalculator.Divide div = (x, y) -> x / y;

        System.out.println("20과 10의 합: " + sum.sumTwoNumber(20, 10));
        System.out.println("20과 10의 차: " + minus.minusTwoNumber(20, 10));
        System.out.println("20과 10의 곱: " + multi.multiplyTwoNumber(20, 10));
        System.out.println("20과 10의 나누기: " + div.divideTwoNumber(20, 10));

    }
}
