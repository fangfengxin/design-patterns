package singleton.doublecheckedlocking;

/**
 * @Author hustffx
 * @Date 2020/4/25 22:44
 */
public class Singleton {
    /**
     * volatile关键字确保，当uniqueInstance变量被初始化成Singleton实例时，多个线程正确地处理uniqueInstance变量。
     */
    private static volatile Singleton uniqueInstance;

    private Singleton() {
    }

    /**
     * 保证多线程安全：
     * 1.直接在方法上加锁，会造成性能浪费。
     * 2.不用延迟实例化的做法，直接在加载类的时候就理科创建实例。
     * 3.使用双重检查加锁，减少同步。
     */
    public static Singleton getInstance() {
        // 检查实例不存在就进入同步区块
        if (uniqueInstance == null) {
            // 只有第一次进入区块的时候才会彻底执行所有代码
            synchronized (Singleton.class) {
                // 进入区块后再次检查，仍是null才会创建实例
                if (uniqueInstance == null) {
                    uniqueInstance = new Singleton();
                }
            }
        }
        return uniqueInstance;
    }
}
