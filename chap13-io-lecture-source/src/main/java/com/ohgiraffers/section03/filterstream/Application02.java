package com.ohgiraffers.section03.filterstream;

import java.io.*;
import java.util.Scanner;

public class Application02 {
    public static void main(String[] args) {

        /* 수업목표. 표준입출력을 이해하고 활용할 수 있다. */

        /* 설명. Scanner 역할을 하는 코드 */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));   // 콘솔은 항상 존재하므로 예외처리 필요 x
//      위 코드는  Scanner sc = new Scanner(System.in);과 동일한 개념
        /* 추가. System.in: 기반스트림 Buffer와 InputStream이 보조 스트림 */

        System.out.print("문자열 입력: ");
        try {
            String value = br.readLine();

            System.out.println("value: " + value);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                br.close();         // br객체가 Null이 될 일이 없으므로 if문 불필요
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        /* 설명. println 역할을 하는 코드 */
        BufferedWriter bw = null;
        OutputStreamWriter osw = null;
        osw = new OutputStreamWriter(System.out);
        bw = new BufferedWriter(osw);

        try {
            bw.write("println이 좋은거구만~!");
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                bw.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
