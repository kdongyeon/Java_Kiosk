package level4;

import java.awt.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class Kiosk {

    // Scanner 선언
    Scanner sc = new Scanner(System.in);
    // 리스트 선언

    List<Menu> menuList = new ArrayList<>();
    boolean flag = true;



    public void start() {
        menuList.add(new Menu("Burger");
        menuList.add(new Menu("Drink");
        menuList.add(new Menu("Dessert");
        while (flag) {

            System.out.println("[ SHAKESHACK MENU ]");
            // 반복문을 활용해 List 안에 있는 menulist을 하나씩 출력
            for (int i = 0; i < menuList.size(); i++) {
                System.out.println((i + 1) + ". " + menuList.get(i).catagory() + " | W " + menuList.get(i).price + " | " + menuList.get(i).explain);
            }
            System.out.println("0. 종료      | 종료");
            int select = sc.nextInt();
            switch (select) {
                case 0 -> {
                    System.out.println("프로그램을 종료합니다.");
                    flag = false;
                }
                case 1 ->
                        System.out.println("선택메뉴 : 1. " + menuList.get.get(0).name + " | W " + menuItems.get(0).price + " | " + menuItems.get(0).explain);
                case 2 ->
                        System.out.println("선택메뉴 : 2. " + menuList.get(1).name + " | W " + menuItems.get(1).price + " | " + menuItems.get(1).explain);
                case 3 ->
                        System.out.println("선택메뉴 : 3. " + menuList.get(2).name + " | W " + menuItems.get(2).price + " | " + menuItems.get(2).explain);
                case 4 ->
                        System.out.println("선택메뉴 : 4. " + menuList.get(3).name + " | W " + menuItems.get(3).price + " | " + menuItems.get(3).explain);
                default -> System.out.println("없는 메뉴입니다.");
            }
        }
    }
}

