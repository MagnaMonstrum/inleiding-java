import java.awt.*;
import java.applet.*;

public class Show extends Applet {

    public void init() {
        setBackground(Color.white);
    }

    public void paint(Graphics g) {
        g.setColor(Color.blue);
        g.drawString("Mo", 200, 140);
        g.setColor(Color.RED);
        g.drawString("Idbid", 200, 150);
        g.drawLine(1, 100, 100, 100);
    }
}

