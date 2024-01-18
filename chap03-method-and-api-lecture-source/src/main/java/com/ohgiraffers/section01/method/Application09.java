package com.ohgiraffers.section01.method;

public class Application09 {
    public static void main(String[] args) {

        /* 수업목표. 다른 클래스에서 작성한 메소드를 활용할 수 있다. */

        int first = 100;
        int second = 50;

        /* 설명. non-static 메소드 호출하기 */
        Calculator cal = new Calculator();
        System.out.println("두 수의 합 : " + cal.plusTwoNumbers(first, second));

        /* 설명. private와 같이 접근 제어자에 따라 다른 클래스에서 접근이 불가능한 메소드가 있을 수 있다. */
//        System.out.println("두 수 중 작은값은 " + cal.minNumbersOf(first, second) + "입니다.");

        /* 설명. static 메소드는 클래스명. 을 붙여 호출한다. */
        System.out.println("두 수 중 큰 값은 " + Calculator.maxNumbersOf(first, second) + "입니다.");    // static 메소드의 경우 클래스명.메소드명으로 호출 가능하다.


    }
}
