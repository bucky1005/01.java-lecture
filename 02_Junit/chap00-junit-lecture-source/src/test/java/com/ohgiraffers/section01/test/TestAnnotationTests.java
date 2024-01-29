package com.ohgiraffers.section01.test;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/* 필기. 테스트 클래스들은 클래스명 끝에 'Tests'를 붙여 작명한다 */
public class TestAnnotationTests {

    /* 수업목표. Jnit5의 기본 어노테이션을 사용할 수 있다. */
    /* 필기.
        단위 테스트: layer architecture에서 각 계층마다 단위 메소드를 하는 것을 말한다.
        통합 테스트: layer 단위가 아닌 전체 기능 동작에 대해 테스트 하는 것을 말한다.
        테스트 케이스: 테스트 대상이 되는 기능에 대해 시나리오 별로 어떤 것을 테스트 하는 지에 대해 정의한 것을 말한다.
     */
    /* 메모. 기능 단위로 테스트를하여 초록불이 들어오는지 확인할 수 있음 */

    /* 설명.
        @Test는 기본적인 테스트 메소드를 만들기 위해 사용하는 어놑테이션이다.
        @Test 메소드는 main 메소드가 아니어도 단독으로 실행이 가능하다
     */
    @Test
    /* 설명. DisplayName은 해당 테스트 메소드로 테스트하는 테스트케이스에 대해 작성한다. */
    /* 메모. 테스트케이스
        단위 테스트:
            - Service 업체(자체 서비스를 개발 ex) 네카라쿠배당토 )
                서비스 업체에서는 계층(Controller, Service, DTO 등)마다 작동을 테스트하는 것을 단위테스트라고 함
            - SI 업체(프로젝트를 수주하여 고도화)
                SI 업체에서는 각 기능 단위 하나하나 테스트하는 것을 단위테스트라고 함.
        통합 테스트:
     */
    @DisplayName("테스트 메소드가 통과되는지 확인")
    public void testMethod1(){

    }

    /* 메모. 과거 @DisplayName이 없을 땐 케이스에 대한 설명을 공백문자를 언더스코어로 표기한 한글 메소드 형태로 작성하였다. */
    @Test
    @DisplayName("우선순위가 높음")
    public void 매개변수로_1과_3을_넘겼을_때_합계를_int형으로_잘_반환하는지_확인() {

    }

}
