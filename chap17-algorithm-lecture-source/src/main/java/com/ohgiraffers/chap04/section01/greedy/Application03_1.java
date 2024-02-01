package com.ohgiraffers.chap04.section01.greedy;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;


public class Application03_1 {
    public static BufferedReader toBufferedReader(String str){
        InputStream is = new ByteArrayInputStream(str.getBytes());
        return new BufferedReader(new InputStreamReader(is));
    }
    public static int solution(String input) throws IOException {

        int max_count = 0;      // 회의를 열 수 있는 최대 수
        BufferedReader br = toBufferedReader(input);

        int N = Integer.valueOf(br.readLine());         // 회의 수
        int[][] time = new int[N][2];                   // (회의 개수 * (시작 시간 + 종료 시간) 일차원 배열)인 이차원 배열
        StringTokenizer str;
        for (int i = 0; i < N; i++) {
            str = new StringTokenizer(br.readLine());
            time[i][0] = Integer.valueOf(str.nextToken());      // 회의 시작 시간 (i는 회의 개수)
            time[i][1] = Integer.valueOf(str.nextToken());      // 회의 종료 시간
        }

        /* 설명. 그리디 알고리즘으로 접근하자면 하나의 회의실에서 가장 많은 회의를 열기 위해서는
            회의가 가장 빨리 끝나는 시간(종료시간 오름차순) 순서로 고민하는 것이 좋다. */
        /* 메모. 복습
            1. 람다식 => 추상메소드가 1개인 FuntionalInterface를 오버라이드할 때 람다식을 사용
            2. compare 타입: 매개변수 O, 반환형 O (매개변수 2개, 반환형 int)
         */
        Arrays.sort(time, (o1, o2) -> {
            if(o1[1] == o2[1]){             // 회의 종료 시간이 같으면

                /* 설명. 시작 시간이 늦은 순서로(내림차순) 정렬 기준을 잡는다.
                    회의 시간이 짧아지는 순서로 쌓기 위함  */
                return o2[0] - o1[0];       // 시작 시간으로 내림차순 정렬(매개변수 순서가 반대이면 내림차순)
            }
            /* 설명. 종료 시간이 같지 않을 때는 종료 시간이 이름 회의부터 정렬되도록 기준을 잡는다.(종료시간 오름차순) */
            return o1[1] - o2[1];           // 매개변수 순서가 그대로이면 오름차순
        });

        /* 설명. 앞선 회의가 끝나는 시간을 담아놓을ㄹ 변수 선언 */
        int end = 0;

        /* 설명. time 배열에 담긴 회의들을 확인하며 앞선 회의의 종료 다음 회의가 진행되는지 판별해 가능한 회의 추출 */
        for (int i = 0; i < N; i++) {
            if(end <= time[i][0]){
                /* 설명. 앞선 회의가 끝나는 시간과 일치하거나 이후에 시작하는 회의 인가 */
                end = time[i][1];
                max_count++;
            }
        }
        return max_count;
    }
}
