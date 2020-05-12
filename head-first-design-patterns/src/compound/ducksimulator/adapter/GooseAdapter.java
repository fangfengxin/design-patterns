package compound.ducksimulator.adapter;

import compound.ducksimulator.ducks.Quackable;

/**
 * @Author hustffx
 * @Date 2020/5/11 17:55
 */
public class GooseAdapter implements Quackable {
    Goose goose;

    public GooseAdapter(Goose goose) {
        this.goose = goose;
    }

    @Override
    public void quack() {
        goose.honk();
    }
}
