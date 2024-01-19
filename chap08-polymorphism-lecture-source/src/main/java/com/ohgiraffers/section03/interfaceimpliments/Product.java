package com.ohgiraffers.section03.interfaceimpliments;

import java.io.Serializable;

public class Product implements InterProduct, Serializable {
    @Override
    public void nonStaticMethod() {
        System.out.println("InterProduct의 nonStaticMethod 오버라이딩 메소드 호출됨...");
    }

    @Override
    public void defaultMethod() {
        System.out.println("Product 클래스에서 인터페이스로부터 물려받은 defaultMethod 호출됨...");
    }
}
