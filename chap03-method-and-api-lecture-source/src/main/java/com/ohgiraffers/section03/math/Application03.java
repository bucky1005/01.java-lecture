package com.ohgiraffers.section03.math;

import java.util.Random;

public class Application03 {
    public static void main(String[] args) {

        /* 수업목표. 사용자 지정 범위의 난수를 발생시킬 수 있다.(ver. java.loan.Math 클래스) */
        /* 설명. java.util.Random 클래스는 메소드를 non-static 메소드로 제공한다. */

        Random random = new Random();

        /* 목차 1. 0 ~ 9 사이의 난수 생성 */
        int random1 = random.nextInt(10);

        /* 목차 2. 1 ~ 10 사이의 난수 생성 */
        int random2 = random.nextInt(10) + 1;

        /* 목차 3. 10 ~ 15 사이의 난수 생성 */
        int random3 = random.nextInt(6) + 10;

        /* 목차 4. -128 ~ 127 사이의 난수 생성 */
        int random4 = random.nextInt(256) - 128;

        System.out.println("random1 = " + random1);
        System.out.println("random2 = " + random2);
        System.out.println("random3 = " + random3);
        System.out.println("random4 = " + random4);
    }
}
