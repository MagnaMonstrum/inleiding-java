import java.awt.*;
import java.applet.*;

public class Tekenen extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {

        g.drawLine(20,20,200,20);
        g.drawString("Lijn",100,40 );

        g.drawRect(20,60,180,100);
        g.drawString("Rechthoek",80,180);

        g.drawRoundRect(20,200,180,100,30,30);
        g.drawString("Afgeronde rechthoek", 60,320 );


        g.setColor(Color.magenta);
        g.fillRect(220, 60, 180,100);
        g.setColor(Color.black);
        g.drawString("Gevulde rechthoek met ovaal",230,180);

        g.setColor(Color.black);
        g.drawOval(220, 60, 180,100);

        g.setColor(Color.magenta);
        g.fillOval(220, 200,180,100);
        g.setColor(Color.black);
        g.drawString("Gevulde ovaal",270,320 );

        g.drawOval(420, 60,180,100);
        g.drawString("Taartpunt met ovaal er omheen",430,180);

        g.setColor(Color.magenta);
        g.fillArc(420,60,180,100,0,45);

        g.setColor(Color.black);
        g.drawOval(460,200, 100,100);
        g.drawString("Cirkel", 495,320);



    }
}