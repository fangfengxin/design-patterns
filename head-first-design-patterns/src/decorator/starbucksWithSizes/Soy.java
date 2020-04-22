package decorator.starbucksWithSizes;

/**
 * 豆浆装饰者
 *
 * @Author hustffx
 * @Date 2020/4/22 16:44
 */
public class Soy extends CondimentDecorator {
    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    /**
     * 不只是描述饮料，而是完整地连调料都描述出来
     */
    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soybean Milk";
    }

    /**
     * 调料价格加上饮料价格
     */
    @Override
    public double cost() {
        double cost = beverage.cost();
        if (beverage.getSize() == Size.TALL) {
            cost += 0.10;
        } else if (beverage.getSize() == Size.GRANDE) {
            cost += 0.15;
        } else if (beverage.getSize() == Size.VENTI) {
            cost += 0.20;
        }
        return cost;
    }
}
