package decorator.io;

import java.io.*;

/**
 * @Author hustffx
 * @Date 2020/4/22 23:37
 */
public class InputTest {
    public static void main(String[] args) {
        int c;
        InputStream in = null;
        try {
            in = new LowerCaseInputStream(
                    new BufferedInputStream(
                            new FileInputStream(
                                    "head-first-design-patterns/src/decorator/io/test.txt")));
            while ((c = in.read()) != -1) {
                System.out.print((char) c);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (in != null) {
                try {
                    in.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
