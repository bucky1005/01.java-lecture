package com.ohgiraffers.section04.assignment.repository;

import com.ohgiraffers.section04.assignment.aggregate.BloodType;
import com.ohgiraffers.section04.assignment.aggregate.Member;
import com.ohgiraffers.section04.assignment.stream.MyObjectOutput;

import javax.management.ObjectInstance;
import java.io.*;
import java.util.ArrayList;

/* 설명. 데이터와 입출력을 위해 만들어지며 성공 실패 결과를 반환하는 클래스 */
public class MemberRepository {

    private ArrayList<Member> memberList = new ArrayList<>();

    /* 설명. 프로그램이 켜지자 마자(MemberRepository()가 실행되자 마자) 파일에 dummy 데이터 추가 및 입력 */
    public MemberRepository() {
        /* 질문. ArrayList 객체가 memberList와 members 두 개가 있는데 왜 두 개가 나뉘어져 있는것인가! */
        /* 답변. members 배열은 최초 프로그램 실행 시 한번만 사용되는 배열로 saveMembers() 또한 최초 한번 실행되며
            members의 데이터를 db에 복사한다.
            그 이후 프로그램을 재 시작했을 때에는 saveMembers()는 실행되지 않고 loadMembers()를 통해
            DB에 저장된 멤버 정보를 memberList 배열에 저장한다.
            회원의 추가가 이루어 질 때에도 db로 바로 삽입되도록 하고 saveMembers()는 더이상 실행 되지 않는다.
            첫 시작 이후의 회원 관리는 모두 loadMember()와 memberList 배열을 통해 이루어진다.
         */


        /* 설명. 회원 가입 기능 추가 후 이제는 파일이 기존에 존재하면(처음이 아니므로) 회원 3명으로 초기화 하기를 하지않는다. */
        File file = new File("src/main/java/com/ohgiraffers/section04/assignment/db/memberDB.dat");
        if (!file.exists()){
            ArrayList<Member> members = new ArrayList<>();
            members.add(new Member(1, "user01", "pass91", 29, new String[]{"발레", "수영"}, BloodType.A));
            members.add(new Member(2, "user02", "pass92", 19, new String[]{"게임", "영화 시청"}, BloodType.O));
            members.add(new Member(3, "user03", "pass93", 39, new String[]{"음악감상", "독서", "명상"}, BloodType.AB));
            saveMembers(members);
        }
        loadMembers();

        System.out.println("==== repository에서 회원 정보 다 읽어 왔는지 확인 ====");
        for(Member m: memberList){
            System.out.println(m);
        }
    }

    /* 설명. 회원이 담긴 ArrayList를 던지면 파일에 출력하는 기능(파일 덮어쓰기) */
    private void saveMembers(ArrayList<Member> members) {
        ObjectOutputStream oos = null;

        try {
            oos = new ObjectOutputStream(
                    new BufferedOutputStream(
                            new FileOutputStream("src/main/java/com/ohgiraffers/section04/assignment/db/memberDB.dat")));

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
    /* 질문. saveMembers로 members배열에 담긴 회원 정보를 memberDB.dat에 담았다가 다시 load해서 memberList에 담는 이유는?? */
    private void loadMembers() {
        ObjectInputStream ois = null;
        try {
            // 여기 파일 주소 수정함
            ois = new ObjectInputStream(new BufferedInputStream(new FileInputStream("src/main/java/com/ohgiraffers/section04/assignment/db/memberDB.dat")));
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

    /* 메모. 회원을 새로 추가 하기 전, 현재 가장 마지막에 생성된 멤버변호가 몇 번인지 확인하는 메소드 */
    public int selectLastMemberNo() {
//        Member latestMember = memberList.get(memberList.size() -1);     // 가장 마지막 인덱스에 저장된 멤버를 latestMember에 저장
//        return latestMember.getMemNo();         // latestMember의 getMemNo()를 가져옴

        /* 메모. 아래와 같은 방식을 체이닝 방식이라고 하며 가독성을 높이기 위해 엔터로 코드를 분리한다. */
        return memberList.get(memberList.size()-1)                        // 현재 가장 마지막 인덱스에 저장된 멤버
                .getMemNo();                                              // 멤버 번호를 가져옴
    }

    /* 설명. 기존 회원(객체)에 이어서 파일 출력을 하고 추가한 객체의 수를 반환(feat. DML 작업의 결과는 int) */
    /* 설명. 객체 출력을 할 예정인데 기존 ObjectoutputStream 대신 새로 정의한 스트림으로 회원 한명 파일 출력해서 int 반환하기(feat.이어쓰기) */
    public int saveMembers(Member member){
        MyObjectOutput moo = null;
        try {
            moo = new MyObjectOutput(
                    new BufferedOutputStream(
                            new FileOutputStream("src/main/java/com/ohgiraffers/section04/assignment/db/memberDB.dat", true)));
            /* 설명. 파일로 객체 하나 출력하기 */
            moo.writeObject(member);

            /* 설명. repository의 memberList에도 추가 */
            /* 질문. loadMember() 메소드를 실행하면 db에 있는 회원 정보를 memberList에 추가하는데 이걸 활용해서 하는 방법은 없나요? */
            memberList.add(member);

            moo.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if(moo != null) moo.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        return 1;
    }

    public int deleteMember(int memNo) {
        for (int i = 0; i < memberList.size(); i++) {
            if(memberList.get(i).getMemNo() == memNo){      // 삭제하려는 회원과 같은 회원번호인 인덱스 찾기

                /* 설명. 프로그램 상에서 회원을 관리하는 memebrList 뿐 아니라 DB(회원파일)도 같이 적용되게 함 */
                memberList.remove(i);
                saveMembers(memberList);
                return 1;                                   // 잘 삭제되었다면 1 반환
            }
        }
        return 0;                                           // 삭제되지 않았다면 0 반환
    }
}
