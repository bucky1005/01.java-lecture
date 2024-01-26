package com.ohgiraffers.section01.intro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Application01 {
    public static void main(String[] args) {

        /* 수업목표. Stream에 대해 이해하고 활용할 수 있다. */
        /* 설명
            Arrays.asList(): 매개변수로 요소들을 전달하면 List로 변환
            ArrayList<>(Collection 타입): Collection 타입을 ArrayList 객체로 생성할 때 쓰이는 생성자
         */
        List<String> stringList = new ArrayList<>(Arrays.asList("hello", "world", "stream"));

        System.out.println("======= foreach");
        for(String str: stringList){
            System.out.println(str);
        }

        //.stream() .forEach 앞에 생략되어있고, 그로인해 stream에서 제공하는 메소드를 사용할 수 있다.
        System.out.println("======= stream");
        stringList.forEach(a -> System.out.println(a)); // 원래 해당 형식의 람다식을
        stringList.stream().forEach(System.out::println);        // 이와 같이 나타낼 수 도 있다.
    }
}
