package com.ohgiraffers.chap03.sectino01.graph_search;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

/* 수업목표. BFS와 DFS를 활용해 동일한 결과가 나오는 것을 확인할 수 있다. */
public class Application04 {
    public static BufferedReader toBufferedReader(String string){
        InputStream is = new ByteArrayInputStream(string.getBytes());
        return new BufferedReader(new InputStreamReader(is));
    }

    static boolean[] visit;
    static int[][] arr;
    static int node, line, start;
    static Queue<Integer> q = new LinkedList<>();

    /* 메모. String 대신 StringBuilder를 사용하는 이유
        String은 불변 객체로 값이 변할 때마다 객체가 새로 생성 -> 메모리 낭비
        StringBuilder는 생성한 객체의 주소값을 참조하여 값이 변할 때 마다 해당 주소값의 내용을 변경
     */
    static StringBuilder sb = new StringBuilder();

    public static String solution(String input) throws IOException {
        /* 설명. 테스트 코드 실행 시 2번째 부터 테스트케이스 문자열이 넘어오면 앞에 누적된 것을 지워주고 시작하기 위한 코드 */
        sb.delete(0, sb.length());      // StringBuilder의 내용을 비움

        BufferedReader br = toBufferedReader(input);
        StringTokenizer str1 = new StringTokenizer(br.readLine());
        node = Integer.valueOf(str1.nextToken());
        line = Integer.valueOf(str1.nextToken());
        start = Integer.valueOf(str1.nextToken());
        arr = new int[node + 1][node + 1];
        visit = new boolean[node + 1];

        for (int i = 0; i < line; i++) {
            StringTokenizer str2 = new StringTokenizer(br.readLine());

            int a = Integer.valueOf(str2.nextToken());
            int b = Integer.valueOf(str2.nextToken());

            arr[a][b] = arr [b][a] = 1;     // 양방향 그래프라는 의미를 가짐
        }

        dfs(start);
        sb.append("\n");

        /* 설명. dfs 할 때 visit 배열을 활용하기 때문에 아래 bfs를 위해 다시 false로 채워진 boolean[]로 초기화 */
        visit = new boolean[node + 1];

        bfs(start);

        /* 설명. StringBuilder -> String */
//        return sb;      // solution의 반환형은 String이기 때문에 StringBuilder 타입인 sb로 반환하면 에러 발생
        return sb.toString();
    }

    private static void bfs(int start) {
        q.add(start);
        visit[start] = true;

        while(!q.isEmpty()) {    // queue가 비어있지 않을 때까지 반복
            start = q.poll();
            sb.append(start + " ");

            /* 설명. node 번호와 인덱스가 동일한 체계이기 때문에 i는 node 번호까지 포함하게 반복되어야 한다. */
            for (int i = 0; i <= node; i++) {
                if (arr[start][i] == 1 && !visit[i]) {
                    q.add(i);
                    visit[i] = true;
                }
            }
        }
    }

    private static void dfs(int start) {
        visit[start] = true;
        sb.append(start + " ");

        /* 설명. node 번호와 인덱스가 동일한 체계이기 때문에 i는 node 번호까지 포함하게 반복되어야 한다. */
        for (int i = 0; i <= node; i++) {
            if(arr[start][i] == 1 && !visit[i])
                dfs(i);
        }
    }
}
