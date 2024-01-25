package com.ohgiraffers.section04.assignment.repository;

import com.ohgiraffers.section04.assignment.aggregate.BloodType;
import com.ohgiraffers.section04.assignment.aggregate.Member;

import javax.management.ObjectInstance;
import java.io.*;
import java.util.ArrayList;

/* 설명. 데이터와 입출력을 위해 만들어지며 성공 실패 결과를 반환하는 클래스 */
public class MemberRepository {

    private ArrayList<Member> memberList = new ArrayList<>();

    /* 설명. 프로그램이 켜지자 마자(MemberRepository()가 실행되자 마자) 파일에 dummy 데이터 추가 및 입력 */
    public MemberRepository() {
        /* 질문. ArrayList 객체가 memberList와 members 두 개가 있는데 왜 두 개가 나뉘어져 있는것인가! */
        /* 답변. members 배열은 최초 프로그램 실행 시 한번만 사용되는 배열로 saveMembers() 또한 최초 한번만 실행된다.
            그 이후 프로그램을 재 시작했을 때에는 saveMembers()는 실행되지 않고 loadMembers()를 통해 DB에 저장된 멤버 정보를 읽어온다.
            회원의 추가가 이루어 질 때에도 saveMembers()는 더이상 실행 되지 않는다.
            첫 시작 이후의 회원 관리는 모두 memberList 배열을 통해 이루어진다.
         */
        ArrayList<Member> members = new ArrayList<>();
        members.add(new Member(1, "user01", "pass91", 29, new String[]{"발레", "수영"}, BloodType.A));
        members.add(new Member(2, "user02", "pass92", 19, new String[]{"게임", "영화 시청"}, BloodType.O));
        members.add(new Member(3, "user03", "pass93", 39, new String[]{"음악감상", "독서", "명상"}, BloodType.AB));

        saveMembers(members);
        loadMembers();

        System.out.println("==== repository에서 회원 정보 다 읽어 왔는지 확인 ====");
        for(Member m: memberList){
            System.out.println(m);
        }
    }

    /* 설명. 회원이 담긴 ArrayList를 던지면 파일에 출력하는 기능 */
    private void saveMembers(ArrayList<Member> members) {
        ObjectOutputStream oos = null;

        try {
            oos = new ObjectOutputStream(
                    new BufferedOutputStream(
                            new FileOutputStream("src/main/java/com/ohgiraffers/section04/assignment/db/mariaDB.dat")));

            /* 설명. 넘어온 회원 수 만큼 객체 출력하기 */
            for (Member m : members){
                oos.writeObject(m);
            }
            oos.flush();                        // 출력 시에는 flush 해 줄 것
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if(oos != null) oos.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    /* 설명. 파일로부터 회원 객체들을 입력받아 memberList에 쌓기 */
    /* 질문. saveMembers로 members배열에 담긴 회원 정보를 mariaDB.dat에 담았다가 다시 load해서 memberList에 담는 이유는?? */
    private void loadMembers() {
        ObjectInputStream ois = null;
        try {
            ois = new ObjectInputStream(new BufferedInputStream(new FileInputStream("src/main/java/com/ohgiraffers/section04/assignment/db/mariaDB.dat")));
            while(true) {
                memberList.add((Member) (ois.readObject()));
            }
        } catch (EOFException e) {
            System.out.println("회원 정보 모두 로딩됨...");
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if(ois != null) ois.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public ArrayList<Member> selectAllMembers() {
        return memberList;
    }

    public Member selectMember(int memNo) {
        for(Member m: memberList){
            if (m.getMemNo() == memNo) return m;    // m은 한명의 회원 정보를 의미
        }
        return null;
    }
}
