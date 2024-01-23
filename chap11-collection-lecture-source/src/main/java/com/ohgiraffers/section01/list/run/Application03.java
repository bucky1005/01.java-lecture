package com.ohgiraffers.section01.list.run;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Application03 {
    public static void main(String[] args) {

        /* 수업목표. LinkedList에 대해 이해하고 활용할 수 있다. */
        List<String> linkedList = new LinkedList<>();
        linkedList.add("apple");
        linkedList.add("banana");
        linkedList.add("orange");
        linkedList.add("mango");
        linkedList.add("grape");

        System.out.println(linkedList.size() + "개의 자료가 담김");

        /* 설명. List 계열 출력하는 4가지 방법 */
        /* 설명 1. toString() 활용하기 */
        System.out.println("linkedList = " + linkedList);
        System.out.println();

        /* 설명 2. for문 활용하기 */
        for (int i = 0; i < linkedList.size(); i++) {
            System.out.println(linkedList.get(i));
        }
        System.out.println();

        /* 설명 3. for-each문 활용하기** */
        for(String str: linkedList){
            System.out.println(str);
        }
        System.out.println();

        /* 설명 4. iterator 활용하기** */
        // 실제 사용보단 작성된 코드를 해석하는 정도로 공부
        /* 설명. 반복문 안에서 netx()를 두 번 이상 사용하게 된 경우 의도한 것이 아니라면 유의한다(feat.변수활용 */
        Iterator<String> iter = linkedList.iterator();
        while(iter.hasNext()) {
//            System.out.println(iter.next());        // next()는 커서를 이동하는 역할로 반복문에 한번만 나와야함
            String fruit = iter.next();
            System.out.println(fruit);
            System.out.println(fruit);
            System.out.println(fruit);
            System.out.println(fruit);                // 현재 커서 위치의 값을 여러번 출력
        }

        linkedList.set(3, "pineapple");
        System.out.println(linkedList);
                                                      // null은 객체 자체가 없는 것.
        linkedList.clear();                           // 객체는 생성된 상태에서 배열에 저장된 요소를 전부 삭제.(null과는 다름에 주의!)
        System.out.println(linkedList);

        /* 설명. 요소가 없는 list 객체에 대해 boolean값으로 확인 */
        System.out.println(linkedList.isEmpty());     // 객체에 저장된 요소가 없다면 ture, 아니면 false 반환

    }
}
