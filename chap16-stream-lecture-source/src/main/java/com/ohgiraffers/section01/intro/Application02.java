package com.ohgiraffers.section01.intro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Application02 {
    public static void main(String[] args) {

        /* 수업목표. 스트림의 병렬처리에 대해 이해할 수 있다. */
        List<String> stringList =
                new ArrayList<>(Arrays.asList("java", "oracle", "jdbc", "html", "css"));

        /* 설명. main 쓰레드에서 스트림을 사용하지 않고 확인 */
        System.out.println("======== foreach");
        for(String s: stringList){
            System.out.println(s + " : " + Thread.currentThread().getName());
        }

        /* 설명. main 쓰레드에서 스트림을 사용하고 확인 */
        System.out.println("======== normal stream");
        stringList.stream().forEach(Application02::print);      // .stream()은 생략할 수 있다.
        stringList.forEach(Application02::print);               // stream 이므로 Consumer 형태를 사용할 수 있다.
//        stringList.forEach(s -> System.out.println(s + " : " + Thread.currentThread().getName()));

        /* 설명. 병렬 스트림 사용 시 쓰레드 확인(속도가 상대적으로 몇 배 더 빠르다. 또한 기본 main 쓰레드 외에 다른 쓰레드를 활용한다) */
        System.out.println("======== parallel stream");
        stringList.parallelStream().forEach(Application02::print);
    }

    private static void print(String s) {
        System.out.println(s + " : " + Thread.currentThread().getName());
    }
}
