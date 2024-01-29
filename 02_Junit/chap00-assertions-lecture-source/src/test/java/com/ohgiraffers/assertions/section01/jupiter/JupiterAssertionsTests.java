package com.ohgiraffers.assertions.section01.jupiter;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.awt.*;

public class JupiterAssertionsTests {

    /* 수업목표. junit5에서 제공하는 Assertions의 메소드에 대해 이해하고 활용할 수 있다. */

    /* 목차 1. assertEquals */
    /* 필기. assertEquals(expected, actual) 메소드는 실제 값과 기대 값의 일치 여부를 동일성으로 판단한다. */
    @Test
    public void testAssertEquals(){

        /* 메모. 주어진(given) 재료를 가지고 언제(when) 이를 수행하면 어떠한(then) 결과값이 나타난다. */
        /* 설명 1. given  */
        int firstNum = 10;
        int secondNum = 20;
        int expeted = 30;         // then의 결과가 passed
//        int expeted = 32;           // then의 결과가 failed

        /* 설명 2. when */
        Calculator calculator = new Calculator();
        int result = calculator.plusTwoNumbers(firstNum, secondNum);

        /* 설명 3. then */
        /* 메모. 실제 값과 기대값을 비교하여 원하는 값이 나오면 초록, 아닌 경우 빨간색으로 표시됨 */
//        Assertions.assertEquals(expeted, result);
//        Assertions.assertEquals(expeted, result, 1);                     // delta값은 오차범위를 설정한 것
        Assertions.assertEquals(expeted, result, "이건 정확해야해!");    // failed 시 출력할 메세지 설정
    }

    /* 필기. assertNotEquals(expected, actual) 메소드는 실제 값과 기대 값의 불일치 여부를 동일성으로 판단한다. */
    @Test
    @DisplayName("인스턴스 동일성 비교 테스트")
    void testAssertNotEqualsWithInstances() {

        // given
        Object obj1 = new Object();

        // when
        Object obj2 = new Object();

        // then
        Assertions.assertNotEquals(obj1, obj2);     // 결과: 두 객체의 주소값이 다르므로 true

        /* 설명. equals()의 hashCode()가 오버라이딩 되어 있다면 동등비교로 판단한다. */
    }

    /* 목차 3. assertNull */
    @Test
    @DisplayName("null인지 테스트")
    void testAssertNull(){
        String str;

        str = null;

        Assertions.assertNull(str);
    }

    /* 목차 4. assertNotNull */
    @Test
    @DisplayName("null이 아닌지 테스트")
    void testAssertNotNull(){
        String str;

        str = "java";

        Assertions.assertNotNull(str);

        Assertions.assertNull(str);
    }

    /* 목차 5. 자주 쓰는 나머지 간단한 단정문 */
    /* 설명. assertTrue(), assertFalse() */

    /* 목차 6. assertAll */
    @Test
    @DisplayName("동시에 여러가지 값에 대한 검증을 수행하는 경우 테스트")
    void testAssertAll(){

        // given
        String firstName = "길동";
        String lastName = "홍";

        // when
        Person person = new Person(firstName, lastName);

        // then
        /* 메모. assertAll은 단정문 하나로 테스트 여러개를 수행 가능 */
        Assertions.assertAll(
                "그룹화된 테스트의 이름(테스트 실패시 보여짐)",
                () -> Assertions.assertEquals(firstName, person.getFirstName(), () -> "firstName이 잘못됨"),
                () -> Assertions.assertEquals(lastName, person.getLastName(), () -> "lastName이 잘못됨")
        );
    }

    /* 목차 7. assertThrows */
    /* 메모. 예외 처리가 제대로 되었는지 확인하는 테스트 케이스 */
    @Test
    @DisplayName("void 메소드의 경우 exception이 발생하는지 테스트")
    void testAssertThrows(){

        int firstNum = 10;
        int secondNum = 0;
        String expectedErrorMessage = "0으로 나눌 수 없습니다.";

        PositiveNumberValidator validator = new PositiveNumberValidator();
        /* 메모. 예외가 발생하면 assertThrows라는 메소드가 예외를 받아옴 */
        Exception exception = Assertions.assertThrows(
                Exception.class,
                () -> validator.checkDividableNumbers(firstNum, secondNum)
        );

        Assertions.assertAll(
                () -> Assertions.assertInstanceOf(IllegalArgumentException.class, exception,
                    () -> "예외 타입이 일치하지 않음"),
                () -> Assertions.assertEquals(expectedErrorMessage, exception.getMessage(),
                    () -> "예외 메세지가 일치하지 않음")
        );
    }
}
