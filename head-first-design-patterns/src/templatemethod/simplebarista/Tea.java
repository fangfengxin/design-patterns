package templatemethod.simplebarista;

/**
 * @Author hustffx
 * @Date 2020/5/6 13:20
 */
public class Tea {
    void prepareRecipe() {
        boilWater();
        steepTeaBag();
        pourInCup();
        addLemon();
    }

    void boilWater() {
        System.out.println("Boiling water");
    }

    void steepTeaBag() {
        System.out.println("Steeping the tea");
    }

    void addLemon() {
        System.out.println("Adding Lemon");
    }

    void pourInCup() {
        System.out.println("Pouring into cup");
    }
}
