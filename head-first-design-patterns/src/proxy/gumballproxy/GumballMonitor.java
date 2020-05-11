package proxy.gumballproxy;

/**
 * @Author hustffx
 * @Date 2020/5/10 11:55
 */
public class GumballMonitor {
    private final GumballMachineRemote machine;

    public GumballMonitor(GumballMachineRemote machine) {
        this.machine = machine;
    }

    public void report() {
        try {
            System.out.println("Gumball Machine: " + machine.getLocation());
            System.out.println("Current inventory: " + machine.getCount() + " gumballs");
            System.out.println("Current state: " + machine.getState());
        } catch (java.rmi.RemoteException e) {
            e.printStackTrace();
        }
    }
}
