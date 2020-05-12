package compound.djview;

/**
 * @author hustffx
 */
public interface BeatModelInterface {
    /*
     * 下面四个方法由控制器调用，根据用户操作对模型做出适当处理
     */

    /**
     * 初始化
     */
    void initialize();

    /**
     * 打开节拍产生器
     */
    void on();

    /**
     * 关闭节拍产生器
     */
    void off();

    /**
     * 设置节拍频率
     *
     * @param bpm
     */
    void setBPM(int bpm);

    /*
     * 下面的方法允许视图和控制器获取状态并变成观察者
     */

    /**
     * 获取节拍频率
     *
     * @return
     */
    int getBPM();

    /**
     * 注册节拍观察者
     *
     * @param o
     */
    void registerObserver(BeatObserver o);

    /**
     * 删除节拍观察者
     *
     * @param o
     */
    void removeObserver(BeatObserver o);

    /**
     * 注册BPM观察者
     *
     * @param o
     */
    void registerObserver(BPMObserver o);

    /**
     * 删除BPM观察者
     *
     * @param o
     */
    void removeObserver(BPMObserver o);
}
