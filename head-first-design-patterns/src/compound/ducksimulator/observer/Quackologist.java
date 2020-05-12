package compound.ducksimulator.observer;

/**
 * @Author hustffx
 * @Date 2020/5/11 19:33
 */
public class Quackologist implements Observer {
    @Override
    public void update(QuackObservable duck) {
        System.out.println("Quackologist: " + duck + " just quacked.");
    }
}
