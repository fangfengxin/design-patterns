package proxy.gumballmonitor;

import java.io.Serializable;

/**
 * @Author hustffx
 * @Date 2020/5/8 16:56
 */
public interface State extends Serializable {
    /**
     * 投币
     */
    void insertQuarter();

    /**
     * 退币
     */
    void ejectQuarter();

    /**
     * 转动曲柄
     */
    void turnCrank();

    /**
     * 分配糖果
     */
    void dispense();
}
