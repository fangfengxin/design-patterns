package composite.menuiterator;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * @author hustffx
 * @date 2020/5/8 13:41
 */
public class CompositeIterator implements Iterator<MenuComponent> {
    private final Deque<Iterator<MenuComponent>> stack;

    public CompositeIterator(Iterator<MenuComponent> iterator) {
        stack = new ArrayDeque<>();
        stack.push(iterator);
    }

    @Override
    public boolean hasNext() {
        if (stack.isEmpty()) {
            return false;
        }
        Iterator<MenuComponent> iterator = stack.peek();
        if (!iterator.hasNext()) {
            stack.pop();
            return hasNext();
        }
        return true;
    }

    @Override
    public MenuComponent next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Iterator<MenuComponent> iterator = stack.peek();
        assert iterator != null;
        MenuComponent component = iterator.next();
        stack.push(component.iterator());
        return component;
    }
}
