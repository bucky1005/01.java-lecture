package com.ohgiraffers.section02.extend.run;

import com.ohgiraffers.section02.extend.vo.*;

public class Application01 {
    public static void main(String[] args) {

        /* 수업목표. extends 키워드를 사용하여 특정 타입만 제네릭 타입으로 사용하도록 제한할 수 있다. */
        /* 설명. Rabbit이거나 Rabbit의 자식 타입이 아닌 타입으로 제네릭 타입을 지정하면 컴파일 에러가 발생한다. */
//        RabbitFarm<Animal> farm1 = new RabbitFarm<>();
//        RabbitFarm<Snake> farm1 = new RabbitFarm<>();
//        RabbitFarm<Mammal> farm1 = new RabbitFarm<>();

        /* 설명. Rabbit 또는 Rabbit의 자식 타입으로는 인스턴스(=객체) 생성이 가능하다. */
        RabbitFarm<Rabbit> farm1 = new RabbitFarm<>();
        RabbitFarm<Bunny> farm2 = new RabbitFarm<>();
        RabbitFarm<DrunkenBunny> farm3 = new RabbitFarm<>();

        farm1.setAnimal(new Rabbit());
        farm1.getAnimal().cry();
        farm1.setAnimal(new Bunny());
        farm1.getAnimal().cry();                // 동적 바인딩 발생으로 반환형인 Animal의 cry()가 아닌 Bunny의 cry() 실행

        farm2.setAnimal(new Bunny());
        farm2.getAnimal().cry();

        farm3.setAnimal(new DrunkenBunny());
        farm3.getAnimal().cry();
    }
}
