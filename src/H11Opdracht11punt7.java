// Opdracht 11.7

import java.awt.*;
import java.applet.*;

public class H11Opdracht11punt7 extends Applet {
    public void init(){
    setSize(700,700);
    }
    public void paint(Graphics g){
        int teller;
        int x = 280;
        int y = 300;
        int breedte = 0;
        int hoogte = 0;

        for(teller = 0; teller < 50; teller++){
            x -= 5;
            y -= 5;
            breedte += 10;
            hoogte += 10;
            g.drawOval(x, y, breedte, hoogte);
        }
    }
}
