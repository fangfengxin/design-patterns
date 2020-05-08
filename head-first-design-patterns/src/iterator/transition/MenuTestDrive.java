package iterator.transition;

import java.util.Arrays;

/**
 * @Author hustffx
 * @Date 2020/5/6 23:56
 */
public class MenuTestDrive {
    public static void main(String[] args) {
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        DinerMenu dinerMenu = new DinerMenu();
        CafeMenu cafeMenu = new CafeMenu();
        Waitress waitress = new Waitress(Arrays.asList(pancakeHouseMenu, dinerMenu, cafeMenu));
        waitress.printMenu();
    }
}
