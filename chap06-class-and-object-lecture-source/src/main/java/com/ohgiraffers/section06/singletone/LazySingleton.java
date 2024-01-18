package com.ohgiraffers.section06.singletone;

public class LazySingleton {

    private static LazySingleton lazy;

    public LazySingleton() { }

    public static LazySingleton getInstance() {

        if (lazy == null) {                 // static 변수인 lazy에 한번도 객체가 생성 및 할당된 적이 없다면
            lazy = new LazySingleton();     // lazy 에는 new LazySingletone()의 주소값이 반환됨.
        }
        return lazy;
    }

}
