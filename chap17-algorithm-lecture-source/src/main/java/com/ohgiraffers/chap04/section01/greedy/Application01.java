package com.ohgiraffers.chap04.section01.greedy;

/* 수업목표. 그리디(Greedy) 알고리즘에 대해 이해할 수 있다. */
/* 필기. 현재 상태에서 최적의 해답(최대 이익을 주는 해답)을 찾기 위해 적용하는 알고리즘으로
    앞의 선택이 이후에 영향을 주지 않을 때 적용 가능하다.
 */
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
