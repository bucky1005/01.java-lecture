package com.ohgiraffers.section02.set.run;

import java.util.Set;
import java.util.TreeSet;

public class Application03 {
    public static void main(String[] args) {
        
        /* 수업목표. TreeSet에 대해 이해하고 활용할 수 있다. */
        /* 설명. TreeSet은 중복 제거 + 타입에 정의된 정렬 기준으로 정렬까지 해줌 */
        TreeSet<String> tSet = new TreeSet<>();

        tSet.add("ramen");
        tSet.add("pork");
        tSet.add("kimchi");
        tSet.add("friedEgg");
        tSet.add("soup");
        System.out.println("tSet = " + tSet);

        /* 설명. [과제] 중복되지 않는 번호를 발생시켜 로또 번호 발생기 만들기
            조건.
             1. TreeSet, Set 사용 X
             2. 배열과 반복문 사용
             3. 1등의 당첨 번호만 발생
             4. 출력 시에는 오름차순으로 출력되도록 작성
         */

        /* 설명. TreeSet 사용 시 로또 번호 발생기 */
        Set<Integer> lotto = new TreeSet<>();

        while(lotto.size() < 6){
            lotto.add((int)(Math.random()*45) + 1);
        }

        System.out.println("lotto: " + lotto);
    }
}
