import java.awt.*;
import java.applet.*;

public class StaafdiagramVariabelen extends Applet {

    int Valerie;
    int Jeroen;
    int Hans;
    int yAs;

    public void init() {

        Valerie = 40;
        Jeroen = 100;
        Hans = 80;
        yAs = 200;



    }

    public void paint(Graphics g) {


        g.drawLine(50,50,50,200);
        g.drawLine(50,yAs,200,yAs);

        g.setColor(Color.green);
        g.fillRect(70,yAs - Valerie,20,Valerie);
        g.drawString("Valerie", 50,220);



        g.setColor(Color.RED);
        g.fillRect(110,yAs - Jeroen,20,Jeroen);
        g.drawString("Jeroen", 50,250);



        g.setColor(Color.orange);
        g.fillRect(150,yAs - Hans,20,Hans);
        g.drawString("Hans", 50,280);





    }

}
