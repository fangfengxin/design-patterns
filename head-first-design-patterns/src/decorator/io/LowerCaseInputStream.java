package decorator.io;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * 利用java.io包下的API自定义装饰者.
 * FilterInputStream是所有InputStream的抽象装饰者。
 *
 * @Author hustffx
 * @Date 2020/4/22 23:37
 */
public class LowerCaseInputStream extends FilterInputStream {
    public LowerCaseInputStream(InputStream in) {
        super(in);
    }

    /**
     * 扩展FilterInputStream类并重写read()方法
     * 将每一字节都转换成小写
     *
     * @return
     * @throws IOException
     */
    @Override
    public int read() throws IOException {
        int read = super.read();
        return read == -1 ? read : Character.toLowerCase(read);
    }

    @Override
    public int read(byte[] b, int off, int len) throws IOException {
        int read = super.read(b, off, len);
        for (int i = off; i < off + read; i++) {
            b[i] = (byte) Character.toLowerCase(b[i]);
        }
        return read;
    }
}
