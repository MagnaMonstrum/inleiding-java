//Opdracht 11.3

import java.awt.*;
import java.applet.*;

public class H11Opdracht11punt3 extends Applet {
    int getal1;
    int getal2;
    int som;
    public void init(){
        getal1 = 0;
        getal2 = 1;
        som = getal1 = getal2;
    }

    public void paint(Graphics g){ ;
        int teller;
        int x = 0;

        for(teller = 0; teller < 10; teller++){
            x += 20;

            g.drawString("" + som, x,50);
            getal1 = getal2;
            getal2 = som;
            som = getal1 += getal2;

        }

    }
}
