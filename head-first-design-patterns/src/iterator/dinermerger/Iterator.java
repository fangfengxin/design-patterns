package iterator.dinermerger;

/**
 * @Author hustffx
 * @Date 2020/5/6 23:27
 */
public interface Iterator {
    /**
     * 集合中是否还有更多的元素
     *
     * @return
     */
    boolean hasNext();

    /**
     * 返回集合中的下一个元素
     *
     * @return
     */
    Object next();
}
