package com.ohgiraffers.section01.intro;

public class Application01 {
    public static void main(String[] args) {

        /* 수업목표. 람다식에 대해 이해하고 활용할 수 있다.(feat.FunctionalInterface) */
        Calculator c1 = new CalculatorImpl();

        /* 필기 1. 인터페이스를 구현한 구현체(Impl 클래스)를 이용한 방식(동적바인딩 활용) */
        /* 메모. c1은 Calculator로 갔다가 동적바인딩에 의해 CalculatorImpl로 실행됨 */
        System.out.println("10과 20의 합은: " + c1.sumTwoNumber(10,20));

        /* 필기 2. 익명클래스를 활용한 방식(인터페이스의 하위 구현체) */
        /* 메모. Impl 클래스를 구현하지 않고 익명클래스를 사용할 수 있으며, 한번 사용하고 버리는 방식(일회성)
            해당 익명클래스로는 인터페이스에 있는 추상메소드를 구현한다.
            주로 이벤트 처리에 활용됨(이벤트는 주로 인터페이스로 구현되어 있음)
         */
        Calculator c2 = new Calculator() {
            @Override
            public int sumTwoNumber(int num1, int num2) {
                return (num1 + num2) * 2;           // c1과 결과값을 다르게 출력하기 위해 리턴값 수정
            }
        };

        System.out.println("10과 20의 합에 2를 곱하면? " + c2.sumTwoNumber(10,20));

        /* 필기 3. 람다식을 활용한 방식 */
        /* 메모. 익명클래스 구현의 번거로움을 줄이기 위해 만들어진 람다식
            해당 람다식은 마찬가지로 인터페이스의 추상메소드를 재정의하여 구현한 것으로, 하나의 객체이다.
         */
        Calculator c3 = (x, y) -> (x + y) * 3;
        Calculator c4 = (x, y) -> { return (x + y) * 3; };              // 증괄호와 리턴으로 결과값을 명확하게 나타낼 수도 있음.
        System.out.println("10과 20의 합에 3을 곱하면? " + c3.sumTwoNumber(10,20));
    }
}
