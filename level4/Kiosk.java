package level4;

import level4.MenuItem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Kiosk {
    List<MenuItem> menuItems = new ArrayList<>();
    // Scanner 선언
    Scanner sc = new Scanner(System.in);

    boolean flag = true;
    // add 함수를 통해 new MenuItem(이름, 가격, 설명) List에 삽입
    public Kiosk() {
        menuItems.add(new MenuItem("ShackBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        menuItems.add(new MenuItem("SmokeShack", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
        menuItems.add(new MenuItem("Cheeseburger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
        menuItems.add(new MenuItem("Hamburger", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거"));
    }

    public void start() {
        while (flag) {
            System.out.println("[ SHAKESHACK MENU ]");
            // 반복문을 활용해 List 안에 있는 MenuItem을 하나씩 출력
            for (int i = 0; i < menuItems.size(); i++) {
                System.out.println((i + 1) + ". " + menuItems.get(i).name + " | W " + menuItems.get(i).price + " | " + menuItems.get(i).explain);
            }
            System.out.println("0. 종료      | 종료");
            int select = sc.nextInt();
            switch (select) {
                case 0 -> {
                    System.out.println("프로그램을 종료합니다.");
                    flag = false;
                }
                case 1 ->
                        System.out.println("선택메뉴 : 1. " + menuItems.get(0).name + " | W " + menuItems.get(0).price + " | " + menuItems.get(0).explain);
                case 2 ->
                        System.out.println("선택메뉴 : 2. " + menuItems.get(1).name + " | W " + menuItems.get(1).price + " | " + menuItems.get(1).explain);
                case 3 ->
                        System.out.println("선택메뉴 : 3. " + menuItems.get(2).name + " | W " + menuItems.get(2).price + " | " + menuItems.get(2).explain);
                case 4 ->
                        System.out.println("선택메뉴 : 4. " + menuItems.get(3).name + " | W " + menuItems.get(3).price + " | " + menuItems.get(3).explain);
                default -> System.out.println("없는 메뉴입니다.");
            }
        }
    }
}

