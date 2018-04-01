// Opdracht 8.3

import java.awt.*;
import java.applet.*;
import java.awt.event.*;


public class Achtpuntdrie extends Applet {

    TextField tekstvak;
    Label label;
    Button knopOk;
    Double getal;
    String s;

    public void init() {
        setSize(500,500);
        tekstvak = new TextField( s ,20);
        label = new Label("Typ een bedrag in");
        knopOk = new Button("Ok");
        KnopListener kl = new KnopListener();
        knopOk.addActionListener( kl );

        add(label);
        add(tekstvak);
        add(knopOk);
        s = "";
    }

    public void paint(Graphics g){
        g.drawString("bedrag inclusief btw: " + getal, 50,70);
    }
    class KnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = tekstvak.getText();
            getal = Double.parseDouble( s );
            getal*=1.21;
            repaint();
        }
    }
}
