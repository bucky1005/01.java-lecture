package com.ohgiraffers.section02.uses.subsection02.intermediate;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class Application03 {
    public static void main(String[] args) {

        /* 수업목표. 스트림의 중계 연산 중 하나인 flatMap에 대해 이해하고 사용할 수 있다. */
        /* 필기.
            Stream<R> flatMap(Function<? super T, ? extends Stream<? extends R>> mapper);
            flatMap()는 중첩 구조를 한 단계 제거하고 단일 컬렉션으로 만들어 준다.
            이러한 작업을 플래트닝(flattening)이라고 한다.
         */
        List<List<String>> list = Arrays.asList(
                Arrays.asList("JAVA", "SPRING", "SPRINGBOOT"),
                Arrays.asList("java", "spring", "springboot")
        );
        System.out.println("list = " + list);

        /* 메모. 위에 작성된 List안에 List가 있는 구조를 펼쳐서 보기좋게 하나의 List로 flat하게 만드는 것 */
        /* 메모. 컬렉션에서 제공하는 스트림이라는 메소드를 람다식으로 작성하여 매개변수로 받아온 형태
        *   (문법적으로 보기보단 해당 코드의 기능을 중점으로 볼 것) */
        List<String> flatList = list.stream().flatMap(Collection::stream).collect(Collectors.toList());

        System.out.println("flatList = " + flatList);
    }
}
