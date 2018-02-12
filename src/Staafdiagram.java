import java.awt.*;
import java.applet.*;

public class Staafdiagram extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.blue);

        g.drawLine(50,50,50,200);
        g.drawLine(50,200,200,200);

        g.setColor(Color.green);
        g.fillRect(70,160,20,40);
        g.drawString("Valerie: 40 Kilo", 70,220);

        g.setColor(Color.RED);
        g.fillRect(110,100,20,100);
        g.drawString("Jeroen: 100 Kilo", 70,250);

        g.setColor(Color.ORANGE);
        g.fillRect(150,120,20,80);
        g.drawString("Hans: 80 Kilo", 70,280);

        g.setColor(Color.green);
        g.fillRect(50,210,15,20);

        g.setColor(Color.RED);
        g.fillRect(50,240,15,20);

        g.setColor(Color.ORANGE);
        g.fillRect(50,270,15,20);
    }

}
