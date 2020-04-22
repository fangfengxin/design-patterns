package decorator.starbucks;

/**
 * 调料装饰者
 *
 * @Author hustffx
 * @Date 2020/4/22 16:20
 */
public abstract class CondimentDecorator extends Beverage {
    /**
     * 获取描述
     * 所有调料装饰者都必须重新实现getDescription()方法
     *
     * @return
     */
    @Override
    public abstract String getDescription();
}
