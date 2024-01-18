package com.ohgiraffers.section03.math;

public class Application02 {
    public static void main(String[] args) {

        /* 수업목표. 사용자 지정 범위의 난수를 발생시킬 수 있다.(ver. java.loan.Math 클래스) */
        // 난수를 생성할 개수 구하는 방법
        // 최대값 - 최소값 + 1
        // ex) 10 ~ 15 사이 난수 => 15 - 10 + 1 = 6

        /* 목차 1. 0 ~ 9 사이의 난수 생성 */
        int random1 = (int)(Math.random() * 9);

        /* 목차 2. 1 ~ 10 사이의 난수 생성 */
        int random2 = (int)(Math.random() * 10) + 1;

        /* 목차 3. 10 ~ 15 사이의 난수 생성 */
        int random3 = (int)(Math.random() * 6) + 10;

        /* 목차 4. -128 ~ 127 사이의 난수 생성 */
        int random4 = (int)(Math.random() * 256) + -128;

        System.out.println("random1 = " + random1);
        System.out.println("random2 = " + random2);
        System.out.println("random3 = " + random3);
        System.out.println("random4 = " + random4);
    }
}
