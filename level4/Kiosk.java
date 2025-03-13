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
        Menu menu= new Menu("Burger");
        menuList.add(menu);
        menuList.add(new Menu("Drink"));
        menuList.add(new Menu("Dessert"));
        while (flag) {

            System.out.println("[ SHAKESHACK MENU ]");
            // 반복문을 활용해 List 안에 있는 menulist을 하나씩 출력
            for (int i = 0; i < menuList.size(); i++) {
                System.out.println((i + 1) + ". " + menuList.get(i).getCategory() );
            }
            System.out.println("0. 종료      | 종료");
            System.out.println();
            int select = sc.nextInt();

            switch (select) {
                case 0 -> {
                    System.out.println("프로그램을 종료합니다.");
                    flag = false;
                }
                case 1 ->{
                    Menu burger = menuList.get(0);
                    System.out.println("선택메뉴 : 1. " + burger.getCategory());
                    List<MenuItem> menuItem = burger.getMenuItems();
                    for(int i =0; i<menuItem.size(); i++) {
                        MenuItem burgerItem = menuItem.get(i);
                        System.out.println(burgerItem.getName() + burgerItem.getPrice() + burgerItem.getExplain());

                    }
                }
                case 2 ->
                        System.out.println("선택메뉴 : 2. " );
                case 3 ->
                        System.out.println("선택메뉴 : 3. " );
                case 4 ->
                        System.out.println("선택메뉴 : 4. " );
                default -> {
                        System.out.println("없는 메뉴입니다.");

                }
            }
        }
    }
}

