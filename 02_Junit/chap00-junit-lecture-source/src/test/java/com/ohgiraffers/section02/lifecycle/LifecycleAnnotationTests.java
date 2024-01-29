package com.ohgiraffers.section02.lifecycle;

import org.junit.jupiter.api.*;

public class LifecycleAnnotationTests {

    /* 수업목표. 테스트메소드의 실행 전 후에 동작하는 어노테이션을 사용할 수 있다. */
    /* 설명. 모든 테스트 메소드와 라이프사이클 관련 메소드는 void 반환형으로 작성하고, abstract은 불가능하다.
        또한, 접근제어자는 사용하지 않아도 되지만(default) private이면 안된다. */

    /* 메모. 모든 테스트를 위한 사전 작업을 하는 공간으로 처음 한번만 실행됨 */
    @BeforeAll
    public static void beforeAll(){
        System.out.println("beforeAll");
    }

    /* 메모. 테스트를 위한 사전 작업을 하는 공간으로 매 테스트가 실행되기 전 한번씩 실행됨
        주로 테스트 전에 필요한 목업 데이터를 미리 세팅해줄 목적으로 사용 */
    @BeforeEach
    public void beforeEach(){
        System.out.println("beforeEach");
    }

    @Test
    public void test1(){
        System.out.println("test1");
    }

    @Test
    public void test2(){
        System.out.println("test2");
    }

    /* 메모. 테스트를 위한 후처리 작업을 하는 공간으로 매 테스트가 끝난 직후 한번씩 실행됨
        주로 단위 테스트들이 수정된 이후 사용한 자원을 반납/해제할 목적으로 사용 */
    @AfterEach
    public void afterEach() {
        System.out.println("afterEach");
    }

    /* 메모. 모든 테스트를 위한 후처리 작업을 하는 공간으로 모든 테스트가 끝난 후 한번만 실행됨 */
    @AfterAll
    public static void afterAll(){
        System.out.println("afterAll");
    }
}
