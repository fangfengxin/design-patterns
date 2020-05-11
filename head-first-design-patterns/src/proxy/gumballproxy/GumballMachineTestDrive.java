package proxy.gumballproxy;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 * @Author hustffx
 * @Date 2020/5/8 17:09
 */
public class GumballMachineTestDrive {
    public static void main(String[] args) {
        try {
            GumballMachine gumballMachine = new GumballMachine("localhost", 10);
            // 创建注册表
            Registry registry = LocateRegistry.createRegistry(1099);
            registry.rebind("gumballmachine", gumballMachine);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }
}
