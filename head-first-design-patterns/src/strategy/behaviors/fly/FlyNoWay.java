package strategy.behaviors.fly;

/**
 * 不能飞行
 */
public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I can't fly");
    }
}
