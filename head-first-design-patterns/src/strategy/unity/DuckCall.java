package strategy.unity;

import strategy.behaviors.quack.Quack;
import strategy.behaviors.quack.QuackBehavior;

/**
 * 鸭鸣器，可模拟鸭叫声
 */
public class DuckCall {
    QuackBehavior quackBehavior;

    public DuckCall() {
        quackBehavior = new Quack();
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    public void quack() {
        quackBehavior.quack();
    }
}
