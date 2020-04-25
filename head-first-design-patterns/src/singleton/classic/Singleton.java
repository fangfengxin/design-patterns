package singleton.classic;

/**
 * @Author hustffx
 * @Date 2020/4/25 21:58
 */
public class Singleton {
    /**
     * 使用静态变量记录唯一实例
     */
    private static Singleton uniqueInstance;

    /**
     * 私有构造方法，只有本类成员可以访问
     */
    private Singleton() {
    }

    /**
     * 获取实例对象。
     * 这里的方法体会有一些多线程安全问题。
     */
    public static Singleton getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }

    public String getDescription() {
        return "I'm a classic Singleton!";
    }
}
