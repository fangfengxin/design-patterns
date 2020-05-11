package proxy.virtualproxy;

import javax.swing.*;
import java.awt.*;

/**
 * @Author hustffx
 * @Date 2020/5/10 17:22
 */
public class ImageComponent extends JComponent {
    private transient Icon icon;

    public ImageComponent(Icon icon) {
        this.icon = icon;
    }

    public void setIcon(Icon icon) {
        this.icon = icon;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        int w = icon.getIconWidth();
        int h = icon.getIconHeight();
        int x = (800 - w) / 2;
        int y = (600 - h) / 2;
        icon.paintIcon(this, g, x, y);
    }
}
