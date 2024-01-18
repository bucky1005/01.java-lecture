package com.ohgiraffers.section02.looping;

import java.sql.SQLOutput;
import java.util.Scanner;

public class C_while {
    public void testSimpleWhileStatement() {

        /* 수업목표. while문 단독 사용에 대한 흐름을 이해하고 적용할 수 있다. */
        int i = 1;
        while(i <= 10){
            System.out.println(i);
            i++;
        }
    }

    public void testWhileExample() {
        /* 수업목표 사용자가 'y'라고 입력할 때까지 반복해서 확인한느 예제를 이해할 수 있다.(대소문자 구분 안함) */

        Scanner sc = new Scanner(System.in);

        char answer = '\u0000';
        while(!(answer == 'y' || answer == 'Y')){
            System.out.print("y or Y로 입력하세요: ");
            answer = sc.next().charAt(0);
        }

        System.out.println("감사합니다.");
    }
}
