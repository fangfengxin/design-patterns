package iterator.implicit;

import java.util.Iterator;

/**
 * @author hustffx
 * @date 2020/5/7 0:17
 */
public interface Menu {
    /**
     * 返回迭代器.
     *
     * @return
     */
    Iterator<MenuItem> iterator();
}
