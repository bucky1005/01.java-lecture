package com.ohgiraffers.section02.variable;

public class Application02 {
    public static void main(String[] args) {

        /* 수업목표. 변수를 선언하고 값을 할당하여 사용할 수 있다. (feat. 자료형(string)) */
        /* 필기.
            변수를 사용하는 방법
            1. 변수를 준비한다.(선언)
            2. 변수에 값을 대입한다.(값 대입 및 초기화)
            3. 변수를 사용한다.
        * */

        /* 설명. 자료형이란?
            다양한 값의 형태별로 어느 정도의 크기를 하나의 값으로 취급할 것인지 미리 Compiler와 약속한 키워드이다.
            이러한 자료형은 기본자료형(Primitive Type)과 참조자료형(Reference Type)으로 나누어진다.
            먼저, 기본자료형 8가지부터 살펴보자.
        * */

        /* 설명. 정수를 취급하는 자료형 */
        byte bnum;              // 1 byte
        short snum;             // 2 byte
        int inum;               // 4 byte
        long lnum;              // 8 byte

        /* 설명. 실수를 취급하는 자료형 */
        float fnum;             // 4 byte
        double dnum;            // 8 byte

        /* 설명. 문자를 취급하는 자료형 */
        char ch;                // 2 byte

        /* 설명. 논리값을 취급하는 자료형 */
        boolean isTrue;         // 1 byte

        /* 설명. 문자열은 참조 자료형이다.(feat. 대문자로 시작)
        *   모든 참조자료형은 4 byte */
        String str;             // String은 클래스이다. (클래스 이름은 항상 대문자로 시작)

        /* 목차 2. 변수에 값 대입(초기화) */
        bnum = 1;
        snum = 2;
        inum = 4;
        lnum = 220000000L;

        fnum = 4.0f;
        dnum = 8.0;

        ch = 'a';
        ch = 97;                // char 자료형은 문자를 숫자로 취급
//        ch = -97;             // char 자료형은 0 이상의 양수만 취급

        isTrue = true;

        /* 목차 3. 변수 활용 */
        System.out.println("isTrue = " + isTrue);
        System.out.println("long과 int의 합 = " + (lnum + inum));

        /* 설명. 변수의 선언 및 초기화는 한번에 가능하다. */
        int kor = 90;
        int math = 80;
        int eng = 75;

        int sum = kor + math + eng;
//        double avg = sum / 3;             // sum도 정수, 3도 정수이므로 결과값은 int로 계산되어 소수점을 버린 값이 double 타입 변수에 저장됨.
        double avg2 = sum / 3.0;             // 3을 3.0으로 바꾸면 double 형의 자료형이 int보다 더 크므로 sum도 double로 자동 형변환이 일어남.

        /* 설명. 나눗셈을 할 때에는 소수점을 고려해야 한다.(하나라도 float 또는 double*/
        System.out.println("총합: " + sum);
        System.out.println("평균: " + avg2);
    }
}
