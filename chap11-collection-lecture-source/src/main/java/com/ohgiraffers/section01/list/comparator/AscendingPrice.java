package com.ohgiraffers.section01.list.comparator;

import com.ohgiraffers.section01.list.dto.BookDTO;

import java.util.Comparator;

/* 설명. 우리가 원하는 필드의 원하는 정렬 기준을 정의하는 클래스(feat. Comparator 인터페이스) */
public class AscendingPrice implements Comparator<BookDTO> {

    /* 설명.
    *   Comparator는 compare 메소드, Comparable은 compareTo 메소드를 가진다.
    *   Comparator의 기능이 더 강하여 Comparator와 Comparable 모두 정렬 기준을 오버라이딩했다면
    *   Comparator의 정렬 기준만 적용된다. */
    /* 설명. 가격 오름차순을 위한 compare 메소드 오버라이딩 작성 */

    /* 설명. 다운캐스팅을 하지 않으려면 인터페이스에 제네릭을 걸어준다.
        제네릭은 타입 안정성을 보장하므로 제네릭이 가능한 곳에는 항상 걸어주는 것이 좋다
     */
    @Override
    public int compare(BookDTO o1, BookDTO o2) {
        return ((BookDTO)o1).getPrice() - ((BookDTO)o2).getPrice();
    }
}
