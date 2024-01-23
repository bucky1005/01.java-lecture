package com.ohgiraffers.section01.list.dto;

public class BookDTO implements Comparable<BookDTO>{     // Comparable은 compareTo()라는 추상메소드를 가지고있음.
    private int number;
    private String title;
    private String autohr;
    private int price;

    public BookDTO() { }

    public BookDTO(int number, String title, String autohr, int price) {
        this.number = number;
        this.title = title;
        this.autohr = autohr;
        this.price = price;
    }

    // getter
    public int getNumber() {
        return number;
    }

    public String getTitle() {
        return title;
    }

    public String getAutohr() {
        return autohr;
    }

    public int getPrice() {
        return price;
    }

    // setter

    public void setNumber(int number) {
        this.number = number;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAutohr(String autohr) {
        this.autohr = autohr;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "BookDTO{" +
                "number=" + number +
                ", title='" + title + '\'' +
                ", autohr='" + autohr + '\'' +
                ", price=" + price +
                '}';
    }

    /* 설명. 가격에 대해 오름차순 기준을 설정(feat. Comparable 인터페이스 + compareTo 메소드 오버라이딩) */
    // 설명. 부호를 통해 오름차순과 내림차순을 결정함.
    /* 필기.
        우리가 원하는 필드의 오름차순 또는 내림차순을 할 수 있다.
        필드가 4개면 총 8가지 정렬 기준을 가질 수 있다.(각 필드마다 오름차순/내림차순)
        정렬은 compareTo 메소드가 반환하는 int형의 부호에 따라 정해지게 되며 부호가 반대로 되면
        오름차순과 내림차순의 개념이 반대로 된다.
        (오름차순은 매개변수로 넘어온 것을 빼주는 형태로 작성(this.변수 - 매개변수)하며 String은 제외)
        String은 자체로 정렬기준이 정의되어 있음
     */
//    @Override
//    public int compareTo(Object o) {
//        /* 설명. 연산이 가능한 자ㅏ료형(숫자형)에 대해 정렬 기준 정하기 */
////        return price - ((BookDTO)o).price;           // 오름차순
////        return -(price - ((BookDTO)o).price);        // 내림차순
////        return ((BookDTO)o).price - this.price;      // 내림차순
//
//        /* 설명. 연산이 불가능한 자료형에 대해 정렬 기준 정하기 */
////        return this.autohr.compareTo(((BookDTO)o).autohr);    // 오름차순
//        return -this.autohr.compareTo(((BookDTO)o).autohr);     // 내림차순
//    }


    /* 설명. Comparable 인터페이스에 제네릭을 걸면 다운캐스팅이 불필요하다. */
    @Override
    public int compareTo(BookDTO o) {
        return this.title.compareTo(o.title);
    }
}
