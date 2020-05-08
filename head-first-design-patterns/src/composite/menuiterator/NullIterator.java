package composite.menuiterator;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * @author hustffx
 * @date 2020/5/8 13:55
 */
public class NullIterator implements Iterator<MenuComponent> {
    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public MenuComponent next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        return null;
    }
}
