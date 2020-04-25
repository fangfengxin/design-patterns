package factory.pizzaaf;

/**
 * @Author hustffx
 * @Date 2020/4/25 16:07
 */
public abstract class PizzaStore {
    /**
     * 按类型制作披萨
     *
     * @param type 披萨类型
     * @return 披萨
     */
    protected abstract Pizza createPizza(String type);

    public Pizza orderPizza(String type) {
        Pizza pizza = createPizza(type);
        System.out.println("--- Making" + pizza.getName() + " ---");
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}
