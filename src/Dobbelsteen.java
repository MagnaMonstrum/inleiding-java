import java.awt.*;
import java.applet.*;

public class Dobbelsteen extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {

        g.drawRoundRect(20,20,100,100,30,30);


        g.fillOval(30,30,25,25);
        g.fillOval(90,30,25,25);
        g.fillOval(90,90,25,25);
        g.fillOval(30,90,25,25);


    }
}
