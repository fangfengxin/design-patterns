package command.simpleremote;

/**
 * @Author hustffx
 * @Date 2020/4/28 16:04
 */
public class LightOffCommand implements Command {
    private Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }
}
