
public class Application01 {
    public static void main(String[] args) {

        /* 수업목표. 패키지에 대해 이해할 수 있다. */

        /* 목차 1. non-static 메소드 호출 */
        /* 설명. 다른 패키지에 있는 메소드 호출 */
        com.ohgiraffers.section01.method.Calculator cal
                = new com.ohgiraffers.section01.method.Calculator();

        int plustResult = cal.plusTwoNumbers(100, 20);
        System.out.println("100과 20의 합: "+ plustResult);

        /* 목차 2. static 메소드 호출 */
        int maxResult = com.ohgiraffers.section01.method.Calculator.maxNumbersOf(100, 20);

        System.out.println("두 수 중 큰값 : " + maxResult);
    }
}
