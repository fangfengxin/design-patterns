package iterator.transition;

import java.util.Iterator;
import java.util.List;

/**
 * @Author hustffx
 * @Date 2020/5/6 22:48
 */
public class Waitress {
    List<Menu> menus;

    public Waitress(List<Menu> menus) {
        this.menus = menus;
    }

    public void printMenu() {
        for (Menu menu : menus) {
            printMenu(menu.iterator());
            System.out.println();
        }
    }

    private void printMenu(Iterator<MenuItem> iterator) {
        while (iterator.hasNext()) {
            MenuItem menuItem = iterator.next();
            System.out.println(menuItem);
        }
    }
}
