package compound.ducksimulator.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author hustffx
 * @Date 2020/5/11 19:16
 */
public class Observable implements QuackObservable {
    private final List<Observer> observers;
    QuackObservable duck;

    public Observable(QuackObservable duck) {
        this.duck = duck;
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(duck);
        }
    }
}
