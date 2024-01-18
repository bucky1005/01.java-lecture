package com.ohgiraffers.section01.polymorphism;

public class Rabbit extends Animal{
    @Override
    public void eat(){
        System.out.println("토끼가 풀을 뜯어먹습니다. ");
    }

    @Override
    public void run(){
        System.out.println("토끼가 열심히 달립니다. 우다다ㅏ다");
    }

    @Override
    public void cry(){
        System.out.println("토끼가 울음소리를 냅니다. 끼익~! 끽~!");
    }

    /* 설명. 토끼는 점프를 추가적으로 할 수 있다. */
    public void jump(){
        System.out.println("토끼가 점프합니다. 깡총~ 깡총~");
    }
}
