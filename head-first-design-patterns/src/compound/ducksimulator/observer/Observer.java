package compound.ducksimulator.observer;

/**
 * @Author hustffx
 * @Date 2020/5/11 19:20
 */
public interface Observer {
    /**
     * 更新
     *
     * @param duck
     */
    void update(QuackObservable duck);
}
