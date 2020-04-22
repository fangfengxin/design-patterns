package decorator.starbucksWithSizes;

/**
 * 综合咖啡饮料类
 *
 * @Author hustffx
 * @Date 2020/4/22 16:32
 */
public class HouseBlend extends Beverage {
    public HouseBlend() {
        description = "Hose Blend Coffee";
    }

    @Override
    public double cost() {
        return 0.89;
    }
}
