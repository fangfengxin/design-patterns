package command.remote;

/**
 * @Author hustffx
 * @Date 2020/4/28 17:30
 */
public class RemoteControlTest {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();

        Light livingRoomLight = new Light("Living Room");
        Light kitchenLight = new Light("Kitchen");
        CeilingFan ceilingFan = new CeilingFan("Living Room");
        GarageDoor garageDoor = new GarageDoor("Main house");
        Stereo stereo = new Stereo("Living Room");

        remoteControl.setCommand(0, livingRoomLight::on, livingRoomLight::off);
        remoteControl.setCommand(1, kitchenLight::on, kitchenLight::off);
        remoteControl.setCommand(2, ceilingFan::high, ceilingFan::low);

        Command stereoOnWithCD = () -> {
            stereo.on();
            stereo.setCD();
            stereo.setVolume(10);
        };
        remoteControl.setCommand(3, stereoOnWithCD, stereo::off);
        remoteControl.setCommand(4, garageDoor::up, garageDoor::down);

        System.out.println(remoteControl);

        remoteControl.onButtonPressed(0);
        remoteControl.offButtonPressed(0);
        remoteControl.onButtonPressed(1);
        remoteControl.offButtonPressed(1);
        remoteControl.onButtonPressed(2);
        remoteControl.offButtonPressed(2);
        remoteControl.onButtonPressed(3);
        remoteControl.offButtonPressed(3);
        remoteControl.onButtonPressed(4);
        remoteControl.offButtonPressed(4);
        remoteControl.onButtonPressed(5);
    }
}
