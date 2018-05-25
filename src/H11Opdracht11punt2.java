// Opdracht 11.2

import java.awt.*;
import java.applet.*;

public class H11Opdracht11punt2 extends Applet {

    public void init(){
        setSize(260,50);
    }

    public void paint(Graphics g){
        int teller;
        int x = 0;

        for(teller = 20; teller > 9; teller--){
            x += 20;
            g.drawString("" + teller, x,20 );
        }
    }

}
