package templatemethod.simplebarista;

/**
 * @Author hustffx
 * @Date 2020/5/6 13:18
 */
public class Coffee {
    void prepareRecipe() {
        boilWater();
        brewCoffeeGrinds();
        pourInCup();
        addSugarAndMilk();
    }

    void boilWater() {
        System.out.println("Boiling water");
    }

    void brewCoffeeGrinds() {
        System.out.println("Dripping Coffee through filter");
    }

    void pourInCup() {
        System.out.println("Pouring into cup");
    }

    void addSugarAndMilk() {
        System.out.println("Adding Sugar and Milk");
    }
}
