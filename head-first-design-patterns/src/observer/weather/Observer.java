package observer.weather;

/**
 * 观察者接口
 */
public interface Observer {
    /**
     * 当气象观测值改变时，主题会把这些状态值当做方法的参数，传递给观察者。
     * 所有的观察者必须实现 update 方法，以实现观察者接口。
     */
    void update(double temperature, double humidity, double pressure);
}
