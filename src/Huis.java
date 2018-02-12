// Opdracht 4.2. 4.3

import java.awt.*;
import java.applet.*;

public class Huis extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.white);
        // Dak

        g.setColor(Color.RED);
        g.drawLine(50,150,100,100 );
        g.drawLine(100,100,150,150 );
        g.drawRect(50,150, 100, 100 );

        // Huis

        g.setColor(Color.blue);
        g.fillRect(100, 210,30, 40 );

        //Raam

        g.setColor(Color.DARK_GRAY);
        g.drawRect(60,175,20,20);

        //Vlag met vlaggenmast

        g.setColor(Color.black);
        g.drawLine(160,90,160, 250);
        g.setColor(Color.RED);
        g.fillRect(160,95,75,15 );
        g.setColor(Color.blue);
        g.fillRect(160,125, 75, 15);

    }
}