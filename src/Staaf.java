import java.awt.*;
import java.applet.*;

public class Staaf extends Applet {
    Color opvulkleur;
    Color lijnkleur;
    int breedte;
    int hoogte;
    int cirkelbreedte;

    public void init() {
        //initialisatie.
        opvulkleur = Color.MAGENTA;
        lijnkleur = Color.BLACK;
        breedte = 200;
        hoogte = 100;
        cirkelbreedte = 100;
    }

    public void paint(Graphics g) {

        g.drawLine(100, 80, 300, 80);

        g.drawRect(100, 100, breedte, hoogte);

        g.drawRoundRect(100, 225, breedte, hoogte, 30, 30);

        g.setColor(opvulkleur);
        g.fillRect(315, 100, breedte, hoogte);


        g.setColor(lijnkleur);
        g.drawOval(315, 100, breedte, hoogte);


        g.setColor(opvulkleur);
        g.fillOval(315, 225, breedte, hoogte);

        g.setColor(lijnkleur);
        g.drawOval(530, 100, breedte, hoogte);

        g.setColor(opvulkleur);
        g.fillArc(530, 100, breedte, hoogte, 0, 45);

        g.setColor(lijnkleur);
        g.drawOval(580, 225, cirkelbreedte, hoogte);




    }
}
