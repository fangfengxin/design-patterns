package compound.ducksimulator.decorator;

import compound.ducksimulator.ducks.Quackable;

/**
 * @Author hustffx
 * @Date 2020/5/11 18:00
 */
public class QuackCounter implements Quackable {
    private final Quackable duck;
    private static int numberOfQuacks = 0;

    public QuackCounter(Quackable duck) {
        this.duck = duck;
    }

    @Override
    public void quack() {
        duck.quack();
        numberOfQuacks++;
    }

    public static int getQuacks() {
        return numberOfQuacks;
    }
}
