package com.ohgiraffers.section01.method;

public class Application08 {
    public static void main(String[] args) {

        /* 수업목표. static 메소드를 호출할 수 있다. */

        Application08 app8 = new Application08();
        System.out.println("10과 20의 합: "+ Application08.sumTwoNumbers(10, 20));
        System.out.println("10과 20의 합: "+ app8.sumTwoNumbers(10, 20));
        System.out.println("10과 20의 합: "+ sumTwoNumbers(10, 20));       // 같은 클래스에 선언된 static 메소드는 앞에 '클래스명.' 을
                                                                          // 명시하지 않아도 호출 가능하다.
    }

    public static int sumTwoNumbers(int first, int second) {
        return first + second;
    }
}
