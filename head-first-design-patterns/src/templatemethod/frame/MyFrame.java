package templatemethod.frame;

import javax.swing.*;
import java.awt.*;

/**
 * @Author hustffx
 * @Date 2020/5/6 14:43
 */
public class MyFrame extends JFrame {
    private static final long serialVersionUID = 2L;

    public MyFrame(String title) {
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.setSize(400, 300);
        this.setVisible(true);
    }

    @Override
    public void paint(Graphics graphics) {
        super.paint(graphics);
        String msg = "I rule!!";
        graphics.drawString(msg, 180, 150);
    }

    public static void main(String[] args) {
        MyFrame myFrame = new MyFrame("Head First Design Patterns");
    }
}
