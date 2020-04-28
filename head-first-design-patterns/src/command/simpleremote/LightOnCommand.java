package command.simpleremote;

/**
 * @Author hustffx
 * @Date 2020/4/28 15:59
 */
public class LightOnCommand implements Command {
    private Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }
}
