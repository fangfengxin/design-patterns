package iterator.dinermergercafe;

import java.util.Calendar;
import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * @author hustffx
 * @date 2020/5/8 11:01
 */
public class AlternatingDinerMenuIterator implements Iterator<MenuItem> {
    private MenuItem[] menuItems;
    private int position;

    public AlternatingDinerMenuIterator(MenuItem[] menuItems) {
        this.menuItems = menuItems;
        position = Calendar.DAY_OF_WEEK % 2;
    }

    @Override
    public boolean hasNext() {
        return position < menuItems.length && menuItems[position] != null;
    }

    @Override
    public MenuItem next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        MenuItem menuItem = menuItems[position];
        position += 2;
        return menuItem;
    }
}
