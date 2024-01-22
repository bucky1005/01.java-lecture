package com.ohgiraffers.section03.stringbuilder;

public class Application01 {
    public static void main(String[] args) {
        /* 수업목표. String과 StringBuilder의 차이점에 대해 이해하고 사용할 수 있다. */
        /* 필기.
            StringBuilder: StringBuffer보다 성능이 좋음
            StringBuffer: thread safe 기능이 추가적으로 동작함.(상대적으로 성능이 안좋음)
         */

        StringBuilder sb = new StringBuilder("java");
//        StringBuilder sb2 = "java";               // StringBuilder는 문자열을 다루지만 리터럴은 다루지 않음(에러 발생)
        System.out.println(sb);

        /* 설명. String과 StringBuilder로 수정 시 객체 주소값 변화 살펴보기 */
        String testStr = "java";
        StringBuilder testSb = new StringBuilder("kotiln");

        for (int i = 0; i < 9; i++) {
            testStr += i;               // 문자열이 합성됨
            testSb.append(i);           // 문자열이 합성됨 (StringBuilder는 + 연산자로 문자열 합성 연산이 이루어지지 않음

            /* 필기.
                String은 hashCode() 메소드가 동등 비교를 위해 오버라이딩 되어 있어 주소값 확인이 어렵다.
                따라서 System.identityHashCode() 메소드를 활용해 String으로 관리되는 문자열과 StringBuilder로
                관리되는 문자열이 각각 변화를 줄 때 새로운 객체를 생성하는지 살펴보자.
             */
            // System.identityHashCode(): hashCode()가 오버라이딩 되었을 때 원래의 주소값을 출력하기 위한 메소드
            System.out.println("String의 경우: " + System.identityHashCode(testStr));
            System.out.println("StringBuilder의 경우: " + System.identityHashCode(testSb));

            // 실행결과:
            // String은 값이 변화할 때마다 새로운 객체가 생성되어 주소값이 매번 바뀌고,
            // StringBuilder의 경우 값이 계속 변해도 주소값이 바뀌지 않는 것을 확인할 수 있음
            // 따라서 자주 변화하는 문자열을 사용할 때에는 String보다 StringBuilder를 사용하는 것이 메모리 효울이 좋음
        }

        System.out.println("String의 결과: " + testStr);
        System.out.println("StringBuilder의 결과: " + testSb);
    }
}
