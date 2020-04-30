package adapter.iterenum;

import java.util.Enumeration;
import java.util.Iterator;

/**
 * @Author hustffx
 * @Date 2020/4/30 20:13
 */
public class IteratorEnumeration implements Enumeration<Object> {
    Iterator<?> iterator;

    public IteratorEnumeration(Iterator<?> iterator) {
        this.iterator = iterator;
    }

    @Override
    public boolean hasMoreElements() {
        return iterator.hasNext();
    }

    @Override
    public Object nextElement() {
        return iterator.next();
    }
}
