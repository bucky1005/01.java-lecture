package com.ohgiraffers.section03.interfaceimpliments;


/* 설명. 인터페이스 간에는 다중 상속이 가능하고 implements 대신 extends를 사용한다. */
public interface InterProduct extends ParentInterProduct, AnotherParentInterProduct {
    /* 설명 1. 인터페이스는 상수 필드(public static final)만 가질 수 있다. */
//    private String name           // 불가능
//    public String name;           // 불가능
//    public static String name;    // 불가능

    // 인터페이스에 선언하는 상수는 모든 객체가 어디서든 접근 가능하게 하고, 그 값은 절대 변하지 않도록 설정할 때 사용
    public static final int MAX_NUM = 100;  // 상품 최대 100개만 저장 가능하고 이 값을 활용해 조건식을 작성하라.
    int MIN_NUM = 0;                // interface에 선언한 변수는 별도로 선언하지 않아도 자동으로 public static final 이 붙은 상수로 인식

    // 상속 -> 추상클래스 -> 인터페이스
    // 추상클래스부터는 객체 생성이 되지 않음
    // 추상클래스는 생성자가 있음에도 객체 생성이 불가능하지만 인터페이스는 생성자조차 존재하지 않음.

    /* 설명 2. 인터페이스는 생성자를 가질 수 없다. */
//    public interProduct() {}

    /* 설명 3. 추상메소드만 작성이 가능하다.(public abstract) */
//    public abstract void nonStaticMethod();
//    public void nonStaticMethod();  // abstract 키워드를 생략해도 interface는 자동으로 추상클래스로 인식한다.
    void nonStaticMethod();           // public abstract 키워드를 생략해도 가능하다.

    /* 설명. 하지만 static 메소드는 바디부까지 작성을 허용하였다.(JDK 1.8부터 추가된 기능) */
    public static void staticMethod() {
        System.out.println("InterProduct 클래스의 staticMethod 호출됨...");
    }

    /* 설명. 또한 default 키워드를 사용하면 non-static 메소드로 바디부 작성이 가능하다(JDK 1.8부터 추가된 기능)
    *   그러나 실제로 쓰이는 경우는 거의 없다. */
    public default void defaultMethod() {
        System.out.println("InterProduct 클래스의 defaultMethod 호출됨...");
    }

    /* 설명. private도 abstract가 아닌 온전한 메소드로 사용은 가능하다.
    *   얘도 실제로 사용되는 경우는 없을 것임. */
    private void privateMethod() {
        /* 설명. 다른 public default 메소드에서 활용할 수 만 있는 메소드 */
    }
}