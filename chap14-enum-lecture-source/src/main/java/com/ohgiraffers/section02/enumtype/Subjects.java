package com.ohgiraffers.section02.enumtype;

public enum Subjects {
    JAVA,           // 0
    MARIADB,        // 1
    JDBC,           // 2
    HTML,           // 3
    CSS,            // 4
    JAVASCRIPTS     // 5
    ;                           // 필드가 끝나면 세미콜론(;)을 명시한다 (다른거 생성하면 자동 입력됨)

    /* 추가. 기본 생성자 호출 시 필드마다 내부에 Subjects 타입의 객체가 생성됨. 해당 객체는 싱글톤임 */
    Subjects() {
        System.out.println("기본 생성자 호출");
    }

    @Override
    public String toString() {
        return "@@@" + this.name() + "@@@";
    }
}
