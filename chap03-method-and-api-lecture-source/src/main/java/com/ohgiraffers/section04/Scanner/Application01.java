package com.ohgiraffers.section04.Scanner;

import java.util.Scanner;

public class Application01 {
    public static void main(String[] args) {

        /* 수업목표. java.uutil.Scanner를 이용한 다양한 자료형 값 입력 받기 */
//        java.util.Scanner sc = new java.util.Scanner(System.in);    // Scanner는 non-static 클래스이므로 import 하지 않고 사용하려면 패키지까지 모두 작성해야 한다.
        Scanner sc = new java.util.Scanner(System.in);              // import를 하면 다음과 같이 간단하게 사용 가능하다.

        /* 목차 1. 문자열 입력 받기 */
        System.out.print("성을 입력하세요: ");
        String lastName = sc.next();                // next()는 입력한 데이터에서 공백이나 개행 전까지의 문자열을 반환한다.
                                                    // Hello World 에서 Hello만 저장이되고, 다시 next를 사용하면 버퍼에 남아있던 World가 저장된다.
        sc.nextLine();                              // 버퍼에 남아있는 개행 및 공백을 없애는 코드
        System.out.print("이름을 입력하세요: ");
        String firstName = sc.nextLine();           // nextLine()은 공백이나 개행을 포함한 한 줄의 몬자열 모두 반환한다.
                                                    // 즉, 이전에 입력했던 값 중에 엔터가 버퍼에 남아있는 상태라면 nextLine 사용 시 버퍼에 남아있던 엔터를 사용자 입력으로 간주하여 처리해버린다.
        System.out.println("입력하신 이름은 \'" + lastName + firstName + "\' 입니다.");

        /* 목차 2. 정수형 입력 받기 */
        System.out.print("나이를 입력하세요: ");
        int age = sc.nextInt();
        System.out.println("입력하신 나이는 \'" + age + "\' 입니다.");

        /* 목차 3. 실수형 입력 받기 */
        System.out.print("키를 입력하세요: ");
        double height = sc.nextDouble();
        System.out.println("입력하신 키는 \'" + height + "\' 입니다.");

        /* 목차 4. 논리형 입력 받기 */
//        System.out.print("true나 false 중 하나를 입력하세요: ");
        System.out.print("광고성 메세지 수신에 동의하면 true, 아니면 false를 입력하세요: ");
        boolean isTrue = sc.nextBoolean();
//        System.out.println("입력하신 값은 \'" + isTrue + "\' 입니다.");
        if(isTrue == true)
            System.out.println("광고성 메세지 수신에 동의하셨습니다.");
        else
            System.out.println("광고성 메세지 수신을 거절하셨습니다.");

        sc.nextLine();      // 버퍼에 남아있는 개행 및 공백을 없애는 코드

        /* 목차 5. 문자형 입력 받기 */
        System.out.print("아무 문자나 입력하세요: ");
        char answer = sc.nextLine().charAt(0);          // 메소드 체이닝 방식으로 사용자의 입력 값에서 인덱스번째의 문자를 char형으로 반환
        System.out.println("입력하신 문자는 \'" + answer + "\' 입니다.");
    }
}
