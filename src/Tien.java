// Opdracht 10.1 en 10.2

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Tien extends Applet {

    TextField tekstvak;
    int hoogsteGetal;
    int getal;
    int laagsteGetal;
    Button knopOk;
    String s;


    public void init() {
        setSize(500, 200);
        tekstvak = new TextField(20);
        KnopListener kl = new KnopListener();
        knopOk = new Button("Ok");
        knopOk.addActionListener( kl );
        hoogsteGetal = Integer.MIN_VALUE;
        laagsteGetal = Integer.MAX_VALUE;

        add(tekstvak);
        add(knopOk);


    }

    public void paint(Graphics g) {

        g.drawString("" + hoogsteGetal, 50, 60);
        g.drawString("" + getal, 50, 80);
        g.drawString("" + laagsteGetal, 50, 100);


    }


    class KnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = tekstvak.getText();
            getal = Integer.parseInt(s);
            if (getal > hoogsteGetal) {
                hoogsteGetal = getal;
            }
            if (getal < laagsteGetal) {
                laagsteGetal = getal;

            } else {
                getal = Integer.parseInt(s);
            }
            repaint();
        }
    }

}
