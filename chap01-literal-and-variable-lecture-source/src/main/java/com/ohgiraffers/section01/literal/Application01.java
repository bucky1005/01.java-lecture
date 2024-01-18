package com.ohgiraffers.section01.literal;

public class Application01 {
    public static void main(String[] args) {

        // 모든 주석은 위에 한 줄을 띄어쓰기

        // 수업목표 여러 가지 값의 형태를 출력할 수 있다.
        // 목차 1. 숫자 형태의 값
        // 목차 1.1. 정수 형태의 값 출력

        // System.out => Intelli J의 Console창에 출력
        System.out.println(123);

        // 목차 1.2. 실수 형태의 값 출력
        System.out.println(1.234);

        // 목차 2. 문자 형태의 값 출력
        System.out.println('a');            // 문자 하나는 single quatation(')을 사용
        System.out.println('i');            // 숫자도 single quatation을 붙이면 문자다.
//        System.out.println('ab');         // 컴파일 에러(문법 오류)
        System.out.println('\u0000');       // 문자는 아무것도 안넣으면 에러가 발생하지만 넣고싶으면 '\u0000'을 입력

        // 목차 3. 문자열 형태의 값 출력
        System.out.println("안녕하세요");        // 문자열은 double quatation(")을 사용
        System.out.println("a");
        System.out.println("");

        // 목차. 논리 형태의 값 출력
        System.out.println(true);
        System.out.println(false);          // true 또는 false
        System.out.println("true");         // double quatation이 붙으면 문자열이 된다.
    }
}
