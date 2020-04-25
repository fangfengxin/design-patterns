package factory.pizzaaf;

/**
 * @Author hustffx
 * @Date 2020/4/25 16:20
 */
public class PizzaTestDrive {
    public static void main(String[] args) {
        NewYorkPizzaStore newYorkPizzaStore = new NewYorkPizzaStore();
        ChicagoPizzaStore chicagoPizzaStore = new ChicagoPizzaStore();

        Pizza pizza = newYorkPizzaStore.orderPizza("cheese");
        System.out.println("Flexia ordered a " + pizza.getName() + "\n");

        pizza = chicagoPizzaStore.orderPizza("clam");
        System.out.println("Hustffx ordered a " + pizza.getName() + "\n");
    }
}
