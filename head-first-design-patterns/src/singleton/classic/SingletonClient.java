package singleton.classic;

/**
 * @Author hustffx
 * @Date 2020/4/25 22:09
 */
public class SingletonClient {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        System.out.println(singleton.getDescription());
    }
}
