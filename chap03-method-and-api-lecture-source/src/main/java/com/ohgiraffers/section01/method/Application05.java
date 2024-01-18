package com.ohgiraffers.section01.method;

public class Application05 {
    public static void main(String[] args) {

        /* 수업목표. 메소드 리턴에 대해 이해할 수 있다. */
        System.out.println("main() 메소드 시작됨...");

        Application05 app5 = new Application05();
        app5.testMethod();

        System.out.println("main() 메소드 종료됨...");
    }

    private void testMethod() {
        System.out.println("tsetMethod() 동작 확인...");

        return;

//        System.out.println("해당 구문은 컴파일 에러 발생");     // return 이후에 작성된 코드는 절대 실행될 수 없으므로 에러가 발생함.
    }
}
