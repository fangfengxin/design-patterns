package command.undo;

/**
 * @Author hustffx
 * @Date 2020/4/28 22:40
 */
public interface Command {
    /**
     * 执行命令
     */
    void execute();

    /**
     * 撤销命令
     */
    void undo();
}
