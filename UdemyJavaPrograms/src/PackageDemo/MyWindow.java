package PackageDemo;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MyWindow extends Frame {

    public MyWindow(String title) {
        super(title);
        setSize(700, 150);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Font arialLarge = new Font("Arial", Font.BOLD, 24);
        Font arialSmall = new Font("Arial", Font.ITALIC, 14);
        g.setFont(arialLarge);
        g.drawString("The Complete JAVA Developer Course", 60, 60);
        g.setFont(arialSmall);
        g.drawString("by Author", 60, 100);
    }
}
