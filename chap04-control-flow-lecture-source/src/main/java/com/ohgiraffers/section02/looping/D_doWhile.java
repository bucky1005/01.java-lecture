package com.ohgiraffers.section02.looping;

import java.util.Scanner;

public class D_doWhile {

    /* 수업목표. do-while문 단독 사용에 대한 흐름을 이해하고 적용할 수 있다 */
    public void testSimpleDoWhileStatement() {

        do {
            System.out.println("실행될까?");
        } while (false);
        System.out.println("반복 종료 이후");
    }

    /* 수업목표. do-while문의 흐름을 이해하고 적용할 수 있다. */
    public void testDoWhileExample() {
        Scanner sc = new Scanner(System.in);

        String str = "";
        boolean flag = false;

        do {
            if(!str.equals("finish") && !str.equals("")) {
                System.out.println("오타라고 믿을게요");
            }
            System.out.println("finish 라고 입력해 주세요: ");
            str = sc.nextLine();
            System.out.println(str + "을 입력하셨군요!");
        } while (!str.equals("finish"));

        System.out.println("감사합니다");
    }
}
