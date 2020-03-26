package strategy.unity;

import strategy.behaviors.fly.FlyWithWings;
import strategy.behaviors.quack.Quack;

/**
 * 绿头鸭，会飞，会呱呱叫
 */
public class MallardDuck extends Duck {
    public MallardDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I'm a real Mallard duck");
    }
}
