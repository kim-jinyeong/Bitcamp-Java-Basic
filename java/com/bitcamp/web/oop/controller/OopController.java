/**
 * packageName: com.bitcamp.web.oop.controller
 * fileNa     : OopController
 * au         : kimjinyeong
 * date       : 2022-02-09
 * desc       :
 * class variable :
 * instance variable :
 * area variable :
 * parameter :
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-02-09         kimjinyeong    최초 생성
 */

package com.bitcamp.web.oop.controller;

import com.bitcamp.web.oop.domain.CelPhone;
import com.bitcamp.web.oop.domain.GalPhone;
import com.bitcamp.web.oop.domain.IPhone;
import com.bitcamp.web.oop.domain.Phone;
import com.bitcamp.web.oop.service.PhoneService;
import com.bitcamp.web.oop.service.PhoneServiceImpl;

import java.util.Scanner;

public class OopController {
    public void execute(Scanner scanner) {
        while (true){
            System.out.println("[메뉴] 0.Exit \n" +
                    "1.은닉화(Encapsulation) \n" +
                    "2.상속(Inheritance) \n" +
                    "3.추상화(Abstraction) \n" +
                    "4.다향성(Polymorphism) ");
            switch (scanner.next()){
                case "0":
                    System.out.println("종료");return;
                case "1":
                    System.out.println("POJO가 은닉화하다");break;
                case "2":
                    System.out.println("extends 가 상속이다.");
                    Phone phone = new Phone("금성전화기","금성전화");
                    CelPhone celPhone = new CelPhone("이동중에","핸드폰","블랙베리");
                    IPhone iPhone = new IPhone("애플");
                    GalPhone galPhone = new GalPhone("삼성");
                    PhoneService phoneService = new PhoneServiceImpl();
                    System.out.println("[소메뉴] 0.Exit 1.집전화 2.휴대폰 3.아이폰 4.갤럭시폰");
                    switch(scanner.next()){
                        case "0":
                            System.out.println("exit");return;
                        case "1":
                            phone.setCall("여보세요");
                            phoneService.usePhone(phone);
                            break;
                        case "2":
                            celPhone.setCall("안녕하세요");
                            phoneService.useCelPhone(celPhone);
                            break;
                        case "3":
                            iPhone.setSearch("뉴스");
                            phoneService.useIPhone(iPhone);
                            break;
                        case "4":
                            galPhone.setPay("삼성 페이");
                            phoneService.useGalPhone(galPhone);
                    }
            }
        }
    }
}
