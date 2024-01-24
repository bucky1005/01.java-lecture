package com.ohgiraffers.section01.list.run;

import com.ohgiraffers.section01.list.comparator.AscendingPrice;
import com.ohgiraffers.section01.list.comparator.DescendingAuthor;
import com.ohgiraffers.section01.list.dto.BookDTO;

import java.util.*;

public class Application02 {
    public static void main(String[] args) {

        /* 수업목표. ArrayList에서 관리되는 자료의 정렬 기준을 이용할 수 있다. */
        /* 목차 1. Comparable 인터페이스 구현 방법 */
        List<BookDTO> bookList = new ArrayList<>();
        bookList.add(new BookDTO(1, "홍길동전", "허균", 50000));
        bookList.add(new BookDTO(2, "목민심서", "정약용", 30000));
        bookList.add(new BookDTO(3, "동의보감", "허준", 40000));
        bookList.add(new BookDTO(4, "삼국사기", "김부식", 46000));
        bookList.add(new BookDTO(5, "삼국유사", "일연", 58000));

//        for (int i = 0; i < bookList.size(); i++) {
//            System.out.println(bookList.get(i));
//        }

//        Collections.sort(bookList);         // BookDTO 클래스에서 Comparable 인터페이스의 compareTo 메소드를 가격으로 오름차순 정렬로 재정의하였음
        /* 목차 2. Comparator 인터페이스 구현 방법 */
        Collections.sort(bookList, new AscendingPrice());   // sort()의 두번째 매개변수는 정렬 기준을 의미
                                                            // 만들어둔 정렬 기준 클래스를 객체로 생성하여 대입한 것
        Collections.sort(bookList, new DescendingAuthor());

        /* 설명. ArrayList가 제공하는 sort 사용 시(Comparator 기준 만 가능) */
        bookList.sort(new DescendingAuthor());

        for(BookDTO book: bookList) {       // bookList의 인덱스를 순차적으로 넘겨받아 book에 저장
            System.out.println(book);       // book에 저장된 인덱스의 데이터를 출력
        }
    }
}
