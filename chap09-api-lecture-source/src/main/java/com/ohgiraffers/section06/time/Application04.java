package com.ohgiraffers.section06.time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;

public class Application04 {
    public static void main(String[] args) {

        /* 수업목표. time 패키지의 클래스가 제공하는 날짜 비교 연산 메소드를 활용할 수 있다. */
        LocalDate localDate = LocalDate.now();
        LocalDateTime localDateTime = LocalDateTime.now();
        ZonedDateTime zonedDateTime = ZonedDateTime.now();

        LocalDate past = LocalDate.of(2022, 11, 11);
        LocalDateTime future = LocalDateTime.of(2024, 6, 14, 18, 0, 0);
        ZonedDateTime now = ZonedDateTime.now();

        /* 설명. 이전, 이후, 같은 날짜 확인 */
        /* 필기. 값의 비교는 같은 타입(LocalDate, LocalDateTime, ZoneDateTime)끼리만 가능 */
        System.out.println(localDate.isAfter(past));
        System.out.println(localDate.isEqual(past));
        System.out.println(localDateTime.isBefore(future));
        System.out.println(localDateTime.isAfter(future));
        System.out.println(zonedDateTime.isEqual(now));
        System.out.println(zonedDateTime.isBefore(now));

    }
}
