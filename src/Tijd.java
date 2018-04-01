import java.awt.*;
import java.applet.*;


public class Tijd extends Applet {
    int Uur, Dag, Jaar;

    public void init(){

        Uur = 60 * 60;

        Dag = Uur * 24;

        Jaar = Dag * 365;
    }

        public void paint(Graphics g){

            g.drawString("Aantal seconden in een uur is: " + Uur, 50,50 );

            g.drawString("Aantal seconden in een dag is: " + Dag, 50,70 );

            g.drawString("Aantal seconden in een jaar is: " + Jaar, 50,90 );

    }


}