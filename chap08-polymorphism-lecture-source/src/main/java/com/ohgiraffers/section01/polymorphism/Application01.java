package com.ohgiraffers.section01.polymorphism;

public class Application01 {
    public static void main(String[] args) {

        /* 수업목표. 다형성과 타입 형변환에 대해 이해할 수 있다. */
        /* 상속관계에서 자식과 부모에 관한 타입 형변환으로 자식 -> 부모로 형변환이 발생 */
        Animal animal = new Animal();
        animal.eat();
        animal.run();
        animal.cry();

        Tiger tiger = new Tiger();
        tiger.eat();
        tiger.run();
        tiger.cry();
        tiger.bite();

        Rabbit rabbit = new Rabbit();
        rabbit.eat();
        rabbit.run();
        rabbit.cry();
        rabbit.jump();

        /* 설명. 다형성 적용(부모 타입으로 자식 인스턴스의 주소값 저장 */
        Animal an1 = new Tiger();       // 다형성 적용 O
        Animal an2 = new Rabbit();      // 다형성 적용 O
        Animal an3 = new Animal();      // 다형성 X

        /* 설명. Animal은 Tiger나 Rabbi이 아니다. (Animal은 Tiger나 Rabbit 타입을 지니고 있지 않다. */
//        Tiger tiger1 = new Animal();          // incompatible type 에러 발생
//        Rabbit rabbit1 = new Animal();

        /* 설명. 동적바인딩 확인하기 */
        /* 필기. 동적바인딩이란?
            컴파일 당시에는 해당 타입의 메소드와 연결되어 있다가,
            런타임 당시 실제 객체가 가진 오버라이딩 된 메소드로 바인딩이 바뀌어 동작하는 것을 의미한다.
            동적바인딩의 조건:  1. 상속,  2. 오버라이딩

        정적 바인딩: 프로그램이 시작되서 런타임이 넘어가지 않은 상태로 Animal클래스로 생성한 Tiger 타입 인스턴스는 컴파일 시에는 Animal 타입으로 인식된다.
        때문에 Tiger 클래스에만 있는 bite를 사용하면 에러가 발생한다.
         */
        System.out.println("동적 바인딩 확인 ===================");
        an1.cry();
        an2.cry();
        an3.cry();      // 다형성 X

        /* 설명. 오버라이딩 되지 않은(추가한 메소드) 메소드 호출은 다운캐스팅을 해 주어야 한다. */
        /* 필기. instanceof란?
            해당 객체의 타입을 런타임 시점에 확인하기 위한 연산자
         */

        ((Tiger)an1).bite();        // 소괄호()의 위치에 주의할 것!
//        (Tiger)an1.bite();        // an1.bite()를 Tiger 타입으로 캐스팅 하는 것으로 오류 발생.
        ((Rabbit)an1).jump();       // 컴파일 시점에서는 에러가 발생하지 않지만 런타임 시점에 에러가 발생

        if(an1 instanceof Tiger)
            ((Tiger)an1).bite();

        if(an1 instanceof Rabbit)
            ((Rabbit)an1).jump();

        /* 설명. 다형성은 상속관계의 객체들 간에 형변환  자식->부모(auto upcasting), 부모->자식(강제 down-casting)*/
        Animal animal2 = new Tiger();       // 자동 형변환(auto up-casting), 다형성 O, 묵시적 형변환

        // an2는 컴파일 시점에서 Animal 타입(부모타입)으로 선언되어 있음
        Rabbit rabbit2 = (Rabbit) an2;      // 강제 형변환(down-casting), 다형성 X, 명시적 형변환

    }
}
