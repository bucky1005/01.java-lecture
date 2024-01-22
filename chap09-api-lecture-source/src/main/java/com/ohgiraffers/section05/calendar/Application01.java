package com.ohgiraffers.section05.calendar;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Application01 {
    public static void main(String[] args) {

        /* 수업목표. java.util.Date 클래스 사용법을 이해하고 사용할 수 있다. */

        Date today = new Date();
        System.out.println("today = " + today);

        System.out.println("long 타입 시간: " + today.getTime());

        /* 설명. 실무에서 long 타입으로 넘겨받은 date를 날짜형으로 표기하고자 할 때 사용함 */
        System.out.println("long 타입 시간을 활용한 Date형: " + new Date(today.getTime()));
        System.out.println("기준시간(1970년 9시 0분 0초) " + new Date(0L));

        /* 설명. 우리가 원하는 형태로 출력해보기(feat. SimpleDateFormat, long 타입 활용하기 */
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss E요일");         // 월 = MM, 분 = mm
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy년 MM월 dd일 hh:mm:ss");
        String todayFormat = sdf.format(today);
        System.out.println("todayFormat = " + todayFormat);

        /* 설명. java.util.Date -> java.sql.Date */
        /* 필기. 자바에서 받아온 날짜를 DB에서 처리하기 위해 util.Date를 sql.Date로 변환 */
        java.sql.Date sqlDate = new java.sql.Date(today.getTime());                 // java.util.Date를 long형으로 변환하여 sql.Date로 저장
//        java.sql.Date sqlDate2 = (java.sql.Date)today;                            // sql.Date는 util.Date를 상속하고 있으므로 강제형변환도 가능함(권장 X)
                                                                                    // 실제로는 sql.Date형이였던 날짜형이 util.Date형인 today에 담겨있었다면 이 방법도 가능하다.

        /* 설명. java.sql.Date -> java.util.Date */
        /* 필기. DB에서 받아온 날짜를 자바에서 처리하기 위해 sql.Date를 sql.Date로 변환 */
        java.util.Date utilDate = sqlDate;                                          // 다형성에 의한 auto up-casting (util.Date: 부모클래스 / sql.Date: 자식클래스)
    }
}
