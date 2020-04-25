package singleton.doublecheckedlocking;

/**
 * @Author hustffx
 * @Date 2020/4/25 22:58
 */
public class SingletonClient {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
    }
}
