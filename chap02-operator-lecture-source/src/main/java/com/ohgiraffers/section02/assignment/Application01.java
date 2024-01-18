package com.ohgiraffers.section02.assignment;

public class Application01 {
    public static void main(String[] args) {

        /* 수업목표. 대입 연산자와 산술 복합 대입 연산자를 이해하고 활용할 수 있다. */

        /* 필기.
            대입연산자와 산술 복합 대입 연산자
            '=' :  왼쪽의 피연산자에 오른쪽 피연산자를 대입함
            '+=' : 왼쪽의 피연산자에 오른쪽의 피연산자를 더한 결과를 왼쪽의 피연산자에 대입함
            '-=' : 왼쪽의 피연산자에 오른쪽의 피연산자를 뺀 결과를 왼쪽의 피연산자에 대입함
            '*=' : 왼쪽의 피연산자에 오른쪽의 피연산자를 곱한 결과를 왼쪽의 피연산자에 대입함
            '/=' : 왼쪽의 피연산자에 오른쪽의 피연산자를 나눈 결과를 왼쪽의 피연산자에 대입함
            '%=' : 왼쪽의 피연산자에 오른쪽의 피연산자를 나눈 나머지 결과를 왼쪽의 피연산자에 대입함
         */

        int num = 12;

        System.out.println("num = " + num);

        num = num +3;       // Ram으로 부터 변수를 두번 불러와야 한다.
        System.out.println("num = " + num);

        num += 3;           // 변수를 한번만 불러오게 되므로 해당 방식이 미세하게 더 빠르다.
        System.out.println("num = " + num);

        num -= 5;
        System.out.println("num = " + num);

        num *= 2;
        System.out.println("num = " + num);

        num /= 2;
        System.out.println("num = " + num);

        num %= 10;
        System.out.println("num = " + num);

        /* 주의사항 */
        num =- 5;           // equals(=) 기호가 오른쪽에 와야 복합 대입 연산자가 된다.
                            // 해당 연산은 num = -5;로 취급됨.
        System.out.println("num = " + num);
    }
}
