package factory.pizzaaf;

/**
 * @Author hustffx
 * @Date 2020/4/25 15:56
 */
public abstract class Pizza {
    String name;

    Dough dough;
    Sauce sauce;
    Veggies[] veggies;
    Cheese cheese;
    Pepperoni pepperoni;
    Clams clam;

    /**
     * 准备原料
     */
    abstract void prepare();

    void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }

    void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }

    void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("---- ").append(name).append(" ----\n");
        if (dough != null) {
            result.append(dough).append("\n");
        }
        if (sauce != null) {
            result.append(sauce).append("\n");
        }
        if (cheese != null) {
            result.append(cheese).append("\n");
        }
        if (veggies != null) {
            for (int i = 0; i < veggies.length; i++) {
                result.append(veggies[i]);
                if (i < veggies.length - 1) {
                    result.append(", ");
                }
            }
            result.append("\n");
        }
        if (clam != null) {
            result.append(clam).append("\n");
        }
        if (pepperoni != null) {
            result.append(pepperoni).append("\n");
        }
        return result.toString();
    }
}
