package compound.ducksimulator.ducks;

/**
 * @Author hustffx
 * @Date 2020/5/11 17:50
 */
public class DuckSimulator {
    public static void main(String[] args) {
        new DuckSimulator().simulate();
    }

    private void simulate() {
        Quackable mallardDuck = new MallardDuck();
        Quackable redheadDuck = new RedheadDuck();
        Quackable duckCall = new DuckCall();
        Quackable rubberDuck = new RubberDuck();

        System.out.println("\nDuck Simulator");

        simulate(mallardDuck);
        simulate(redheadDuck);
        simulate(duckCall);
        simulate(rubberDuck);
    }

    private void simulate(Quackable duck) {
        duck.quack();
    }
}
