package com.ohgiraffers.section05.typecasting;

public class Application02 {
    public static void main(String[] args) {
        /* 수업목표. 강제 형변환 규칙에 대해 이해할 수 있다. */

        /* 필기.
            강제형변환
            바꾸려는 자료형으로 캐스트 연산자(자료형)을 이용하여 형변환 한다.
         */

        long lnum = 8L;
        int inum = (int)lnum;           // 데이터 손실을 감수하고 다운캐스팅 시에는 주의해야 한다.
        System.out.println("inum + " + inum);

        float avg = 31.235f;            //실수 변수에서
        int floatNum = (int)avg;        // 정수로 다운캐스팅 시에는 소수점 이하가 제거된다.(삭제).
        System.out.println("floatNum = " + floatNum);

    }
}
