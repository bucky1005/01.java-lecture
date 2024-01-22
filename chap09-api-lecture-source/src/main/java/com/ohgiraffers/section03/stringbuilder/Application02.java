package com.ohgiraffers.section03.stringbuilder;

import java.sql.SQLOutput;

public class Application02 {
    public static void main(String[] args) {

        /* 수업목표. StringBuilder의 자주 사용되는 메소드의 용법을 이해할 수 있다. */
        StringBuilder sb = new StringBuilder();
        System.out.println(sb.capacity());

        /* 필기. capacity(): 용량을 정수형으로 반환하는 메소드(초기 16byte 할당) */
        for (int i = 0; i < 50; i++) {
            sb.append(i);

            /* 설명. 설정된 용량을 초과할 것 같으면 capacity가 (capacity * 2 + 1)만큼씩 증가한다. */
            System.out.println("sb: " + sb);
            System.out.println("capacity: " + sb.capacity());
            System.out.println("hashCode: " + System.identityHashCode(sb));
        }

        // StringBuilder에 어느정도 크기의 문자열을 입력했을 때 해당 객체의 메모리가 다 차서 새로운 객체를 생성할까?
        // => StringBuilder는 capacity라는 것이 존재. 초기 16byte가 할당되고, 입력되는 데이터가 capacity에 다다를 때마다 자동으로 capacity를 늘리는 기능을 가지고 있음

        StringBuilder sb2 = new StringBuilder("javamariaDB");       // 문자열 크기 + 16 byte
//        StringBuffer sb2 = new StringBuffer("javamariaDB");       // StringBuilder와 StringBuffer는 똑같은 메소드를 가진다.

        /* 필기.
            delete(): 시작 인덱스와 종료 인덱스를 이용해서 문자열에서 원하는 부분의 문자열을 제거한다.
            deleteCharAt(): 문자열 인덱스를 이용해서 문자 하나를 제거한다.
         */

        //delete(begin index, end index) : begin index부터 end index-1 까지의 문자를 삭제
        System.out.println("delete(): " + sb2.delete(2,5));
        System.out.println("deleteCharAt(): " + sb2.deleteCharAt(0));

        /* 필기. insert(): 인자로 전달된 값을 문자열로 변환 후 지정한 인덱스 위치에 추가한다. */
        System.out.println("insert(): " + sb2.insert(1, "Bao"));          // 1번 인덱스에 삽입
        System.out.println("insert(): " + sb2.insert(0, "Pu"));           // 0번 인덱스에 삽입
        System.out.println("insert(): " + sb2.insert(sb2.length(), "jdbc"));    // 맨뒤에 삽입

        /* 필기. reverse(): 문자열 인덱스 순번을 역순으로 재배열한다. */
        System.out.println("reverse(): " + sb2.reverse());

        /* 필기. String 클래스와 동일한 메소드도 일부 제공된다. */
    }
}
