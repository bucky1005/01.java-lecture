package com.ohgiraffers.section01.exception;

public class ExceptionTest {

    public void checkEnoughMoney(int price, int money) throws Exception {
        System.out.println("가지고 계신 돈은 "+ money + "원 입니다.");

        if(money >= price){
            System.out.println(price + "원 상품을 구입하기 위한 금액이 충분합니다.");
        } else {        // 예외 상황
            throw new Exception("호주머니 사정이 딱하시군요..");          // 추가. 예외 발생 시 메소드를 호출한 시점에 상황 전달
            /* 추가. 이 때 메소드 호출한 객체에 컴파일 에러 발생 -> 처리 방법은 2가지
                1. JVM에 의한 예외처리: 실행클래스와 예외가 발생한 메소드에 throws Exception을 입력
                2. 개발자가 직접 예외처리: try-catch문으로 예외 처리(권장)
             */

        }
    }
}
