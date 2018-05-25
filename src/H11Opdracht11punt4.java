// Opdracht 11.4

import java.awt.*;
import java.applet.*;

public class H11Opdracht11punt4 extends Applet {
    int getal;
    int getal2;


    public void init(){
        setSize(260,50);
        getal = 0;
        getal2 = 3;

    }

    public void paint(Graphics g){

        int teller;
        int x = 0;

        for(teller = 0; teller < 11; teller++){
            x += 20;
            g.drawString("" + getal, x, 20);
            getal += getal2;

        }
    }
}
