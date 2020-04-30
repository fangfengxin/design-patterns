package adapter.ducks;

/**
 * @Author hustffx
 * @Date 2020/4/30 18:52
 */
public class WildTurkey implements Turkey {
    @Override
    public void gobble() {
        System.out.println("Gobble gobble");
    }

    @Override
    public void fly() {
        System.out.println("I'm flying a short distance");
    }
}
