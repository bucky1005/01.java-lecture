package com.ohgiraffers.section01.method;

public class Calculator {
    public int plusTwoNumbers(int first, int second){
        return first + second;
    }
    public int subTwoNumbers(int first, int second){
        return first - second;
    }
    public int multiTwoNumbers(int first, int second){
        return first * second;
    }
    public int divideTwoNumbers(int first, int second){
        return first / second;
    }
    private int minNumbersOf(int first, int second){    // 접근 제어자 private는 해당 클래스 내에서만 접근가능한 메소드이다.
        return (first > second) ? second : first;
    }
    public static int maxNumbersOf(int first, int second){
        return (first > second) ? first : second;
    }
}
