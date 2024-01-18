package com.ohgiraffers.section01.literal;

public class Application02 {
    public static void main(String[] args) {

        // 수업목표. 값을 직접 연산하여 출력할 수 있다.

        // 목차 1. 숫자와 숫자의 연산
        System.out.println("================= 정수와 정수의 연산 =================");
        System.out.println(123 + 456);
        System.out.println(123 - 23);
        System.out.println(123 * 10);
        System.out.println(123 / 10);
        System.out.println(123 % 10);           // modulus 연산자(mod 연산자)

        System.out.println("================= 실수와 실수의 연산 =================");
        System.out.println(1.23 + 1.23);
        System.out.println(1.23 - 0.23);
        System.out.println(1.23 * 10.0);
        System.out.println(1.23 / 10.0);
        System.out.println(1.23 % 1.0);         // 결과값: 0.22999999999999998 실수는 정확하지 않고 근사값이다. 즉 계산값이 정확하지 못함

        /* 필기. 정수와 실수의 연산 결과는 실수가 나온다. (정수를 실수로 자동으로 바꿔 연산) */
        System.out.println("================= 정수와 실수의 연산 =================");
        System.out.println(123 + 0.5);  // 123.0 + 0.5 로 연산됨
        System.out.println(123 - 0.5);
        System.out.println(123 * 0.5);
        System.out.println(123 / 0.5);
        System.out.println(123 % 0.5);

        // 목차 2. 문자의 연산
        /* 필기. 문자와 정수의 연산은 정수와 정수의 연산과 같다.(유니코드 기반의 숫자로 변환) */
        System.out.println("================= 문자와 정수의 연산 =================");
        System.out.println('a' + 1);        // 결과값: 98, 소문자 a는 유니코드로 97
        System.out.println('a' - 1);        // 결과값: 97
        System.out.println('a' * 2);
        System.out.println('a' / 2);
        System.out.println('a' % 2);

        /* 필기. 문자와 실수의 연산은 정수와 실수의 연산과 같다.*/
        System.out.println("================= 문자와 실수의 연산 =================");

        // 목차 3. 문자열의 연산
        /* 필기. 문자열간의 연산은 덧셈(이어붙이기)만 가능하다.*/
        System.out.println("================= 문자열과 문자열의 연산 =================");
        System.out.println("hello" + "world");
//        System.out.println("hello" - "world");
//        System.out.println("hello" * "world");
//        System.out.println("hello" / "world");
//        System.out.println("hello" % "world");

        /* 필기. 다른 형태의 타입은 모두 문자열로 자동 형변환된다. */
        System.out.println("================= 문자열과 다른 형태의 값 연산 =================");

        /* 설명. 문자열과 정수의 연산 */
        System.out.println("helloworld" + 123);

        /* 설명. 문자열과 실수의 연산 */
        System.out.println("hellowold" + 123.456);

        /* 설명. 문자열과 문자의 연산 */
        System.out.println("hellowolrd" + 'a');

        /* 설명. 문자열과 논리값의 연산 */
        System.out.println("helloworld" + true);

        /* 필기. 이항 연산자들의 묶음에서 연산의 수행은 왼쪽 -> 오른쪽으로 이항씩 순차적으로 진행된다.
        *   1) 123 + 3 = 126 (숫자 연산)
        *   2) 126 + HelloWorld = 126HelloWorld (문자열 연산)
        *   3) 126HelloWorld + 123 = 126HelloWorld123 (문자열 연산)
        *   4) 126HelloWorld123 + 3 = 126HelloWorld1233 (문자열 연산)
        *   최종 결과값 : "126HelloWorld1233"*/
        System.out.println(123 + 3 + "HelloWorld" + 123 + 3);

        /* 설명. 문자열 뒤에 숫자를 활용한 연산을 하게 되면 소괄호'()'를 써서 우선순위를 높여야 한다.*/
        System.out.println("합계: " + (123 + 456));

        // 목차 4. 논리값의 연산
        /* 설명. 대부분의 연산이 적용되지 않고 논리와 문자열의 연산만 가능하다. */
//        System.out.println(true + 1);
//        System.out.println(true * 1);

        System.out.println("================= 논리값과 문자열 형태의 값 연산 =================");
        System.out.println(true + "문자열");
    }
}
