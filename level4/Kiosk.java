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
        Menu menu = new Menu("Burger");
        menuList.add(menu);
        menuList.add(new Menu("Drink"));
        menuList.add(new Menu("Dessert"));
        while (flag) {
            System.out.println("[ SHAKESHACK MENU ]");
            // 반복문을 활용해 List 안에 있는 menulist을 하나씩 출력
            for (int i = 0; i < menuList.size(); i++) {
                System.out.println((i + 1) + ". " + menuList.get(i).getCategory());
            }
            System.out.println("0. 종료      | 종료");

            int select = sc.nextInt();

            switch (select) {
                case 0 -> {
                    System.out.println("프로그램을 종료합니다.");
                    flag = false;
                }
                case 1 -> {
                    Menu burger = menuList.get(0);
                    System.out.println("선택메뉴 : 1. " + burger.getCategory());
                    List<MenuItem> menuItem = burger.getMenuItems();
                    for (int i = 0; i < menuItem.size(); i++) {
                        MenuItem burgerItem = menuItem.get(i);
                        System.out.println((i + 1) + ". " + burgerItem.getName() + "| W " + burgerItem.getPrice() + " | " + burgerItem.getExplain());
                    }
                }
                case 2 -> {
                    System.out.println("선택메뉴 : 2. " + menuList.get(1).getCategory());
                    List<MenuItem> menuItem = menuList.get(1).getMenuItems();
                    for (int i = 0; i < menuList.get(1).getMenuItems().size(); i++) {
                        MenuItem burgerItem = menuItem.get(i);
                        System.out.println((i + 1) + ". " + burgerItem.getName() + "| W " + burgerItem.getPrice() + " | " + burgerItem.getExplain());
                    }
                }
                case 3 -> {
                    Menu burger = menuList.get(2);
                    System.out.println("선택메뉴 : 3. " + burger.getCategory());
                    List<MenuItem> menuItem = burger.getMenuItems();
                    for (int i = 0; i < menuItem.size(); i++) {
                        MenuItem burgerItem = menuItem.get(i);
                        System.out.println((i + 1) + ". " + burgerItem.getName() + "| W " + burgerItem.getPrice() + " | " + burgerItem.getExplain());
                    }
                }
                default -> {
                    try{
                        System.out.println("없는 메뉴입니다.");
                    }
                        catch (Exception e){
                            System.out.println("없는 메뉴입니다");
                        }

                }

            }

        }
    }
}

