package compound.ducksimulator.composite;

import compound.ducksimulator.ducks.Quackable;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author hustffx
 * @Date 2020/5/11 18:28
 */
public class Flock implements Quackable {
    private final List<Quackable> quackers;

    public Flock() {
        quackers = new ArrayList<>();
    }

    public void add(Quackable quacker) {
        quackers.add(quacker);
    }

    @Override
    public void quack() {
        for (Quackable quacker : quackers) {
            quacker.quack();
        }
    }
}
