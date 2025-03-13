package level4;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    private final List<MenuItem> menuItems = new ArrayList<>();
    private final String category;

    public Menu(String category) {
        this.category = category;
        menus();
    }

        public void menus(){
            switch (category) {
                case "Burger" -> {
                    menuItems.add(new MenuItem("ShackBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
                    menuItems.add(new MenuItem("SmokeShack", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
                    menuItems.add(new MenuItem("Cheeseburger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
                    menuItems.add(new MenuItem("Hamburger", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거"));
                }
                case "Drink" -> {
                    menuItems.add(new MenuItem("Coke", 2.0, "탄산 음료 톡쏘는 코카콜라"));
                    menuItems.add(new MenuItem("Cider", 2.0, "투명한 음료 톡쏘는 사이다"));
                    menuItems.add(new MenuItem("Fanta", 1.8, "파인향 음료 톡쏘는 환타"));
                }
                case "Desserts" -> {
                    menuItems.add(new MenuItem("Apple pie", 1.5, "사과잼이 듬뿍 달콤한 간식"));
                    menuItems.add(new MenuItem("Cheese Stick", 2.0, "모짜렐라 치즈가 쭉쭉 늘어나요"));
                    menuItems.add(new MenuItem("French Fries", 1.4, "갓 튀긴 신선한 감자튀김"));
                }
                default -> System.out.println("없는 메뉴입니다");
            }

        }

    public String getCategory() {
            return category;
    }

    public List<MenuItem> getMenuItems() {
        return menuItems;
    }
}
