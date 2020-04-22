package decorator.starbucks;

/**
 * 低咖啡因饮料类
 *
 * @Author hustffx
 * @Date 2020/4/22 16:38
 */
public class Decaf extends Beverage {
    public Decaf() {
        description = "Decaf";
    }

    @Override
    public double cost() {
        return 1.05;
    }
}
