package com.ohgiraffers.section06.statickeyword;

public class StaticFieldTest {

    private int nonStaticCount;
    private static int staticCount;

    /* 설명. 기본생성자 및 getter만 생성 */
    public StaticFieldTest() { }

    public int getNonStaticCount() {
        return nonStaticCount;
    }

    public static int getStaticCount() {
        return staticCount;
    }

    /* 설명. setter를 대신해서 필드값을 각각 증가시킬 두 메소드 추가 */
    public void increaseNonStaticCount() {
        this.nonStaticCount++;
    }

    public static void increaseStaticCount() {
//        StaticFieldTest.staticCount++;            // static 변수는 본래 클래스명.변수명으로 사용하지만, 같은 클래스내에서는 클래스명을 생략 가능
        staticCount++;
    }
}
