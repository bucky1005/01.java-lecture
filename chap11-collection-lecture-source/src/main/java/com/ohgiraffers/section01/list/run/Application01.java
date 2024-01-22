package com.ohgiraffers.section01.list.run;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;

public class Application01 {
    public static void main(String[] args) {

        /* 수업목표. 컬렉션 프레임워크에 대해 이해할 수 있다. */
        ArrayList aList = new ArrayList();
//        ArrayList<Object> aList = new ArrayList();    // 다이아몬드 연산자(<>)기 없는 제네릭클래스는 <Object>와 같다.

        List list = new ArrayList();                    // List 인터페이스는 객체를 생성(new List)할 수 는 없지만 타입으로써의 역할은 가능
        list = new Vector();

        aList.add("apple");                             // 모든 List 계열은 값을 넣을 때 .add()메소드를 사용한다(자료형 상관 무)
        aList.add((123));                               // 123 -> (Integer)123 -> Object
        aList.add(45.67);
        aList.add(new java.util.Date());

        System.out.println("list = " + list);
        System.out.println("첫 번째 저장된 값: " + aList.get(0));
        System.out.println("두 번째 저장된 값: " + aList.get(1));
        System.out.println("aList에 담긴 데이터의 크기: " + aList.size());

        for (int i = 0; i < aList.size(); i++){
            System.out.println(aList.get(i).toString());    // .toString()을 적지 않아도 적혀있는 것으로 인식
        }

        /* 필기. 배열보다 ArrayList가 나은 점
            1. 크기 할당 불필요
            2. 중간에 값 추가 및 삭제가 용이함.
         */

        /* 설명. 배열과 ArrayList를 활용해 각각 원하는 인덱스에 값 추가해보기 */
        int[] intArr = new int[5];
        int num = 0;
        for (int i = 0; i < intArr.length; i++) {
            intArr[i] = ++num;
        }
        System.out.println("intArr : " + Arrays.toString(intArr));

        int[] newArr = new int[intArr.length + 1];
        System.arraycopy(intArr, 0, newArr, 0, intArr.length);
        System.out.println("newArr: " + Arrays.toString(newArr));

        /* 설명. 2번 인덱스 자리에 2를 끼워넣기 => 배열의 맨 뒤보터 한칸씩 뒤로 밀어낸 후 값을 삽입 */
        for (int i = newArr.length - 2; i > 1; i--) {       // 전체 길이에서 -2를 하면 새로 생긴값을 제외한 가장 마지막값이 출발점
//        for (int i = 2; i < newArr.length; i++) {       // 기존의 값을 뒤로 옮길 때 앞의 인덱스부터 옮기면 안됨.
            newArr[1 + i] = newArr[i];
        }
        System.out.println(Arrays.toString(newArr));

        newArr[2] = 7;          // 2번 인덱스에 7 끼워넣기

        System.out.println(Arrays.toString(newArr));

        /* 설명. ArrayList에서 제공하는 add 메소드로 쉽게 해 보자. */
        ArrayList<Integer> intArrList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {           // 배열의 0~4인덱스
            intArrList.add(i+1);                // 각 인덱스에 1~5 삽입
        }
        System.out.println(intArrList);
        intArrList.add(2, 7);     // 2번 인덱스에 7 끼워넣기
        System.out.println(intArrList);

        /* 설명. ArrayList는 중복 저장을 허용한다. */
        System.out.println(aList);
        aList.add(123);
        aList.add("apple");
        System.out.println(aList);      // 중복된 데이터를 배열에 계속 저장할 수 있음.

        /* 설명. .set() 메소드로 원하는 인덱스의 값을 원하는 값으로 수정할 수 있다. */
        aList.set(1, 777);
        System.out.println(aList);

        /* 설명. .remove() 메소드로 원하는 인덱스의 값을 삭제하면 자동으로 크기도 줄여준다. */
        aList.remove(1);
        System.out.println(aList);

        /* 설명. 인덱스값이 아닌 데이터값을 통해 삭제하고 싶은 경우 다음과 같이 할 수 있다. */
        aList.remove(aList.indexOf("apple"));               // apple이 여러개 인 경우 앞의 인덱스에 저장된 것 하나만 삭제됨
        System.out.println("apple 삭제: " + aList);
    }
}
