package command.remote;

/**
 * @author fengxin.fang
 */
public class Light {
	private final String location;

	public Light(String location) {
		this.location = location;
	}

	public void on() {
		System.out.println(location + " light is on");
	}

	public void off() {
		System.out.println(location + " light is off");
	}
}