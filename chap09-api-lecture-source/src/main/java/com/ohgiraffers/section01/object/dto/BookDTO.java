package com.ohgiraffers.section01.object.dto;

import java.util.Objects;

/* DTO(Data Transfer Objects) : 데이터를 전달하는 객체 */
public class BookDTO {
    private int number;
    private String title;
    private String author;
    private int price;

    // 기본생성자
    public BookDTO() { }

    // 매개변수가 있는 생성자
    public BookDTO(int number, String title, String author, int price) {
        this.number = number;
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // setter
    public void setNumber(int number) { this.number = number; }

    public void setTitle(String title) { this.title = title; }

    public void setAuthor(String author) { this.author = author; }

    public void setPrice(int price) { this.price = price; }

    // getter
    public int getNumber() { return number; }

    public String getTitle() { return title; }

    public String getAuthor() { return author; }

    public int getPrice() { return price; }

    /* 목차 1. toString() 오버라이딩 */
    @Override
    public String toString() {
        return "BookDTO{" +
                "number=" + number +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }

    /* 목차 2. equals() 오버라이딩 */
//    @Override
//    public boolean equals(Object obj) {
//        return this.author.equals(((BookDTO)obj).getAuthor()) && this.price == ((BookDTO)obj).getPrice();
//    }


    /* 설명. alt + insert를 활용하여 equals() + hashcode() 오버라이딩 */
    /* 설명. 우리가 BookDTO 타입의 객체가 동등하다라는 것에 대한 기준을 정하기 위해 오버라이딩 */
    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        BookDTO bookDTO = (BookDTO) object;
        return number == bookDTO.number && price == bookDTO.price && Objects.equals(title, bookDTO.title) && Objects.equals(author, bookDTO.author);
    }

    /* 목차 3. hashCode() 오버라이딩 */
    /* 설명. 우리가 정한 동등 기준을 만족하면 같은 값이 나오도록 오버라이딩 한 것이다. */
    @Override
    public int hashCode() {
        return Objects.hash(number, title, author, price);         // 번호, 책제목, 작가, 가격이 같은 경우 hashCode가 동등하도록 설정
    }
}
