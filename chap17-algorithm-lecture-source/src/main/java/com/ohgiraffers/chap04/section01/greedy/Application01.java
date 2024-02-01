package com.ohgiraffers.chap04.section01.greedy;

public class Application01 {
    public static int solution(int n){
        int count = 0;          // 들고 갈 최소 봉지 갯수

        /* 설명. 5kg로 바로 나눌 수 있으면 n/5를 반환 */
        while(true) {
            if(n % 5 == 0) {
                /* 설명. +count는 이전 반복에서 가져간 3kg 봉지의 수를 합산하는 것이다. */
                /* 메모. n/5 = 5kg 봉지의 개수, +count: 3kg 봉지의 개수 */
                return n / 5 + count;
            } else if(n < 0) return -1;     // 발수가 잘못 들어온 경우 ex) 7kg는 3kg와 5kg 봉지로 맞출 수 없음

            /* 설명. 3kg를 한 봉지 들고간다. */
            n -= 3;
            count++;
        }
    }
}
