package com.ohgiraffers.section02.looping;

import java.util.Scanner;

public class nestedFor_practice {
    public static void main(String[] args) {

        /* 설명. 입력받은 정수만큼 *을 반복 출력하기 */
        Scanner sc = new Scanner(System.in);

        System.out.print("정수를 입력하세요: ");
        int input = sc.nextInt();
        sc.nextLine();

//        /* 설명. 중첩 for문 사용하여 출력 */
//        for (int i = 0; i < input; i++) {       // 입력된 input 만큼 *묶음 출력 반복(행 = 줄)
//            for (int j = 0; j < input; j++) {    // 한 줄에 input 만큼 * 출력
//                System.out.print("*");
//            }
//            System.out.println();               // 한줄 개행
//        }

        /* 설명. inner for문을 메소드로 처리하기 */
        for (int i = 0; i < input; i++) {
            printstars(input);      // input 개수만큼 한 줄에 별을 출력하는 메소드
            System.out.println();   // 한 줄 개행
        }
    }

    private static void printstars(int input) {
        for (int i = 0; i < input; i++) {
            System.out.print("*");
        }
    }
}
