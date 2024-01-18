package com.ohgiraffers.section02.variable;

public class Application03 {

    public static void main(String[] args) {

        /* 수업목표. 변수의 명명 규칙에 대해 이해할 수 있다. */
        /* 필기.
        *   변수의 명명 규칙
        *   변수의 이름을 지을 때 아무렇게나 짓는 것이 아닌 정해진 규칙이 있다.
        *   실무적으로는 굉장히 중요하기 때문에 반드시 숙지해야 한다.
        *   또한, 규칙에 맞는 올바른 변수명을 짓는 것이 좋은 프로그래밍을 하는 첫 단계이다.*/

        /* 목차 1. 컴파일 에러를 발생시키는 규칙(문법적 에러) */
        /* 목차 1.1. 동일한 중괄호 범위 내에서 동일한 변수명을 가질 수 없다. */
        int age = 26;
//        int age = 30;
        age = 30;

        /* 목차 1.2. 예약어는 사용이 불가능하다. */
//        int true = 1;         // 입력 시 주황색으로 나오는 것은 예약어이다.
//        int for = 2;
        int True = 1;

        /* 목차 1.3. 변수명은 대소문자를 구분한다. */
        int aGe = 20;       // age와 aGe를 다르게 구분하므로 사용 가능

        /* 목차 1.4. 변수명은 숫자로 시작할 수 없다.*/
//        int 1age = 10;
        int age1 = 10;

        /* 목차 1.5. 특수 기호는 '_', '$'만 사용 가능하다.*/
        int _age = 40;
        int $harp = 20;
//        int #harp = 20;


        /* 목차 2. 컴파일 에러를 발생시키지는 않지만 개발자들 간의 암묵적인 규칙(관례상 규칙)*/
        /* 목차 2.1. 변수명의 길이 제한은 없다 하지만 적당히 하자*/
        int slkjgifejfsiefjkgfslewfjijejfsfkeklfg;

        /* 목차 2.2. 변수명이 합성어로 이루어진 경우 첫 단어는 소문자, 두 번째 시작 단어는 대문자로 시작한다.(Camel Case)*/
        int maxAge = 50;
        int minAge = 10;
//        int max_age;          // 해당 표기도 가능은 하지만 권장하지 않음.

        /* 목차 2.3. 한글로 변수명을 짓는 것은 가능하지만, 권장하지 않는다. */
        int 나이 = 19;

        /* 목차 2.4. 변수 안에 저장될 값을 고려하여 의미있고 명확한 이름으로 작성한다. */
//        String s;
        String name;

        /* 목차 2.5. 명시적으로 작성할 수 있도록 한다. */
        String hoHome;
        String home;

        /* 목차 2.6. boolean 자료형은 긍정의문문 형태로 작성한다. */
        boolean isAlive = true;
        boolean isDead = false;

    }
}
