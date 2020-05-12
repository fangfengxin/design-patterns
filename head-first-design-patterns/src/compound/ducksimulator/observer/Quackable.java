package compound.ducksimulator.observer;

/**
 * @Author hustffx
 * @Date 2020/5/11 19:09
 */
public interface Quackable extends QuackObservable {
    /**
     * 呱呱叫
     */
    void quack();
}
