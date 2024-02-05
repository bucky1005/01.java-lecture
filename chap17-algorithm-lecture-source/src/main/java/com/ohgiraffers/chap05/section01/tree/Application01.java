package com.ohgiraffers.chap05.section01.tree;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/* 수업목표. 트리(Tree) 알고리즘을 활용하는 예제를 이해할 수 있다. */
/* 필기. 그래프에서 계층적인 구조를 나타내기 위해 최상위 노드인 루트(root) 노드에서 시작하여
        하위 노드들로 분기하는 방식으로 구성된 알고리즘이다.
 */
public class Application01 {
    static int N;

    /* 메모. 자식노드와 동일한 인덱스에 부모 노드값을 대입 */
    static int[] parent;
    static boolean[] isVisit;
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();

    /* 메모. 양방향 트리를 나타내기 위한 것 */
    static List<Integer>[] list;
    public static BufferedReader toBufferedReader(String str) {
        InputStream is = new ByteArrayInputStream(str.getBytes());
        return new BufferedReader(new InputStreamReader(is));
    }

    public static String solution(String input) throws IOException {
        BufferedReader br = toBufferedReader(input);
        sb.delete(0, sb.length());

        N = Integer.valueOf(br.readLine());

        /* 설명. node 번호와 인덱스 번호를 일치시키기 위해서 입력받은 노드 크기 + 1 */
        isVisit = new boolean[N + 1];
        list = new ArrayList[N + 1];        // ArrayList를 관리하는 배열
        parent = new int[N + 1];

        for (int i = 1; i < N + 1; i++) {
            list[i] = new ArrayList<>();
        }

        for (int i = 1; i < N; i++) {   // 0번 인덱스는 사용하지 않으므로 반복에서 제외(반복 횟수 노드 개수만큼 되도록 설정)
            st = new StringTokenizer(br.readLine());
            int a = Integer.valueOf(st.nextToken());
            int b = Integer.valueOf(st.nextToken());

            /* 설명. 트리는 양방향이기 때문이다. */
            list[a].add(b);
            list[b].add(a);
        }

        dfs(1);

        for (int i = 2; i < parent.length; i++) {
            sb.append(parent[i]);
            sb.append(" ");

        }
        return sb.toString();
    }

    private static void dfs(int parentNode) {
        /* 설명. 방문 배열의 의미
            이미 방문한 노드들은 부모 노드들이고 부모 노드들을 재방문 하지 않도록 함 */
        /* 메모. 트리에서는 방문한 노드 = 부모 노드를 의미함 */
        isVisit[parentNode] = true;

        /* 설명. 입력 받은 값을 통해 생성된 list로 부터 관련 있는 노드들을 확인하기 위한 반복문 */
        for(int node: list[parentNode]){

            /* 설명. 방문한 적이 없다면 자식노드이다.(루트부터 방문을 체크하며 연관된 것들을 따라 내려왔기 때문) */
            if(!isVisit[node]){         // 방문하지 않은 노드인지 판별(자식 노드들은 해당 조건을 만족하지 못함)
                parent[node] = parentNode;          // node 인덱스에 부모 노드값을 추가(node = childNode)
                dfs(node);
            }
        }
    }
}
