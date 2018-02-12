import java.awt.*;
import java.applet.*;

public class H4 extends Applet {

    public void init() {
        setBackground(Color.white);
    }

    public void paint(Graphics g) {
        setBackground(Color.black);
        g.setColor(Color.white);
        g.drawLine(150, 250, 230, 150);
        g.drawLine(150, 250, 300, 250);
        g.drawLine(230,150,300, 250 );

    }
}
