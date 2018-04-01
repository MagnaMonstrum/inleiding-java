import java.awt.*;
import java.applet.*;


public class Karwei extends Applet {
    double totaalBedrag;
    double uitbetalingPerPersoon;

    public void init(){
        totaalBedrag = 113;
        uitbetalingPerPersoon = totaalBedrag / 4;
    }

    public void paint(Graphics g){

        g.drawString("Jan krijgt: " + uitbetalingPerPersoon,50,70);

        g.drawString("Ali krijgt: " + uitbetalingPerPersoon,50,90);

        g.drawString("Jeanette krijgt: " + uitbetalingPerPersoon,50,110);

        g.drawString("Ik krijg: " + uitbetalingPerPersoon,50,130);
    }

}
