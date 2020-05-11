package proxy.virtualproxy;

import javax.swing.*;
import java.awt.*;
import java.net.URL;
import java.util.concurrent.*;

/**
 * @Author hustffx
 * @Date 2020/5/10 17:27
 */
public class ImageProxy implements Icon {
    private ImageIcon imageIcon;
    private final URL imageUrl;
    private boolean retrieving;

    private static final ThreadPoolExecutor executor = new ThreadPoolExecutor(
            10, 10, 30, TimeUnit.SECONDS,
            new ArrayBlockingQueue<>(10), new ThreadPoolExecutor.DiscardOldestPolicy());

    public ImageProxy(URL imageUrl) {
        this.imageUrl = imageUrl;
        retrieving = false;
    }

    public synchronized void setImageIcon(ImageIcon imageIcon) {
        this.imageIcon = imageIcon;
    }

    @Override
    public void paintIcon(Component c, Graphics g, int x, int y) {
        if (imageIcon != null) {
            imageIcon.paintIcon(c, g, x, y);
            return;
        }

        g.drawString("Loading CD cover, please wait...", x + 300, y + 190);

        if (!retrieving) {
            retrieving = true;
            executor.execute(() -> {
                try {
                    setImageIcon(new ImageIcon(imageUrl, "CD Cover"));
                    c.repaint();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            });
        }
    }

    @Override
    public int getIconWidth() {
        return imageIcon == null ? 800 : imageIcon.getIconWidth();
    }

    @Override
    public int getIconHeight() {
        return imageIcon == null ? 600 : imageIcon.getIconHeight();
    }
}
