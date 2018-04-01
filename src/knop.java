// Opdracht 8.1

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class knop extends Applet {

    Button resetknop;
    Button okknop;
    TextField tekstvak;
    Label label;
    String s;

    public void init() {
        resetknop = new Button();
        okknop = new Button();
        resetknop.setLabel("Reset");
        okknop.setLabel("OK");
        KnopListener kl = new KnopListener();
        resetknop.addActionListener( kl );
        Knop2Listener ab = new Knop2Listener();
        okknop.addActionListener( ab );
        tekstvak = new TextField("Klik op mij",20);
        tekstvak.addActionListener( ab );
        label = new Label("Type iets in het tekstvakje " + "en druk op enter");

        add(label);
        add(tekstvak);
        add(resetknop);
        add(okknop);
        s = "";

    }

    public void paint(Graphics g) {
        g.drawString(s,50,80);

    }




    class Knop2Listener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = tekstvak.getText();
            repaint();


        }
    }



    class KnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            tekstvak.setText("");
            repaint();


        }
    }

}
