package command.simpleremote;

/**
 * @Author hustffx
 * @Date 2020/4/28 16:10
 */
public class SimpleRemoteLoader {
    public static void main(String[] args) {
        SimpleRemoteControl remote = new SimpleRemoteControl();

        // 使用传统方式
        Light light = new Light();
        LightOnCommand lightOn = new LightOnCommand(light);
        remote.setCommand(lightOn);
        remote.buttonWasPressed();

        // 使用函数式接口及方法引用
        GarageDoor garageDoor = new GarageDoor();
        remote.setCommand(garageDoor::up);
        remote.buttonWasPressed();
    }
}
