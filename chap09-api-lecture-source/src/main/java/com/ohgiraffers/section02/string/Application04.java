package com.ohgiraffers.section02.string;

public class Application04 {
    public static void main(String[] args) {

        /* 수업목표. 이스케이프(escape)문자에 대해 이해하고 적용할 수 있다. */
        /* 필기. 이스케이프(escape) 문자
            문자열 내에서 사용하는 특수기능을 위한 문자이다.

           필기.
            \n : 개행
            \t : tab
            \' : 작은 따옴표 표시
            \" : 큰따옴표 표시
            \\ : 역슬래쉬(\) 표시
         */

        System.out.println("안녕하세요\n저는 홍길동 입니다.");
        System.out.println("안녕하세요\t저는 홍길동 입니다.");

        System.out.println("안녕하세요 저는 '홍길동' 입니다.");
        System.out.println('\'');
        System.out.println("안녕하세요 저는 \"홍길동\" 입니다.");

        System.out.println("역슬래쉬(\\)입니다.");

        /* 설명. 이스케이프 문자 외에도 printf 관련 문법도 있으니 참고하자 */
        // formatting 문법
        System.out.printf("원주율은 %.2f입니다. 우린 %d로 하죠", 3.141529, 3);
    }
}
