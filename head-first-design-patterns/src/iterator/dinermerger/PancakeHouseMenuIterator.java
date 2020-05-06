package iterator.dinermerger;

import java.util.List;

/**
 * @Author hustffx
 * @Date 2020/5/6 23:34
 */
public class PancakeHouseMenuIterator implements Iterator {
    private List<MenuItem> menuItems;
    private int position;

    public PancakeHouseMenuIterator(List<MenuItem> menuItems) {
        this.menuItems = menuItems;
        position = 0;
    }

    @Override
    public boolean hasNext() {
        return position < menuItems.size();
    }

    @Override
    public Object next() {
        MenuItem menuItem = menuItems.get(position);
        position++;
        return menuItem;
    }
}
