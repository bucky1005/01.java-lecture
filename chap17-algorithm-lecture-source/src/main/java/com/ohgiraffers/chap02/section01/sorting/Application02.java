package com.ohgiraffers.chap02.section01.sorting;

import java.util.Arrays;
import java.util.Scanner;

/* 수업목표. 선택 정렬을 이해할 수 있다. */
/* 필기. 선택 정렬(Selection Sort)
    대상 데이터에서 최대나 최소 데이터를 찾아 맨 앞(또는 맨 뒤)와 교환하는 방법이다.
    배열의 모든 요소에 대해 반복한다.
    시간 복잡도는 O(n^2)이라 효율적이지는 않다.
 */
public class Application02 {

    /* 설명.
     *  문제 내용
     *   : N개의 정수가 주어졌을 때, 선택 정렬 알고리즘을 사용하여 내림차순으로 정렬하는 프로그램을 작성하시오.
     *  입력
     *   - 첫 번째 줄에 자연수 N(1 <= N <= 100)이 주어진다.
     *   - 두 번째 줄에 N개의 정수가 공백으로 구분되어 입력된다. 각 정수는 -10^9 이상, 10^9 이하이다.
     *  출력
     *    - 내림차순으로 정렬된 수열을 공백으로 구분하여 출력한다.
     *
     * 설명.
     *  예시 입력 1
     *    - 10
     *      32 7 34 39 40 41 22 31 23 25
     *  예시 출력 1
     *    - 41 40 39 34 32 31 25 23 22 7
     *
     * 설명.
     *  예시 입력 2
     *    - 6
     *      42 29 34 64 28 12
     *  예시 출력 2
     *    - 64 42 34 29 28 12
     * */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /* 설명. 입력 데이터 받기 */
        System.out.print("입력할 데이터의 개수: ");
        int length = sc.nextInt();
        int[] arr = new int[length];

        System.out.print("데이터 입력: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();              // 공백을 구분자로 하여 하나씩 입력됨.
        }

        /* 설명. 알고리즘 실행 */
        System.out.println("===== 오름차순 정렬 =====");
        solution(arr, length);
//        System.out.println("===== 내림차순 정렬 =====");
//        solution1(length, arr);

        System.out.println();

        /* 설명. 정렬 결과 출력 */
        System.out.print("결과: ");
        for(int i : arr){
            System.out.print(i + " ");
        }
    }

    public static void solution1(int length, int[] arr){
        /* 메모. i를 length - 1까지 반복하는 이유
            j가 i+1부터 시작하여 배열의 끝까지 반복하므로
            i는 length - 1까지 반복하여야 마지막 반복에서 마지막 인덱스값과 비교가 가능하다. */
        /* 설명. i를 선택인덱스로 하여 앞부터 내림차순 정렬 */
        for (int i = 0; i < length - 1; i++) {
            int maxIndex = i;               // 가장 큰 값이 담긴 인덱스를 저장

//            System.out.println("현재 maxIndex: " + i +"번 인덱스의 " + arr[i]);
//            System.out.println(i + "번째 인덱스 순회: " + Arrays.toString(arr));
//            System.out.println();

            /* 설명. j 범위에서 가장 큰 값을 maxIndex에 저장(내림차순) */
            for (int j = i + 1; j < length; j++) {
                if(arr[i] < arr[j]){    // maxindex의 값이 j 인덱스의 값보다 작은경우
                    maxIndex = j;       // maxIndex를 j로 변경

                    // arr[i]와 arr[maxIndex]의 데이터를 swap
                    int temp = arr[i];
                    arr[i] = arr[maxIndex];
                    arr[maxIndex] = temp;
                }
            }
        }
    }

    /* 메모. 오름차순으로 연습 */
    public static void solution(int[] arr, int length){
        for (int i = 0; i < length-1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < length; j++) {
                if(arr[i] > arr[j]){
                    minIndex = j;

                    int temp = arr[i];
                    arr[i] = arr[minIndex];
                    arr[minIndex] = temp;
                }
            }
        }
    }
}
