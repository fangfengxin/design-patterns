package proxy.gumballproxy;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * @Author hustffx
 * @Date 2020/5/10 14:05
 */
public interface GumballMachineRemote extends Remote {
    /**
     * 获取远程糖果机的糖果数量
     *
     * @return
     * @throws RemoteException
     */
    int getCount() throws RemoteException;

    /**
     * 获取远程糖果的位置信息
     *
     * @return
     * @throws RemoteException
     */
    String getLocation() throws RemoteException;

    /**
     * 获取远程糖果机的状态
     *
     * @return
     * @throws RemoteException
     */
    State getState() throws RemoteException;
}
