//Opdracht 11.5

import java.awt.*;
import java.applet.*;

public class H11Opdracht11punt5 extends Applet{
    public void init(){
    setSize(200,150);
    }
    public void paint(Graphics g){
        int teller;
        int x = 0;
        int y = 0;

        for(teller = 0; teller < 5; teller++) {
            x += 20;
            y += 20;
            g.drawRect(x, y, 20, 20);
        }
    }
}
