package command.remote;

/**
 * @Author hustffx
 * @Date 2020/4/28 17:16
 */
public class RemoteControl {
    Command[] onCommands;
    Command[] offCommands;

    public RemoteControl() {
        onCommands = new Command[7];
        offCommands = new Command[7];

        for (int i = 0; i < 7; i++) {
            onCommands[i] = () -> System.out.println("Nothing to do");
            offCommands[i] = () -> System.out.println("Nothing to do");
        }
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonPressed(int slot) {
        onCommands[slot].execute();
    }

    public void offButtonPressed(int slot) {
        offCommands[slot].execute();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("--- Remote Control ---\n");
        for (int i = 0; i < 7; i++) {
            sb.append("[slot ").append(i).append("] ")
                    .append(onCommands[i].getClass().getName()).append(" ")
                    .append(offCommands[i].getClass().getName()).append("\n");
        }
        return sb.toString();
    }
}
