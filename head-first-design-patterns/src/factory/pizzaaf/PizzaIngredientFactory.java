package factory.pizzaaf;

/**
 * 原料工厂接口
 *
 * @Author hustffx
 * @Date 2020/4/25 15:18
 */
public interface PizzaIngredientFactory {
    /**
     * 制造面团
     *
     * @return 面团
     */
    Dough createDough();

    /**
     * 制作酱料
     *
     * @return 酱料
     */
    Sauce createSauce();

    /**
     * 制作奶酪
     *
     * @return 奶酪
     */
    Cheese createCheese();

    /**
     * 制作蔬菜
     *
     * @return 蔬菜
     */
    Veggies[] createVeggies();

    /**
     * 制作香肠
     *
     * @return 香肠
     */
    Pepperoni createPepperoni();

    /**
     * 制作蛤蜊
     *
     * @return 蛤蜊
     */
    Clams createClams();
}
