import java.awt.*;
import java.applet.*;


public class Ints extends Applet {
    int negatieveWaarde;

    public void init() {
        negatieveWaarde = 2;
    }

    public void paint(Graphics g) {
        negatieveWaarde-=10;
        g.drawString("Dit is een negatieve waarde: " + (negatieveWaarde + negatieveWaarde), 50, 60);
    }
}