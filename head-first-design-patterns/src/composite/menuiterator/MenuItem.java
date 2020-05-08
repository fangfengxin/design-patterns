package composite.menuiterator;

import java.util.Iterator;

/**
 * @author hustffx
 * @date 2020/5/8 12:28
 */
public class MenuItem extends MenuComponent {
    private final String name;
    private final String description;
    private final boolean vegetarian;
    private final double price;

    public MenuItem(String name, String description, boolean vegetarian, double price) {
        this.name = name;
        this.description = description;
        this.vegetarian = vegetarian;
        this.price = price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public boolean isVegetarian() {
        return vegetarian;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void print() {
        StringBuilder sb = new StringBuilder();
        sb.append(" - ").append(name);
        if (isVegetarian()) {
            sb.append(" (v)");
        }
        sb.append(", ").append(price);
        sb.append("\n    - ").append(description);
        System.out.println(sb);
    }

    @Override
    public Iterator<MenuComponent> iterator() {
        return new NullIterator();
    }
}
