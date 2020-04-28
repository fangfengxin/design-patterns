package command.simpleremote;

/**
 * @Author hustffx
 * @Date 2020/4/28 16:14
 */
public class GarageDoor {
    public GarageDoor() {
    }

    public void up() {
        System.out.println("Garage door is open");
    }

    public void down() {
        System.out.println("Garage door is close");
    }

    public void stop() {
        System.out.println("Garage door is stopped");
    }

    public void lightOn() {
        System.out.println("Garage light is on");
    }

    public void lightOff() {
        System.out.println("Garage light is off");
    }
}
