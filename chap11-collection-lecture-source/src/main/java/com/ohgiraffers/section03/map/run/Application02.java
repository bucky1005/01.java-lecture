package com.ohgiraffers.section03.map.run;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class Application02 {
    public static void main(String[] args) {

        /* 수업목표. Properties에 대해 이해하고 사용할 수 있다. */
        /* 필기. Properties란?
            HashMap과 거의 유사하지만 key와 value 모두를 String으로만 사용할 수 있는 자료구조이다.
            HashMap도 key, value 모두 String인 경우 사용 가능하지만 Properties는 제네릭 없이 사용 가능하다.
            주로 설정 파일 관련된 파일과의 입출력에 사용된다.(store, load 등)
         */
        Properties prop = new Properties();

        prop.setProperty("driver", "oracle.jdbc.driver.OracleDriver");
        prop.setProperty("url", "jdbc:orable:thin:@127.0.0.1:1521:xe");
        prop.setProperty("user", "swcamp");
        prop.setProperty("password","swcamp");

        System.out.println(prop);

        /* 설명. .store(): 값을 저장하는 메소드 */
        /* 설명. try-catch문은 예외 처리할 때 주로 사용된다. */
        try {
            // FileOutputStream() 사용 시 driver.dat이라는 이름의 build file이 생성됨.
            // .dat 데이터를 담는 파일의 확장자
            prop.store(new FileOutputStream("driver.dat"), "jdbc driver");
            prop.store(new FileWriter("driver.txt"), "jdbc driver2");
            prop.storeToXML(new FileOutputStream("driver.xml"), "jdbc driver3");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        /* 설명. 저장한 파일에서부터 읽어온 데이터를 담을 Properties 객체 */
        Properties prop2 = new Properties();
        System.out.println("파일로부터 읽어오기 전: " + prop2);

        /* 설명. .load(): 값을 불러오는 메소드 */
        try {
//            prop2.load(new FileInputStream("driver.dat"));
//            prop2.load(new FileReader("driver.txt"));
            prop2.loadFromXML(new FileInputStream("driver.xml"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println("읽어온 후 ===================");
        System.out.println("driver: " + prop2.getProperty("driver"));
        System.out.println("url: " + prop2.getProperty("url"));
        System.out.println("user: " + prop2.getProperty("user"));
        System.out.println("password: " + prop2.getProperty("password"));
    }
}
