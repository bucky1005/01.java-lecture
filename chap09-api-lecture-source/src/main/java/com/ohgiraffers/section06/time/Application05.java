package com.ohgiraffers.section06.time;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Application05 {
    public static void main(String[] args) {

        /* 수업목표. time 패키지의 클래스들에 포맷팅을 적용하여 출력할 수 있다. */
        /* 설명. 문자열을 time 패키지 자료형으로 파싱할 수 있다.(사용 인식 가능한 문자열 패턴) */
        /* 필기. 날짜를 다룰 때에는 문자열로 저장하여 파싱을 사용하는 것이 용이함. */
        String timeNow = "14:05:10";
        String dateNow = "2022/10/12";

        LocalTime localTime = LocalTime.parse(timeNow);
        LocalTime localDate = LocalTime.parse(dateNow);
        LocalDateTime localDateTime = LocalDateTime.parse(dateNow + "T" + timeNow);

        System.out.println(localTime);
        System.out.println(localDate);
        System.out.println(localDateTime);

        /* 설명. 기본 패턴이 아닌 경우 */
        String timeNow2 = "14.05.10";
        String dateNow2 = "221003";         // java 패키지는 년도가 22로 입력되있으면 자동으로 2000을 더해 2022로 출력해준다.

        LocalTime localTime2 = LocalTime.parse(timeNow2, DateTimeFormatter.ofPattern("HH-mm-ss"));
        LocalTime localDate2 = LocalTime.parse(dateNow2, DateTimeFormatter.ofPattern("yyMMdd"));

        System.out.println(localTime2);
        System.out.println(localDate2);

        String dateFormat = localDate2.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        String timeFormat = localTime2.format(DateTimeFormatter.ofPattern("HH:mm"));

        System.out.println(dateFormat);
        System.out.println(timeFormat);

    }
}
