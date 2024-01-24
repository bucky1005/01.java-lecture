package com.ohgiraffers.section01.exception;

public class Application {
    public static void main(String[] args) throws Exception{

        /* 수업목표. 예외에 대해 이해하고 이를 처리하기 위한 문법을 활용할 수 있다. */
        /* 필기. 예외를 처리할 수 있는 두 가지 방법
            1. JVM에게 throws를 통한 위임 (throw로 발생 throws로 처리)
            2. 개발자가 try-catch를 통한 처리 (throw로 발생 try-catch로 처리)
         */
        ExceptionTest et = new ExceptionTest();
//        et.checkEnoughMoney(50000, 10000);      // 여기서 예외 발생 -> ExceptionTest 클래스의 throws new Exception() 객체에 저장

        /* 설명. try-catch 구문을 통해 프로그램이 종료되지 않게 처리할 수 있다. */
        /* 추가. try-catch문은 예외가 발생할 것을 고려해 메소드를 사용하는 쪽(주로 main)에서 사용한다. */
        try{
            /* 설명. catch 구문으로 처리할 예외가 발생하는 부분을 try 구문으로 묶을 수 있다.(범위는 너무 크지 않게 관련있는 것만 지정할 것)*/
            et.checkEnoughMoney(10000, 50000);      // 얘는 실행됨
            et.checkEnoughMoney(50000, 10000);      // 여기서 예외 발생 -> ExceptionTest 클래스의 throws new Exception() 객체에 저장
            System.out.println("이전에 문제 없었으면 실행 될 try의 나머지 부분");     // 얘는 실행 안됨
        } catch (Exception e) {         // ExceptionTest 클래스의 throws new Exception() 객체가 매개변수 e에 들어감.

            /* 설명.
                try 구문에서 발생한 예외를 처리하기 위한 구문으로 우리가 원하는 방식으로 예외 상황에 대해
                처리할 수 있다.(단순 출력 또는 예외 타입에서 제공하는 메소드를 활용한 처리 모두 가능)
                catch 구문에 아무런 처리 구문도 작성하지 않으면 예외 발생 유무를 파악하기 힘들기 때문에
                간단한 처리라도 반드시 작성해야 한다.
             */
//            System.out.println("돈 좀 넉넉히 들고 다니자~!");        // 예외 발생 시 실행됨
//            System.out.println(e.getClass());
            System.out.println("예외 발생 시 메세지 확인: " + e.getMessage());

            /* 설명. try 구문에서 발생한 예외 타입을 받아 JVM이 처리해 주는 방식으로 처리할 수 있다. */
            e.printStackTrace();

            /* 설명. 내가 원하는 시점에 프로그램을 종료할 수도 있다.(비추천) */
//            System.exit(0);
        }
        System.out.println("프로그램이 종료됩니다.");
    }
}
