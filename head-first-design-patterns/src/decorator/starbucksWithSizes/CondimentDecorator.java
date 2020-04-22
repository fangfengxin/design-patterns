package decorator.starbucksWithSizes;

/**
 * 调料装饰者
 *
 * @Author hustffx
 * @Date 2020/4/22 16:20
 */
public abstract class CondimentDecorator extends Beverage {
    Beverage beverage;

    /**
     * 获取描述
     * 所有调料装饰者都必须重新实现getDescription()方法
     *
     * @return 饮料描述
     */
    @Override
    public abstract String getDescription();

    @Override
    public Size getSize() {
        return beverage.getSize();
    }
}
