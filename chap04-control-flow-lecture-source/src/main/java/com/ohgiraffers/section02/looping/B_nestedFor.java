package com.ohgiraffers.section02.looping;

import java.util.Scanner;

public class B_nestedFor {
    public void printGugudanFromTwoToNine() {

        /* 수업목표. 중첩된 for문의 흐름을 이해하고 적용할 수 있다. */
        /* 설명
            2단
            2 * 1 = 2
            2 * 2 = 4
            2 * 3 = 6
            ...
            9 * 7 = 63
            9 * 8 = 72
            9 * 9 = 81
         */

        for (int i = 2; i <= 9; i++) {              // 단수
            System.out.println("======= " + i + "단 =======");
            for(int j = 1; j <= 9; j++){            // 곱해지는 수
                System.out.println(i + " * " + j + " = " + (i * j));
            }
            System.out.println();
        }
    }

    public void printUpgradeGugudanFromTwoToNine() {

        /* 수업목표. inner for문을 메소드로 따로 모듈화 해보자.(하나의 기능 단위로 보고) */
        for(int dan = 2; dan <= 9; dan++){
            System.out.println("======= " + dan + "단 =======");
            printGugudanOf(dan);
        }
    }

    /* 설명. 단수를 넘기면 1~9까지 곱해서 숫자를 출력해주는 기능 */
    private void printGugudanOf(int dan) {
        for(int su = 1; su <= 9 ; su++){
            System.out.println(dan + " * " + su + " = " + dan * su);
        }
    }

    public void printStars() {

        /* 설명. 아래와 같은 별모양이 나도오록 작성해보자
            정수를 입력하시오: 5
                *
               **
              ***
             ****
            *****
         */
        Scanner sc = new Scanner(System.in);

        System.out.print("정수를 입력하시오: ");
        int inputNum = sc.nextInt();

        /* 연습 */
//        for(int i = 1; i <= inputNum; i++) {
//            for (int j = i; j <= inputNum - 1; j++) {
//                System.out.print(" ");
//            }
//
//            for (int k = 1; k <= i; k++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        for(int i = 1; i <= inputNum; i++){
            // 한 줄에 출력되는 문자의 개수는 inputNum개

            /* 설명. 공백 출력용 안쪽 for문(inputNum - 1) */
//            for(int j = i; j <= inputNum-1; j++){
//                System.out.print(" ");
//            }
            printSpace(inputNum, i);
            /* 설명. 별 출력용 안쪽 for문(i) */
//            for(int k = 1; k<= i; k++) {
//                System.out.print("*");
//            }
            printStars(inputNum, i);
            System.out.println();
        }
    }
    private void printSpace(int input, int i) {
        for (int j = i; j <= input - 1; j++) {
            System.out.print(" ");
        }
    }

    private void printStars(int input, int i){
        for(int k = 1; k<= i; k++) {
            System.out.print("*");
        }
    }
}
