package com.ohgiraffers.section03.abstraction;

public class CarRacer {
    /* 설명. 차 한대(Car 객체 하나)를 필드로 가진다. */
    Car myCar = new Car();

    /* 설명. 자신이 보유잔 차량에 시동을 건다. */
    public void startUp() {
        this.myCar.startUp(); //해당 라인의 startUp()은 Car 객체에 있는 것
    }

    public void stepAccelator() {
        myCar.go();
    }

    public void stepBreak() {
        myCar.stop();
    }

    public void turnOff() {
        myCar.turnOff();
    }
}
