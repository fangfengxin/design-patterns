package strategy.test;

import strategy.behaviors.quack.Squeak;
import strategy.unity.DuckCall;

public class DuckCallTest {
    public static void main(String[] args) {
        DuckCall duckCall = new DuckCall();
        duckCall.quack();
        duckCall.setQuackBehavior(new Squeak());
        duckCall.quack();
    }
}
