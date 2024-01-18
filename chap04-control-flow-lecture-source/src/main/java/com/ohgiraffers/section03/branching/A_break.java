package com.ohgiraffers.section03.branching;

import java.util.Scanner;

public class A_break {

    public void testSimpleBreakStatement() {

        /* 수업목표. break문 사용에 대한 흐름을 이해하고 적용할 수 있다. */
        /* 필기. break문은 반복문 안에 사용하여 자신을 포함한 가장 가까운 반복문을 빠져나감(switch문의 break와는 다름) */
        int sum = 0;
        int i = 1;

        while(true){                                // 무한루프(infinite loop)
            sum += 1;
            System.out.println("sum = " + sum);
            if(1 == 10)
                break;
            i++;
        }
    }

    public void testPrintStarsWithBreakStatement() {

        /* 필기. 중첩 반복문을 활용하는 별찍기 문제에서 안쪽 for문 안에 break를 활용하여 효율적인 반복문을 작성한다. */
        /* 설명.
            양의 정수를 입력하시오: 5
            *
            **
            ***
            ****
            *****
         */

        Scanner sc = new Scanner(System.in);
        System.out.print("양의 정수를 입력하세오: ");
        int inputNum = sc.nextInt();

        for (int i = 1; i <= inputNum; i++) {
            for (int j = 1; j <= inputNum; j++) {
                System.out.print("*");
                if (j == i)                             // 반복 for문이 도는 횟수가 바깥쪽 행의 수와 같으면
                    break;                              // 반복 for문을 멈춘다.
            }
            System.out.println();
        }
    }
}
