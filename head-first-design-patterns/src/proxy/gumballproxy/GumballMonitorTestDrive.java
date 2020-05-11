package proxy.gumballproxy;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 * @Author hustffx
 * @Date 2020/5/10 14:21
 */
public class GumballMonitorTestDrive {
    public static void main(String[] args) {
        try {
            // 获取到注册表的代理
            Registry registry = LocateRegistry.getRegistry(1099);
            // 利用注册表的代理去查询远程注册表中名为gumballmachine的对象
            GumballMachineRemote machine = (GumballMachineRemote) registry.lookup("gumballmachine");
            GumballMonitor gumballMonitor = new GumballMonitor(machine);
            gumballMonitor.report();
        } catch (RemoteException | NotBoundException e) {
            e.printStackTrace();
        }
    }
}
