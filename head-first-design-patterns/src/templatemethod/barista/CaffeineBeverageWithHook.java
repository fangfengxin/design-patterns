package templatemethod.barista;

/**
 * 咖啡因饮料超类，实现制作的算法模板，包含钩子。
 *
 * @Author hustffx
 * @Date 2020/5/6 13:23
 */
public abstract class CaffeineBeverageWithHook {
    /**
     * 制作饮料模板方法，每一个步骤都被一个方法代替。
     */
    final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        if (customerWantsCondiments()) {
            addCondiments();
        }
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

    /**
     * 钩子是一种被声明在抽象类中的方法，但是只有空的或者默认的实现。
     * 钩子的存在可以让子类有能力对算法的不同点进行挂钩。要不要挂钩由子类自行实现。
     */
    boolean customerWantsCondiments() {
        return true;
    }
}
