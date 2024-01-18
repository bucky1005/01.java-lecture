package com.ohgiraffers.section01.extend;

public class FireCar extends Car{
    /* 부모로 부터 상속받은 것들을 추가하거나 변경하여 사용할 수 있음 */
    public FireCar() {
        super();        // 모든 자식클래스는 다음과 같은 기본 생성자를 자동으로 갖는다. 여기서 super()는 부모의 기본 생성자를 뜻한다.
        /* 자동으로 생성되는 이유: 자식 클래스를 인지하기 위해서는 부모클래스가 먼저 인식 되어야 하기 때문이다. */
        System.out.println("Firecar 클래스의 기본 생성자 호출 됨....");
    }

    @Override                           // 부모로 부터 상속받은 속성임을 명시
    /* 필기. @Override 어노테이션을 추가하는 이유
        1. 메소드 중에 부모로부터 물려받은 메소드인 것을 한 눈에 알아보기 쉽게 하기(가독성 측면)
        2. 부모의 메소드를 오버라이딩 할 때 발생할 수 있는 실수를 방지 하기 위해(실수방지 측면)
        3. 부모 메소드로부터 상속 받은 메소드를 재정의 하는 것을 명시적으로 표시
     */
    public void soundHorn(){            // 왼쪽에 파란색+빨간 화산표는 해당 속성은 부모로 부터 상속받은 속성이라는 의미
        System.out.println("삐용! 삐용");
    }

    public void sprayWater() {
        System.out.println("불난 곳을 발견했습니다. 물을 뿌립니다. ======================33");
    }
}
