package command.remotewithundo;

/**
 * @author fengxin.fang
 */
public class NoCommand implements Command {
    @Override
    public void execute() {
    }

    @Override
    public void undo() {
    }
}
