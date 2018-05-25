// Opdracht 11.8

import java.awt.*;
import java.applet.*;

public class H11Opdracht11punt8 extends Applet {

    public void init(){
    setSize(600,600);
    }
    public void paint(Graphics g){
        int teller;
        int breedte = 5;
        int hoogte = 5;

        for(teller = 0; teller < 100; teller++){
            breedte += 5;
            hoogte += 5;
            g.drawOval(50,50, breedte, hoogte);
        }

    }
}
