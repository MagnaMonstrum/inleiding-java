import java.awt.*;
import java.applet.*;

public class Stoplicht extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {

        g.fillRect(50,50,50,110);
        g.setColor(Color.RED);
        g.fillOval(65,65,20,20);
        g.setColor(Color.orange);
        g.fillOval(65,95,20,20);
        g.setColor(Color.green);
        g.fillOval(65,125,20,20);




    }
}