package com.ohgiraffers.section03.additional;

import org.junit.jupiter.api.*;

import java.util.concurrent.TimeUnit;

/* 설명. Order 어노테이션으로 테스트 메소드 실행 순서를 정하기 위해서 클래스 상단에 추가할 것 */
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class AdditionalAnnocationTests {

    /* 수업목표. Junit에서 제공하는 메소드 관련 추가 어노테이션을 사용할 수 있다. */

    /* 필기. 해당 테스트를 무시할 때 사용하는 어노테이션이다. */
    /* 메모. 더이상 해당 테스트를 사용하지 않을 때 삭제 대신 @Disabled 키워드를 사용한다. */
    @Disabled
    @Test
    public void testIgnore() { }

    /* 필기. 주어진 시간 안에 테스트가 끝나지 않으면 테스트가 실패한다. */
    /* 메모. 실행 시간은 컴퓨터 또는 Thread 상황에 따라 달라질 수 있다. */
    @Test
    @Timeout(value = 1000, unit = TimeUnit.MILLISECONDS)            // 1초 안에 실행되어야 에러가 발생하지 않음
    public void testTimeout() throws InterruptedException {
        Thread.sleep(900);
//        Thread.sleep(1200);                                    // Thread를 1.2초간 멈춰놓음 -> 에러 발생
    }

    /* 메모. 테스트의 우선순위를 매겨서 1순위부터 순차적으로 실행 가능 */
    @Test
    @Order(1)
    public void testFirst(){}

    @Test
    @Order(3)
    public void testThird(){}

    @Test
    @Order(2)
    public void testSecond(){}

    /* 메모. 입력된 횟수만큼 테스트를 반복한다.
        부하테스트를 하고자 할 때 사용할 수 있다. */
    @RepeatedTest(10)
    public void testRepeated(){ }
}
