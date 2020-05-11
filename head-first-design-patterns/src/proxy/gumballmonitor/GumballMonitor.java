package proxy.gumballmonitor;

/**
 * @Author hustffx
 * @Date 2020/5/10 11:55
 */
public class GumballMonitor {
    private final GumballMachine machine;

    public GumballMonitor(GumballMachine machine) {
        this.machine = machine;
    }

    public void report() {
        System.out.println("Gumball Machine: " + machine.getLocation());
        System.out.println("Current inventory: " + machine.getCount() + " gumballs");
        System.out.println("Current state: " + machine.getState());
    }
}
