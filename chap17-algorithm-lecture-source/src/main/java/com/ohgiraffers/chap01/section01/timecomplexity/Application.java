package com.ohgiraffers.chap01.section01.timecomplexity;


import java.util.Arrays;
import java.util.Collections;

public class Application {
    public static void main(String[] args) {

        /* 수업목표. 시간복잡도를 이해할 수 있다. */
        /* 필기. 알고리즘 실행 시 입력값이 증가함에 따라 걸리는 시간의 증가도를 나타낸다. */

        int[] arr = new int[]{3, 1, 2, 15, 4, 9, 10, 7};

        System.out.println(getFirst(arr));
        System.out.println(binarySearch(arr, 9));
        System.out.println(reverse(arr));

    }

    /* 설명. 상수 시간 O(1) */

    private static int getFirst(int[] arr) {
        return arr[0];
    }

    /* 설명. 로그 시간 O(log n)
    *   n은 입력값의 크기이므로 현재 n = 8 (배열에 입력된 데이터의 개수)*/
    /* 메모. 로그 = 절반
        입력값이 늘어나더라도 절반의 시간이 소요됨 */
    private static int binarySearch(int[] arr, int target) {

        Arrays.sort(arr);   // 알고리즘을 수행하기 전 배열 정렬을 먼저 해줌
        int left = 0, right = arr.length - 1;

        while(left <= right){
            int mid = left + (right - left) / 2;        // 두 값의 중간 거리를 mid로 설정하되 소수점이 발생하면 버림처리하여 두 인덱스 중 앞의 인덱스가 mid가 됨
            if(arr[mid] == target){                     // 찾을 값이 mid 위치에 있다면
                return mid;                             // mid의 인덱스를 반환
            } else if (arr[mid] < target) {             // 내가 찾을 값이 mid 인덱스보다 큰 인덱스를 가질경우
                left = mid + 1;                         // left 위치를 mid + 1로 바꾸어 mid 이전의 범위를 다 버림
            } else {                                    //
                right = mid + 1;                        //
            }
        }
        return -1;          // 찾고자 하는 값이 배열에 없을 경우 -1 반환
    }

    /* 설명. 선형 시간 O(n) */
    /* 메모. 입력된 데이터의 개수만큼 시간이 소요됨 */
    public static int[] reverse(int[] arr){
        int[] reversed = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            reversed[arr.length - 1 - i] = arr[i];
        }
        return reversed;
    }

    /* 설명. 지수 시간 O(n^2) */
    public static int fibonacci(int n){
        if(n <= 1) return n;
        return fibonacci(n - 1) + fibonacci(n - 2);     // 재귀함수(자신의 함수를 자신의 함수 내에서 호출)
    }
}