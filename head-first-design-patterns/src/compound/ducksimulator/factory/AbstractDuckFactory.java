package compound.ducksimulator.factory;

import compound.ducksimulator.ducks.Quackable;

/**
 * @Author hustffx
 * @Date 2020/5/11 18:11
 */
public abstract class AbstractDuckFactory {
    public abstract Quackable createMallardDuck();

    public abstract Quackable createRedheadDuck();

    public abstract Quackable createDuckCall();

    public abstract Quackable createRubberDuck();
}
