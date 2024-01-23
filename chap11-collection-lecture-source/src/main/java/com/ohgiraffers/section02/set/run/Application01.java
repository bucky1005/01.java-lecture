package com.ohgiraffers.section02.set.run;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;

public class Application01 {
    public static void main(String[] args) {

        /* 수업목표. Set 자료구조의 특성을 이해하고 hashSet을 이용할 수 있다. */
//        HashSet<String> hset = new HashSet<>();
        Set<String> hset = new HashSet<>();
        hset.add(new String("java"));
        hset.add(new String("mariaDB"));
        hset.add(new String("servlet"));
        hset.add(new String("spring"));
        hset.add(new String("html"));

        // 설명. Set에 넣은 값이 순차적으로 들어가는 것이 아니라 랜덤하게 저장됨(인덱스가 없음)
        // 한번 입력된 값은 처음 저장된 위치 그대로 저장되어 있음
        System.out.println("hset = " + hset);

        /* 설명. 중복값은 Set에 추가되지 않는다.(동등 객체 저장 안함)(feat. equals와 hashCode 오버라이딩 필수) */
        /* 설명. 중복되는 값이 있으면 새로 추가하려는 객체의 주소가 튕겨나간다.(덮어쓰지 않음) */
        // String 객체는 equals와 hashCode가 오버라이딩 되어있음.
        hset.add(new String("mariaDB"));
        hset.add(new String("mariaDB1"));
        System.out.println("hset = " + hset);

        /* 설명. 인덱스 개념이 없는 Set은 iterator(반복자)를 돌리거나 배열로 바꿔야 확인 가능하다. */
        /* 설명. iterator로 값을 출력하고 나면 배열에 있는 값을 모두 소모하여 출력한다. */
        Iterator<String> iter = hset.iterator();        // Generic을 String으로 걸어주어야
        while (iter.hasNext()){
            System.out.println(iter.next());            // 해당 반환값이 다운캐스팅 없이 String으로 반환된다.
        }
        System.out.println("iter 출력 완료\n");

        Iterator<String> iter2 = hset.iterator();
        while (iter.hasNext()){
            System.out.println(iter.next());
        }
        System.out.println("iter2 출력 완료\n");

        /* 궁금. iter에서 주소만 복사한다면 위에 iterator를 돌린 후에 hset에는 값이 남아있지 않을 텐데
            아래에 objArr에 어떻게 값이 복사된 것인지 궁금
            => iterator를 사용하여 객체를 새로 생성하고, iter는 hset을 참조하여 값을 복사해온 것.
            따라서 iterator를 돌리고 난 후에도 iter에 복사된 값이 삭제되고 hset의 값이 삭제가되는 것은 아니다.
            또한, iter에 저장되어있던 hset의 주소값도 삭제되므로
            iterator를 돌린 후 iter를 통해 hset에 접근하려고 하면 에러가 발생한다.
         */
        /* 설명. HashSet 타입을 일반 배열로 변경 -> 인덱스가 생겨 값 조회가 편리해짐 */
        Object[] objArr = hset.toArray();
        for(Object obj: objArr)
            System.out.println(obj);

        System.out.println("size(): " + hset.size());
        hset.clear();
        System.out.println("size(): " + hset.size());
        System.out.println("isEmpty(): " + hset.isEmpty());
    }
}
