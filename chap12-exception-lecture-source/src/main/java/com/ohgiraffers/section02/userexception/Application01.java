package com.ohgiraffers.section02.userexception;

import com.ohgiraffers.section02.userexception.exception.MoneyNegativeException;
import com.ohgiraffers.section02.userexception.exception.NotEnoughMoneyException;
import com.ohgiraffers.section02.userexception.exception.PriceNegativeException;

public class Application01 {
    public static void main(String[] args) throws Exception{

        /* 수업목표. 사용자 정의의 예외 클래스 정의 후 발생한 사용자 정의의 예외를 처리할 수 있다. */
        ExceptionTest et = new ExceptionTest();

        /* 추가. 기존에 실행하고자 했던 구문은 try에, 예외 발생에 대한 처리는 catch에 작성 */
        try {
            et.checkEnoughMoney(-30000, 50000);
            et.checkEnoughMoney(30000, -50000);
            et.checkEnoughMoney(50000, 30000);
        /* 추가. 예외 메세지를 각각 처리할 경우 */
//        } catch (PriceNegativeException e) {
////            throw new RuntimeException(e);
//            System.out.println(e.getMessage());
//        } catch (NotEnoughMoneyException e) {
//            System.out.println(e.getMessage());
//        } catch (MoneyNegativeException e) {
//            System.out.println(e.getMessage());
        /* 추가. 예외 메세지를 한번에 처리할 경우(다형성 적용) */
        } catch (Exception e){
            System.out.println("예외 메세지: " + e.getMessage());
        }


    }
}
