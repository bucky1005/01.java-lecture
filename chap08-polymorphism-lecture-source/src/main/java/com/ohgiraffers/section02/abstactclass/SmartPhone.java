package com.ohgiraffers.section02.abstactclass;

public class SmartPhone extends Product{

    public SmartPhone() {
        super();
    }

    // 부모 클래스에서 body가 없어 abstract인 메소드지만 자식클래스에서 body를 만들어 준다면 abstract를 선언하지 않아도 됨.
    // 일반적으로 실무에서는 부모클래스에 추상메소드가 있다면 자식클래스에서는 오버라이드하여 추상클래스가 되지 않도록 기능을 구현해야 함.
    // 즉, 부모클래스를 추상클래스로 만들면 자식클래스에서는 강제적으로 기능 구현을 해야함

    // (수업 영상보고 내용 추가할 것) api에서 우리가 구현해야 하는 것의 중간 단계를 쪼개기 위해서 주로 사용함.

    /* 설명. 추상메소드를 물려받은 자식클래스를 온전한 클래스로 만들기 위해서는 반드시 오버라이딩을 해야한다.(강제성 부여) */
    @Override
    public void abstractMethod() {
        System.out.println("Product 클래스로부터 물려받은 abstractMethod를 오버라이딩한 메소드 호출함...");
    }

     /* 설명. 추가적인 메소드도 작성할 수 있다. */
    public void printSmartPhone(){
        System.out.println("SmartPhone 클래스의 printSmartPhone 메소드 호출함...");
    }
}
