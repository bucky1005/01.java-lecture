package com.ohgiraffers.section03.map.run;

import java.util.*;

public class Application01 {
    public static void main(String[] args) {

        /* 수업목표. Map의 자료구조에 대해 이해하고 HashMap을 이용할 수 있다. */
        Map<Object, Object> hmap = new HashMap<>();
        Map<String, String> hmap2 = new HashMap<>();

        /* 설명. .put(key, value)으로 값 추가 */
        hmap.put("one", new Date());
        hmap.put(12, "red apple");
        hmap.put(33, 123);

        System.out.println("키가 \"one\"인 value값: " + hmap.get("one"));
        System.out.println("키가 33인 value값: " + hmap.get(33));
        System.out.println("Map의 toString(): " + hmap.toString());

        /* 설명. 키 값은 중복되면 이후 put 되는 키와 밸류가 덮어씌운다.(주의할 것) */
        hmap.put(12, "purple banana");
        System.out.println(hmap.get(12));

        /* 설명. 밸류는 중복되어도 상관이 없다. */
        hmap.put(77,"purple banana");
        System.out.println(hmap.toString());

        System.out.println("Map이 지닌 entry의 수: " + hmap.size());

        /* 설명. .remove(key)로 값을 삭제 */
        System.out.println("77번 키와 관련된 entry 삭제: " + hmap.remove(77));
        System.out.println("삭제 후 entry의 수: " + hmap.size());

        /* 필기. Map을 반복하여 각 entry들(키와 밸류)을 활용해보자. */
        HashMap<String, String> hmap3 = new HashMap<>();

        hmap3.put("one", "java 17");
        hmap3.put("two", "mariaDB 10");
        hmap3.put("three", "servlet/jsp");
        hmap3.put("four", "springboot 3.0");
        hmap3.put("five", "vue.js");

        /* 목차 1. keySet()을 활용한 iterator 활용하기 (key값만 취함) */
        Set<String> keys = hmap3.keySet();
        Iterator<String> iter = keys.iterator();
        while(iter.hasNext()) {
            System.out.println(iter.next());
            System.out.println("key값: " + keys + ", value값: " + hmap3.get(keys));
        }

        /* 목차 2. entrySet()을 활용한 iterator 활용하기 (key와 value 모두 취함) */
        Set<Map.Entry<String, String>> set = hmap3.entrySet();
        Iterator<Map.Entry<String,String>> iterEntry = set.iterator();

        while(iterEntry.hasNext()){
            Map.Entry<String,String> entry = iterEntry.next();

            System.out.println("key값: " + entry.getKey() + ", value값: " + entry.getValue());
        }
    }
}
