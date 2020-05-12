package compound.djview;

/**
 * @author hustffx
 */
public interface ControllerInterface {
    /**
     * 开启节拍
     */
    void start();

    /**
     * 停止节拍
     */
    void stop();

    /**
     * 增加bpm
     */
    void increaseBPM();

    /**
     * 减小bpm
     */
    void decreaseBPM();

    /**
     * 设置bpm
     *
     * @param bpm
     */
    void setBPM(int bpm);
}
