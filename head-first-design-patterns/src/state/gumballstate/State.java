package state.gumballstate;

/**
 * @Author hustffx
 * @Date 2020/5/8 16:56
 */
public interface State {
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

    /**
     * 重填糖果
     */
    void refill();
}
