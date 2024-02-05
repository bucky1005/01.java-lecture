package com.ohgiraffers.chap06.section01.dp;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Application02 {
    public static BufferedReader toBufferedReader(String str) {
        InputStream is = new ByteArrayInputStream(str.getBytes());
        return new BufferedReader(new InputStreamReader(is));
    }

    public static int solution(int n){

        int[] dp = new int[1000 + 1];       // 0번 인덱스를 사용하지 않고 1000개의 칸을 만들어야 하므로 + 1
        dp[1] = 1;
        dp[2] = 2;

        for (int i = 3; i <= n; i++) {
            dp[i] = (dp[i - 1] + dp[i - 2]);    // 앞의 두 개의 경우의 수를 더한 값
        }
        return dp[n];
    }
}
