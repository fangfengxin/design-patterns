package compound.ducksimulator.observer;

/**
 * @Author hustffx
 * @Date 2020/5/11 19:08
 */
public interface QuackObservable {
    /**
     * 注册观察者
     *
     * @param observer
     */
    void registerObserver(Observer observer);

    /**
     * 通知观察者
     */
    void notifyObservers();
}
