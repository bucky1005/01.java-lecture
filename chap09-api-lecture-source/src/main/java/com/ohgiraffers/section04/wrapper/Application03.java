package com.ohgiraffers.section04.wrapper;

public class Application03 {
    public static void main(String[] args) {
        // valueOf만 쓰면 기본자료형으로 바꾸는 것
        // toString까지 쓰면 문자열로 바꾸는 것
        String b = Byte.valueOf((byte)1).toString();
        String s = Short.valueOf((short)2).toString();
        String i = Integer.valueOf(4).toString();
        String l = Long.valueOf(8L).toString();
        String f = Float.valueOf(4.0f).toString();
        String d = Double.valueOf(8.0).toString();
        String bl = Boolean.valueOf(true).toString();
        String c = Character.valueOf('a').toString();

        String str = String.valueOf(10);
        String str2 = 123 + "";

    }
}
