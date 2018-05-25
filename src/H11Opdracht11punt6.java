//Opdracht 11.6

import java.awt.*;
import java.applet.*;

public class H11Opdracht11punt6 extends Applet {
    public void init(){
        setSize(200,180);
    }

    public void paint(Graphics g){
        int teller;
        int x = 100;
        int y = 100;
        int breedte = 0;
        int hoogte = 0;

        for(teller = 0; teller < 5; teller++){
            x -= 10;
            y -= 10;
            breedte += 20;
            hoogte += 20;
            g.drawOval(x, y, breedte, hoogte);

        }
    }
}
