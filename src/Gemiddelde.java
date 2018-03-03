
import java.awt.*;
import java.applet.*;


public class Gemiddelde extends Applet {

    double cijfer1;
    double cijfer2;
    double cijfer3;
    double gemiddelde;
    int a;




    public void init() {

        cijfer1 = 5.9;
        cijfer2 = 6.3;
        cijfer3 = 6.9;
        gemiddelde = (cijfer1 + cijfer2 + cijfer3) / 3;
        gemiddelde*=10;
        a = (int) gemiddelde;
        gemiddelde = a;
        gemiddelde/=10;

    }

    public void paint(Graphics g) {
        g.drawString("Het gemiddelde is: " + gemiddelde,50,50);






    }
}
