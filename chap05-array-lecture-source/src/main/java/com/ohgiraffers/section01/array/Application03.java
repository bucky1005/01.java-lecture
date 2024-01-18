package com.ohgiraffers.section01.array;

import java.util.Arrays;

public class Application03 {
    public static void main(String[] args) {

        /* 수업목표. 배열에 초기화 되는 자료형별 기본값을 이해할 수 있다. */
        /* 필기. 값의 형태별 기본값
            정수: 0
            실수: 0.0
            논리: false
            문자: \u0000
            참조: null
         */

        int[] iArr = new int[5];
        iArr[0] = 1;
        System.out.println(Arrays.toString(iArr));

        boolean[] bArr = new boolean[6];
        System.out.println(Arrays.toString(bArr));

        /* 설명. 크기 할당 시 다른 초기값을 할당하고 싶을 때 */
        int[] iArr2 = {10, 11, 12, 13, 14};             // 크기 및 초기값 한번에 할당 가능(축악형)
        int[] iArr3 = new int[]{10, 11, 12, 13, 14};

        /* 설명. 문자열도 배열로 저장해 사용할 수 있다. */
        String[] sArr = {"apple", "banana", "grape", "orange"};

        for (int i = 0; i < sArr.length; i++) {
            System.out.println(sArr[i]);
        }

        /* 설명. 다양한 출력 방법들을 살펴보자(reat. 일차원 배열) */
        /* 설명1. 단순 for문 사용 시 */
        for (int i = 0; i < sArr.length ; i++) {
            System.out.println(sArr[i]);
        }

        /*  설명2. Arrays.toString() 사용 */
        System.out.println(Arrays.toString(sArr));

        /* 설명 3. for-each문 사용(향상된 for문)  */
        /* 필기. 배열의 각 요소에 대해 반복하는 데 사용하는 반복문이다. */
        for(String str: sArr){
            System.out.println(str);
        }

    }
}
