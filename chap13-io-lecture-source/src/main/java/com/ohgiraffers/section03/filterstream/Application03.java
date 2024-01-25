package com.ohgiraffers.section03.filterstream;

import java.io.*;

public class Application03 {
    public static void main(String[] args) {

        /* 수업목표. 데이터 타입 입출력 보조스트림을 이해하고 활용할 수 있다.(Reader 또는 Writer 계열 X) */
        /* 추가.
            장점: 데이터 자료형별로 한번에 데이터를 전송할 수 있음
            단점: 자료형별로 크기가 다 다르므로 읽어올 때에는 반드시 입력한 자료형의 순서대로 읽어와야 함
         */
        DataOutputStream dos = null;
        try {
            dos = new DataOutputStream(
                    new FileOutputStream("src/main/java/com/ohgiraffers/section03/filterstream/testData.txt"));

            /* 설명. data 타입별로 해당 데이터 타입에 맞는 출력 메소드를 활용하여 파일에 출력하기(순서 중요!) */
            dos.writeUTF("홍길동");
            dos.writeInt(20);
            dos.writeChar('A');

            dos.writeUTF("유관순");
            dos.writeInt(16);
            dos.writeChar('B');

            dos.writeUTF("강감찬");
            dos.writeInt(46);
            dos.writeChar('C');

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if(dos != null) dos.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        DataInputStream dis = null;

        try {
            dis = new DataInputStream(
                    new FileInputStream("src/main/java/com/ohgiraffers/section03/filterstream/testData.txt"));

            /* 설명. 입력받을 때도 출력 때의 순서를 지켜서 입력 받는다. */
            while (true) {          // while의 조건이 true인 경우 무한반복 ->  EOFException 발생, 이를 이용해 예외처리 가능
                // 데이터를 입력한 순서대로 자료형을 읽어와야 함
                System.out.println(dis.readUTF());
                System.out.println(dis.readInt());
                System.out.println(dis.readChar());
            }
        } catch (EOFException e) {  // while 무한 반복에서 발생한 EOFException을 활용하여 반복을 종료하도록 예외처리
            /* 설명. data 입출력은 EOFException을 활용하여 파일의 끝까지 입력 받는 것을 처리할 수 있다. */
            System.out.println("파일 다 읽어냄");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if(dis != null) dis.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
