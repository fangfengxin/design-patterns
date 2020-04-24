package factory.pizzafm;

/**
 * @Author hustffx
 * @Date 2020/4/24 17:53
 */
public abstract class PizzaStore {
    /**
     * 制作披萨
     *
     * @param item
     * @return
     */
    abstract Pizza createPizza(String item);

    public Pizza orderPizza(String type) {
        Pizza pizza = createPizza(type);
        System.out.println("--- Making a " + pizza.getName() + " ---");
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}
