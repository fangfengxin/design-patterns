package command.remote;

/**
 * @Author hustffx
 * @Date 2020/4/28 15:56
 */
@FunctionalInterface
public interface Command {
    /**
     * 用来调用接收者对象的方法
     */
    void execute();
}
