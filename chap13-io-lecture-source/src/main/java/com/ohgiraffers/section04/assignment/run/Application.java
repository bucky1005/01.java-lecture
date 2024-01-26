package com.ohgiraffers.section04.assignment.run;

import com.ohgiraffers.section04.assignment.aggregate.BloodType;
import com.ohgiraffers.section04.assignment.aggregate.Member;
import com.ohgiraffers.section04.assignment.service.MemberService;

import java.util.Scanner;

/* 설명. 프로그램 실행 및 메뉴 출력과 사용자의 입력을 받을 View에 해당하는 클래스 */
public class Application {

    /* 메모. MemberService에는 MemberRepository에 담겨있는 memberList 정보가 들어있다. */
    private static final MemberService mm = new MemberService();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true){
            System.out.println("============= 회원 관리 프로그램 =============");
            System.out.println("1. 모든 회원 정보 보기");
            System.out.println("2. 회원 찾기");
            System.out.println("3. 회원 가입");
            System.out.println("4. 회원 탈퇴");
            System.out.println("9. 프로그램 종료");
            System.out.print("메뉴를 선택해 주세요: ");
            int input = sc.nextInt();

            switch (input){
                case 1: mm.selectAllMembers();
                    break;
                case 2: mm.selectMember(chooseMemberNo());
                    break;
                case 3: mm.registMember(signUp());
                    break;
                case 4: mm.deleteMember(chooseMemberNo());
                    break;
                case 9: System.out.println("프로그램을 종료합니다.");
                    return;
                default:
                    System.out.println("잘못된 번호입니다. 다시 입력해주세요.");
            }
        }
    }

    /* 설명. 회원 한명 조회를 위해 해당 회원 번호를 입력받아 반환하는 메소드 */
    private static int chooseMemberNo() {
        Scanner sc = new Scanner(System.in);
        System.out.print("회원 번호를 입력하세요: ");

        return sc.nextInt();
    }

     /* 설명. 사용자로부터 회원 번호를 제외한 정보를 입력받아(회원가입용 정보) Member 타입으로 반환하는 메소드(파싱 및 가공처리) */
    private static Member signUp() {
        Member newInfo = null;          // 새 회원 정보를 저장할 Member타입 변수 newInfo 생성

        // 회원번호를 제외한 회원 정보 입력 받기(Member클래스에 선언한 필드값)
        Scanner sc = new Scanner(System.in);
        System.out.print("아이디를 입력하세요: ");
        String id = sc.nextLine();
        System.out.print("패스워드를 입력하세요: ");
        String pwd = sc.nextLine();
        System.out.print("나이를 입력하세요: ");
        int age = sc.nextInt();
        System.out.print("입력 할 취미 개수를 입력하세요(1 이상): ");
        int length = sc.nextInt();
        sc.nextLine();                  // Sacnner 버퍼에 남아있을 엔터 제거용

        String[] hobbies = new String[length];

        for (int i = 0; i < hobbies.length; i++) {
            System.out.print((i + 1) + "번째 취미를 입력하세요: ");
            String input = sc.nextLine();
            hobbies[i] = input;
        }

        newInfo = new Member(id, pwd, age, hobbies);    // newInfo 변수에 Member 객체를 생성하여 입력받은 정보를 저장(아직 혈액형정보는 입력받지 않은 상태)

        // 혈액형을 입력받기
        System.out.println("혈액형을 입력하세요(A, AB, B, O): ");
        String bloodType = sc.nextLine().toUpperCase(); // 소문자로 입력한 경우 대문자로 변환
        BloodType bt = null;
        switch (bloodType) {
            case "A": bt = BloodType.A; break;
            case "AB": bt = BloodType.AB; break;
            case "B": bt = BloodType.B; break;
            case "O": bt = BloodType.O; break;
        }

        /* 메모. 현재 생성되어 있는 Member 타입의 newInfo 객체에는 혈액형이 포함되지 않은 상태로,
            아래 두 가지 방법을 통해 이미 생성되어있는 객체에 값을 추가할 수 있다. */
        /* 필기.
            회원으로부터 회원가입을 위한 정보를 입력받아 Member 타입 객체 하나로 가공처리할 때 방법이 2가지가 있다.(trade-off)
            1. 생성자 방식(장점: 한줄 코딩 가능, 단점: 따로 생성자를 만들어야 함)
            2. setter 방식(장점: 초기화 할 개수 수정 용이, 단점: 코딩 줄 수가 늘어날 수 있음)
         */
        newInfo.setBloodType(bt);       // setter를 이용하여 newInfo 객체에 혈액형 정보를 삽입
        return newInfo;

        /* 메모. 해당 메소드를 실행하면 사용자로부터 정보를 입력 받고,
            아직 MemberRepository의 memberList 배열에는 입력한 값이 들어가지 않은 상태 */
    }
}
