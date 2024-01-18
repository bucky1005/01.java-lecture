package com.ohgiraffers.section02.abstactclass;

public abstract class Product {     // abstract(추상) 메소드를 하나 이상 가지고 있다면 클래스도 반드시 abstract가 되어야 한다.
                                    // abstract 메소드가 없어도 클래스는 abstract로 선언할 수 있다.
                                    // abstract 클래스로는 객체를 생성할 수 없다.
    private int nonStaticField;
    private static int staticField;

    public Product() { }

    public void nonStaticMethod() {
        System.out.println("Product 클래스의 nonStaticField 호출함...");
    }

    public static void staticMethod() {
        System.out.println("Product 클래스의 StaticField 호출함...");
    }

    // body({}부분)이 없이 생성된 메소드를 추상메소드(abstract method)라고 한다.
    public abstract void abstractMethod();
}
