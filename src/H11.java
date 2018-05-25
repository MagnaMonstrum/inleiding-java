//Opdracht 11.1

import java.awt.*;
import java.applet.*;


public class H11 extends Applet {

    public void init() {}

    public void paint(Graphics g) {
        int teller = 0;
        int x = 0;

        while(teller < 10) {
            x += 20;
            g.drawLine( x, 20, x, 200 );
            g.drawString("" + teller, x, 215);
            teller++;
        }
    }
}