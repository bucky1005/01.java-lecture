package com.ohgiraffers.section02.superkeyword;

import java.util.Date;

public class Computer extends Product{
    private String cpu;
    private int hdd;
    private int ram;
    private String operationSystem;

    public Computer() {
        super();                    // super()는 작성하지 않아도 super()가 명시되있는 것으로 간주함.
        System.out.println("Computer 클래스의 기본 생성자 호출됨...");
    }

    // 자식클래스의 매개변수만 초기화
    // alt + insert -> Constructor -> Product() -> ctrl + A 후 생성
    public Computer(String cpu, int hdd, int ram, String operationSystem) {
        this.cpu = cpu;
        this.hdd = hdd;
        this.ram = ram;
        this.operationSystem = operationSystem;
        System.out.println("Computer 클래스의 모든 필드를 초기화 하는 생성자 호출됨...");
    }

    // 자식클래스 + 부모클래스의 매개변수도 초기화
    public Computer(String code, String brand, String name, int price, Date manufacturingDate, String cpu, int hdd, int ram, String operationSystem) {
        super(code, brand, name, price, manufacturingDate);         // super를 통해 부모 클래스의 필드를 초기화
        this.cpu = cpu;                                             // 그 이후 this를 통해 내 클래스의 필드를 초기화
        this.hdd = hdd;
        this.ram = ram;
        this.operationSystem = operationSystem;
        System.out.println("Computer 클래스와 부모 필드까지 모두 초기화하는 생성자 호출됨...");
    }

    @Override
    public String toString() {
//        return "Computer{" +
//                "cpu='" + cpu + '\'' +
//                ", hdd=" + hdd +
//                ", ram=" + ram +
//                ", operationSystem='" + operationSystem + '\'' +
//                "} " + super.toString();
        return "Computer{" +
                "cpu='" + cpu + '\'' +
                ", hdd=" + hdd +
                ", ram=" + ram +
                ", operationSystem='" + operationSystem + '\'' +
                "} " + "Product{" +
                "code='" + super.getCode() + '\'' +
                ", brand='" + this.getBrand() + '\'' +
                ", name='" + getName() + '\'' +
                ", price=" + getPrice() +
                ", manufacturingDate=" + getManufacturingDate() +
                '}';
    }
}
