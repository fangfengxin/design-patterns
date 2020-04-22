package decorator.starbucks;

/**
 * 饮料超类
 *
 * @Author hustffx
 * @Date 2020/4/22 16:05
 */
public abstract class Beverage {
    /**
     * 饮料介绍
     */
    String description = "Unknown Beverage";

    public String getDescription() {
        return description;
    }

    /**
     * 计算价格
     *
     * @return
     */
    public abstract double cost();
}
