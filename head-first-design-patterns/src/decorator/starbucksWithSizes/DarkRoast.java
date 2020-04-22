package decorator.starbucksWithSizes;

/**
 * 深焙咖啡饮料类
 *
 * @Author hustffx
 * @Date 2020/4/22 16:35
 */
public class DarkRoast extends Beverage {
    public DarkRoast() {
        description = "Dark Roast Coffee";
    }

    @Override
    public double cost() {
        return 0.99;
    }
}
