// Opdracht 10.5

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Cijfer extends Applet {
    TextField tekstvak;
    Button knopOK;
    int Cijfer;
    int totaal;
    int aantal;
    double gemiddeldCijfer;
    String gemiddelde, beoordeling, uitslag;


    public void init() {
        setSize(400, 300);
        tekstvak = new TextField(20);
        knopOK = new Button("OK");
        KnopListener kl = new KnopListener();
        knopOK.addActionListener( kl );
        add(tekstvak);
        add(knopOK);

    }

    public void paint(Graphics g) {
        g.drawString("" + beoordeling, 50, 50);
        g.drawString("gemiddelde: " + gemiddeldCijfer,50, 70);
        g.drawString("" + uitslag, 50, 90);
    }

    class KnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            int invoer = Integer.parseInt(tekstvak.getText());
            totaal += invoer;
            aantal++;
            gemiddeldCijfer = (double) totaal / aantal;
            beoordeling = tekstvak.getText();
            Cijfer = Integer.parseInt(beoordeling);
            if (Cijfer < 5.5) {
                beoordeling = "onvoldoende";
            } else {
                beoordeling = "voldoende";
            }
            if (gemiddeldCijfer < 5.5) {
                uitslag = "Je bent gezakt";
            } else {
                uitslag = "Je bent geslaagd";
            }
            repaint();

        }
    }

}

