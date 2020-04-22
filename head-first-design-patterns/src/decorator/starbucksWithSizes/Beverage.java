package decorator.starbucksWithSizes;

/**
 * 饮料超类
 *
 * @Author hustffx
 * @Date 2020/4/22 16:05
 */
public abstract class Beverage {
    enum Size {
        /**
         * 小杯
         */
        TALL,
        /**
         * 中杯
         */
        GRANDE,
        /**
         * 大杯
         */
        VENTI
    }

    Size size = Size.TALL;

    /**
     * 饮料介绍
     */
    String description = "Unknown Beverage";

    public String getDescription() {
        return description;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    /**
     * 计算价格
     *
     * @return
     */
    public abstract double cost();
}
