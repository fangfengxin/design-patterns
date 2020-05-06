package templatemethod.barista;

/**
 * 咖啡因饮料超类，实现制作的算法模板。
 * 其中煮沸水和装杯环节是固定模式，超类直接实现。
 * 冲泡和调料根据饮料不同有所差异，让子类自行实现，声明为abstract。
 * 算法模板不希望被子类覆盖，声明为final。
 *
 * @Author hustffx
 * @Date 2020/5/6 13:23
 */
public abstract class CaffeineBeverage {
    /**
     * 制作饮料模板方法，每一个步骤都被一个方法代替。
     */
    final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    /**
     * 把水煮沸。
     */
    void boilWater() {
        System.out.println("Boiling water");
    }

    /**
     * 用热水冲泡饮料。
     */
    abstract void brew();

    /**
     * 把饮料倒进杯子。
     */
    void pourInCup() {
        System.out.println("Pouring into cup");
    }

    /**
     * 在饮料中加入调料。
     */
    abstract void addCondiments();
}
