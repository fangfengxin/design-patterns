package adapter.iterenum;

import java.util.Arrays;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

/**
 * @Author hustffx
 * @Date 2020/4/30 20:04
 */
class EnumerationIteratorTest {
    public static void main(String[] args) {
        Vector<String> v = new Vector<>(Arrays.asList(args));
        Enumeration<String> enumeration = v.elements();
        Iterator<?> iterator = new EnumerationIterator(enumeration);
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}