package iterator.dinermerger;

/**
 * @Author hustffx
 * @Date 2020/5/6 23:30
 */
public class DinerMenuIterator implements Iterator {
    private MenuItem[] items;
    private int position;

    public DinerMenuIterator(MenuItem[] items) {
        this.items = items;
        position = 0;
    }

    @Override
    public boolean hasNext() {
        return position < items.length && items[position] != null;
    }

    @Override
    public Object next() {
        MenuItem menuItem = items[position];
        position++;
        return menuItem;
    }
}
