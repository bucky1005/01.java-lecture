package com.ohgiraffers.section02.uses.subsection03.terminal;

import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class Application01 {
    public static void main(String[] args) {

        /* 수업목표. 스트림의 최종 연산 중 하나인 calculating에 대해 이해하고 사용할 수 있다. */
        /* 메모. range() : 초기 인덱스부터 마지막 인덱스 - 1 까지의 범위
                rangeClosed() : 초기 인덱스부터 마지막 인덱스를 포함한 범위
                .count()에 커서를 대보면 기본 타입이 long 타입으로 선언되어있음
                따라서 해당 계산값을 담을 변수도 long 타입으로 선언해야함.
         */
        long count = IntStream.range(1, 10).count();        // 1 ~ 9까지의 범위
        int sum = IntStream.range(1, 10).sum();

        System.out.println("count = " + count);
        System.out.println("sum = " + sum);

        /* 설명. OptionalInt는 결과 없음을 나타내야 하는 명확한 요구가 있는 메소드 반환 형식으로 사용하기 위한 타입이다. */
        /* 메모. 기본 자료형은 null이라는 개념이 없음. 따라서, 최대값이 존재하지 않는다는 것을 null로 표현할 수 없음
            이때 기본 자료형에 null이라는 것을 유사하게 나타내기 위해 사용하는 것이 OptionalInt이다(.empty 형태로 출력)
         */
        OptionalInt max = IntStream.range(1, 10).max();
//        OptionalInt max = IntStream.range(1, 1).max();    // OptionalInt.empty 형태로 나오고 기본 자료형에서 존재하지 않음을 나타내기 위함을 알 수 있다.
        OptionalInt min = IntStream.range(1, 10).min();

        System.out.println("max = " + max);
        System.out.println("min = " + min);

        int oddSum = IntStream.range(1,10)
                .filter(i -> i % 2 == 1)            // 1 ~ 9 중 홀수인 값만 추출하여
                .sum();                             // 더해줌

        System.out.println("oddSum = " + oddSum);
    }
}
