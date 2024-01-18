package com.ohgiraffers.section05.overloading;

public class OverloadingTest {

    /* 수업목표. 오버로딩(Overloading)에 대해 이해할 수 있다. */

    /* 필기. 메소드의 시그니처
        public void method(int num) {} 이라는 메소드의 메소드명과 파라미터 선언부 부분을
        메소드의 시그니처(signature)라고 한다. (즉, method(int num) 부분)

       필기.
        동일한 메소드 이름으로 다양한 종류의 매개변수에 따라 처리해야 하는 경우 적용하는 기술을 오버로딩 이라고 한다.

       필기. 오버로딩의 조건?
        매개변수의 타입, 갯수, 순서를 다르게 작성하여 하나의 클래스 내에 동일한 이름의 메소드를 여러개 작성할 수 있다.
        메소드의 헤드부에 있어 시그니처를 제외한 부분이 다르게 작성되는 것은 인정되지 않는다.
     */
    public void test() { }
//    public String test() { }                    // 메소드명(=메소드의 시그니처, test())가 동일하여 에러가 발생

    public void test(int num) { }               // 오버로딩 시 시그니처의 메소드명과 매개변수로 중복인지 판단

    /* 설명. 매개변수의 개수를 달리하여 생성 가능 */
    public void test(int num, int num2) { }

    /* 설명. 매개변수의 타입을 달리하여 생성 가능 */
    public void test(int num, String str) { }

    /* 설명. 매개변수의 타입의 순서를 탈리하여 생성 가능  */
    public void test(String str, int num) { }
//    public void test(String str1, int num1) { }     // 매개변수의 이름은 영향을 미치지 않음. 자료형과 개수가 같으므로 중복으로 판단
}
