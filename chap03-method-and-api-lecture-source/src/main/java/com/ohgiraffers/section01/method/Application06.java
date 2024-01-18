package com.ohgiraffers.section01.method;

public class Application06 {
    public static void main(String[] args) {

        /* 수업목표. 반환값이 있는 메소드 테스트 해보기 */
        System.out.println("main() 메소드 시작됨...");

        Application06 app6 = new Application06();
        String resultText = app6.testMethod();      // testMethod()의 return 값이 반환됨.

        System.out.println("returnText " + resultText);

        /* 설명. 변수에 굳이 담을 필요 없이 메소드의 반환값을 한번만 사용한다면 바로 호출해서 반환값을 활용할 수 있다. */
        System.out.println("returnText " + app6.testMethod());      // 표현식: 하나의 리터럴로 치환될 식
                                                                    // app6.testMethod()는 "test"로 치환됨

        System.out.println("main() 메소드 종료됨...");
    }

    private String testMethod() {           // 반환 연산자는 하나의 타입만 입력할 수 있음.
        System.out.println("testMethod() 실행됨...");
        return "test";                      // 반환 연산자가 void가 아닐 때 우선적으로 return 값을 해당 자료형의 기본값(0 or null 등)으로 둔다.
    }
}
