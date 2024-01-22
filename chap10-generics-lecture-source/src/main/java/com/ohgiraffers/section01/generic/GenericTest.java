package com.ohgiraffers.section01.generic;

/* 필기.
    제네릭 클래스의 다이아몬드 연산자(<>) 안에는 4가지 타입을 지정할 수 있다.
    1. E: Elements => 배열을 다룰 때 사용
    2. T: Type     => 일반 자료형을 다룰 때 사용
    3. K: Key
    4. V: Value    => K, V는 Map을 다룰 때 사용
 */
public class GenericTest<T> {       // 배열을 다룰 경우 E, 일반 자료형을 다룰 경우 T로 사용
    /* 설명. 필드 및 메소드의 매개변수와 반환형의 자료형(Type)은 현재 정해져 있지 않은 상태이다. */

    private T value;

    public T getValue() {
        return value;
    }

    public void setValue(T value){
        this.value = value;
    }
}
