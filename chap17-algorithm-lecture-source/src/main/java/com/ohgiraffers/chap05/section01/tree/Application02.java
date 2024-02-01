package com.ohgiraffers.chap05.section01.tree;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Application02 {
    static class Node {

        int left;
        int right;

        public Node(int left, int right) {
            this.left = left;
            this.right = right;

        }
    }
    static List<Node>[] list;
    public static BufferedReader toBufferedReader(String str) {
        InputStream is = new ByteArrayInputStream(str.getBytes());
        return new BufferedReader(new InputStreamReader(is));
    }
    static StringBuilder sb = new StringBuilder();


    public static String solution(String input) throws IOException {
        BufferedReader br = toBufferedReader(input);
        int n = Integer.parseInt(br.readLine());        // n은 노드의 개수

        /* 설명. list 배열의 각 인덱스에 자식노드(left, right)를 담을 ArrayList를 생성하는 반복문
        *   자식노드를 가질수도, 가지지 않을 수 도 있으므로 변동성을 고려하여 배열이 아닌 ArrayList로 생성 */
        list = new ArrayList[n + 1];
        for(int i = 1; i < n + 1; i++) {    // 입력된 노드 개수만큼 반복
            list[i] = new ArrayList<>();
        }

        for(int i = 1; i < n + 1; i++) {
            /* 메모. 문제에서 알파벳을 노드로 사용하므로, 노드값을 저장할 String 타입 배열 생성 */
            String[] alphabet = br.readLine().split(" ");

            /* 메모. 노드 번호를 인덱스로 사용하기 위해 알파벳을 숫자로 변경 */
            int data = alphabet[0].charAt(0) - 'A' + 1;     // 루트 노드가 'A'이므로 A + 1하면 인덱스 번호 1번부터 차례로 만들어 질 것
            int left = alphabet[1].charAt(0) - 'A' + 1;
            int right = alphabet[2].charAt(0) - 'A' + 1;
            list[data].add(new Node(left, right));          // 입력된 노드의 인덱스에 자식노드의 인덱스 2개를 저장
        }

        preorder(1);    // start = 1은 루트노드가 'A'임을 의미
        sb.append("\n");
        inorder(1);
        sb.append("\n");
        postorder(1);
        return sb.toString();

    }

    // 루트 -> 왼쪽 -> 오른쪽 순회
    static void preorder(int start) {
        for(Node node : list[start]) {
            int l = node.left;
            int r = node.right;

            sb.append((char)(start+'A'-1));
            if((l + 'A' - 1) != '.') preorder(l);   // . 은 자식이 없는 노드 -> 숫자로 바꾼 값을 다시 알파벳으로 변경
            if(r != '.' - 'A' + 1) preorder(r);
//            if(r != -18) preorder(r);             // .과 알파벳은 19만큼 차이가 남
        }
    }

    // 왼쪽 -> 루트 -> 오른쪽 순회
    static void inorder(int start) {
        for(Node node : list[start]) {
            int l = node.left;
            int r = node.right;

            if(l != -18) inorder(l);
            sb.append((char)(start+'A'-1));
            if(r != -18) inorder(r);
        }
    }

    // 왼쪽 -> 오른쪽 -> 루트 순회
    static void postorder(int start) {
        for(Node node : list[start]) {
            int l = node.left;
            int r = node.right;

            if(l != -18) postorder(l);
            if(r != -18) postorder(r);
            sb.append((char)(start+'A'-1));
        }
    }
}
