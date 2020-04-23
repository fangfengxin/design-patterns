package factory.pizzas;

import java.util.ArrayList;

/**
 * 披萨类
 *
 * @Author hustffx
 * @Date 2020/4/23 22:55
 */
public abstract class Pizza {
    String name;
    String dough;
    String sauce;
    ArrayList<String> toppings = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void prepare() {
        System.out.println("Preparing " + name);
    }

    public void bake() {
        System.out.println("Baking " + name);
    }

    public void cut() {
        System.out.println("Cutting " + name);
    }

    public void box() {
        System.out.println("Boxing " + name);
    }

    @Override
    public String toString() {
        StringBuilder display = new StringBuilder();
        display.append("---- ").append(name).append(" ----\n");
        display.append(dough).append("\n");
        display.append(sauce).append("\n");
        for (String topping : toppings) {
            display.append(topping).append("\n");
        }
        return display.toString();
    }
}
