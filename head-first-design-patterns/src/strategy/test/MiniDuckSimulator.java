package strategy.test;

import strategy.behaviors.fly.FlyRocketPowered;
import strategy.unity.Duck;
import strategy.unity.MallardDuck;
import strategy.unity.ModelDuck;

/**
 * 小型鸭子模拟器
 */
public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.display();
        mallard.performFly();
        mallard.performQuack();

        System.out.println();

        Duck model = new ModelDuck();
        model.display();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
