package com.ohgiraffers.section02.uses.subsection02.intermediate;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Application04 {
    public static void main(String[] args) {

        /* 수업목표. 스트림의 중계연산 중 하나인 sorted에 대해 이해하고 사용할 수 있다. */
        /* 메모. Collection에서는 sort메소드를 이용하여 정렬이 가능, but List타입 객체만 정렬가능
            Stream 타입은 sorted라는 메소드를 이용하여 값을 정렬 가능
            sort와 마찬가지로 데이터의 자료형에 지정되어있는 정렬 기준을 따름
         */
        List<Integer> integerList = IntStream.of(5, 10, 99, 2, 1, 35)
                                             .boxed()
                                             .sorted()
                                             .collect(Collectors.toList());

        System.out.println("정렬된 Integer List: " + integerList);
    }
}
