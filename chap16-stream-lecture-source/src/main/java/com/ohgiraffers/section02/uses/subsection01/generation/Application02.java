package com.ohgiraffers.section02.uses.subsection01.generation;

import java.util.Random;
import java.util.regex.Pattern;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class Application02 {
    public static void main(String[] args) {

        /* 수업목표. 기본 타입 스트림 생성에 대해 이해하고 활용할 수 있다. */
        /* 필기.
            range(시작값, 종료값): 시작값부터 1씩 증가하는 숫자로 종료값 직전까지 범위의 스트림 생성
            rangeClosed(시작값, 종료값): 시작값부터 1씩 증가하는 숫자로 종료값까지 포함한 스트림 생성
         */
        IntStream intStream = IntStream.range(5, 10);   // 5부터 10-1까지 생성할 때에는 range
        intStream.forEach(value -> System.out.println(value + " ")); // 내가 출력 방식을 바꾸고 싶을 때에는 람다식 작성
//        intStream.forEach(System.out::println); // println 기능이 제공해주는 출력 방식 그대로

        System.out.println();

        LongStream longStream = LongStream.rangeClosed(5, 10);  // 5부터 10까지 생성할 때에는 rangeClosed
        longStream.forEach(value -> System.out.println(value + " "));
        System.out.println();

        /* 필기.
            Wrapper 클래스 자료형의 스트림이 필요한 경우 boxing도 가능하다.
            doubles(갯수): 난수를 활용한 DoubleStream을 갯수만큼 생성하며 반환한다.
            boxed(): 기본 타입 스트림인 XXXStream을 박싱하여 Wrapper 타입의 Stream<XXX>로 반환한ㄴ다.
         */
        Stream<Double> doubleStream = new Random().doubles(5).boxed();
        doubleStream.forEach(value -> System.out.println(value + " "));
        System.out.println();

        /* 설명. 문자열을 split하여 stream으로 생성 */
        /* 메모. String[] strArr = "abc, def, g".split(", ");을 출력하려면 코드가 길어지고 효율도 떨어짐.
            배열이 아닌 스트림으로 생성하면 forEach문을 사용하여 한줄로 출력이 가능해진다.
         */
        Stream<String> splitStream = Pattern.compile(", ").splitAsStream("html, css, javaScript");
        splitStream.forEach(System.out::println);

    }
}
