package decorator.starbucks;

/**
 * 浓缩咖啡饮料类
 *
 * @Author hustffx
 * @Date 2020/4/22 16:27
 */
public class Espresso extends Beverage {
    public Espresso() {
        description = "Espresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
