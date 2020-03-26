package strategy.unity;

import strategy.behaviors.fly.FlyNoWay;
import strategy.behaviors.quack.Quack;

/**
 * 模型鸭
 */
public class ModelDuck extends Duck {
    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I'm a model duck");
    }
}
