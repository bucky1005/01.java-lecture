package com.ohgiraffers.chap02.section01.sorting;

import java.util.Arrays;
import java.util.Scanner;

/* 수업목표. 버블정렬을 이해할 수 있다. */
/* 필기. 정렬 알고리즘
    데이터를 특정 순서대로 배열하는데 사용한다. (일반적으로는 배열의 정렬을 뜻함(코테 기준))

   필기. 버블 정렬(Bubble Sort)
    두 인접한 데이터의 크기를 비교해 정렬하는 방법이다.
    버블의 모든 요소에 대해 반복하면서, 각 반복마다 가장 큰 요소가 배열의 끝으로 "버블링(이동)" 된다.
    시간 복잡도는 O(n^2)이라 효율적이지는 않다.
    ex) n = 100이면 O(n^2) = 10,000 이므로 1초안에 해결 가능(1초에 1억개까지 처리)
        1초 안에 처리할 수 있다면 코테에서 사용해도 문제되지 않음
 */
public class Application01 {
    
    /* 설명. 문제 내용
     *   : N개의 정수가 주어졌을 때, 선택 정렬 알고리즘을 사용하여 오름차순으로 정렬하는 프로그램을 작성하시오.
     *  입력
     *   - 첫 번째 줄에 자연수 N(1 <= N <= 100)이 주어진다.
     *   - 두 번째 줄에 N개의 정수가 공백으로 구분되어 입력된다. 각 정수는 -10^9 이상, 10^9 이하이다.
     *  출력
     *   - 오름차순으로 정렬된 수열을 공백으로 구분하여 출력한다.
     *
     *  설명.
     *   예시 입력 1
     *     - 7
     *       34 23 5 24 1 9 12
     *   예시 출력 1
     *     - 1 5 9 12 23 24 34
     *  설명.
     *   예시 입력 2
     *     - 6
     *       40 47 38 8 33 35
     *   예시 출력 2
     *     - 8 33 35 38 40 47
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
//        solution(length, arr);
        solution2(length, arr);                 // while문 사용
        System.out.println();

        /* 설명. 정렬 결과 출력 */
        System.out.print("결과: ");
        for(int i : arr){
            System.out.print(i + " ");
        }
    }
    
    public static void solution(int length, int[] arr){
        /* 질문. 정렬이 끝나도 무조건 length - 1까지 반복을 하는데,
            정렬이 완료되면 바로 반복을 종료하게 하려면 어떻게 해야 할까?
            => swap이 발생하지 않으면 정렬이 완료된 것이므로 swap 발생 유무를 flag 변수로 만들어 활용해보기
         */
        boolean flag;

        /* 메모. length - 1 까지 반복하는 이유
            버블정렬은 두 개씩 짝지어서 값을 비교하기 때문에 length - 1까지 반복을 돌려야 모든 인덱스를 비교-정렬한다.
         */
        for (int i = 0; i < length - 1; i++) {
            System.out.println(i + "번째 순회: " + Arrays.toString(arr));
            flag = false;
            for (int j = 0; j < length - 1; j++) {
                if(arr[j] > arr[j+1]){      // 앞의 값이 바로 뒤의 값보다 클 때 두 값을 스위칭

                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;

                    flag = true;
                }
            }
            if(!flag) return;
        }

    }

    public static void solution2(int length, int[] arr){
        boolean flag = false;
        int cnt = 0;

        while(!flag){
            flag = true;
            System.out.println(++cnt + "번째 순회: " + Arrays.toString(arr));

            for (int i = 0; i < length - 1; i++) {
                if(arr[i] > arr[i+1]){
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;

                    flag = false;
                }
            }
        }
    }
}
