package com.ohgiraffers.section02.extend.vo;

public class RabbitFarm <T extends Rabbit> {
    /* 설명. T extends Rabbit은 Generic 타입으로 토끼와 토끼의 자식 클래스들(Bunny, DrunkenBunny)만 대체 가능하다는 의미이다. */

    private T animal;

    public RabbitFarm() {
    }

    public RabbitFarm(T animal) {
        this.animal = animal;
    }

    public T getAnimal() {
        return animal;
    }

    public void setAnimal(T animal) {
        this.animal = animal;
    }
}
