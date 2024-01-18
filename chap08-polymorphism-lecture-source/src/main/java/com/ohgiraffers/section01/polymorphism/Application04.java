package com.ohgiraffers.section01.polymorphism;

import java.util.Random;

public class Application04 {
    public static void main(String[] args) {

        /* 수업목표. 다형성을 적용하여 리턴타입에 활용할 수 있다. */
        Application04 app4 = new Application04();
        Animal randomAnimal = app4.getRandomAnimal();
        randomAnimal.cry();
    }

    private Animal getRandomAnimal() {
        int random = new Random().nextInt(2);

        return random == 0? new Tiger(): new Rabbit();
    }
}
