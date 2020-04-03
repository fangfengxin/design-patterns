package observer.weather;

/**
 * 主题接口
 */
public interface Subject {
    /**
     * 注册观察者
     */
    void registerObserver(Observer observer);

    /**
     * 删除观察者
     */
    void removeObserver(Observer observer);

    /**
     * 当主题状态改变时，这个方法会被调用，以通知所有的观察者
     */
    void notifyObservers();
}
