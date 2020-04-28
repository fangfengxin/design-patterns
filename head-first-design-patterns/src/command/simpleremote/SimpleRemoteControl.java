package command.simpleremote;

/**
 * @Author hustffx
 * @Date 2020/4/28 16:06
 */
public class SimpleRemoteControl {
    private Command command;

    public SimpleRemoteControl() {
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public void buttonWasPressed() {
        command.execute();
    }
}
