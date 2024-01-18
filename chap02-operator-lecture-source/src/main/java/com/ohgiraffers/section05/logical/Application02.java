package com.ohgiraffers.section05.logical;

import org.w3c.dom.ls.LSOutput;

public class Application02 {
    public static void main(String[] args) {

        /* 목차. 1부터 100 사이 값 확인 ( 1 <= x <= 100 )*/
        System.out.println("====== 1 ~ 100 사이 값 확인 ======");
        int num1 = 55;
        int num2 = 101;
        System.out.println((num1 >= 1) && (num1 <= 100));
        System.out.println((num2 >= 1) && (num2 <= 100));
        System.out.println();

        /* 목차 2. 영어 대문자인지 확인 */
        char ch1 = 'G';
        char ch2 = 'g';
        System.out.println("====== 영어 대문자인지 확인 ======");
        System.out.println((ch1 >= 'A') && (ch1 <= 'Z'));
        System.out.println((ch1 >= 65) && (ch1 <= 90));
        System.out.println((ch2 >= 65) && (ch2 <= 90));
        System.out.println();

        /* 목차 3. 대소문자 상관없이 영문자 'y'인지 확인 */
        System.out.println("====== 대소문자 상관없이 영문자 'y'인지 확인 ======");
        char ch3 = 'Y';
        char ch4 = 'd';
        System.out.println((ch3 == 'Y') || (ch3 == 'y'));
        System.out.println((ch4 == 'Y') || (ch4 == 'y'));
        System.out.println();

        /* 목차 4. 영문자인지 확인하는 조건식 */
        System.out.println("====== 영문자인지 확인 ======");
        char ch5 = 'o';
        char ch6 = '\'';        // 싱글 쿼테이션(')을 변수에 저장하기 위해 이스케이프 문자 '\'를 사용
        System.out.println((ch5 >= 'a') && (ch5 <= 'z') || (ch5 >= 'A') && (ch5 <= 'Z'));
        System.out.println((ch6 >= 'a') && (ch6 <= 'z') || (ch6 >= 'A') && (ch6 <= 'Z'));

    }



}
