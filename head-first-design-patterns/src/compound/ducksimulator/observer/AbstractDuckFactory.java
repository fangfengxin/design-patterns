package compound.ducksimulator.observer;

/**
 * @author hustffx
 */
public abstract class AbstractDuckFactory {

    public abstract Quackable createMallardDuck();

    public abstract Quackable createRedheadDuck();

    public abstract Quackable createDuckCall();

    public abstract Quackable createRubberDuck();
}
