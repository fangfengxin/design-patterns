package templatemethod.sort;

/**
 * @Author hustffx
 * @Date 2020/5/6 14:28
 */
public class Duck implements Comparable<Duck> {
    String name;
    int weight;

    public Duck(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Duck{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }

    @Override
    public int compareTo(Duck o) {
        return this.weight - o.weight;
    }
}
