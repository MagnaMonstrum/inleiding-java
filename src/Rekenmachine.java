import java.awt.*;
import java.applet.*;
import java.awt.event.*;


public class Rekenmachine extends Applet {

    TextField tekstvak;
    TextField tekstvak2;
    Button knopPlus;
    Button knopMin;
    Button knopDeel;
    Button knopKeer;
    Double getal;
    Double getal2;
    String a;
    String b;
    


    public void init() {
        setSize(500,200);
        tekstvak = new TextField(20);
        tekstvak2 = new TextField(20);
        knopPlus = new Button("+");
        knopMin = new Button("-");
        knopDeel = new Button("/");
        knopKeer = new Button("*");

        PlusListener pl = new PlusListener();
        knopPlus.addActionListener( pl );
        MinListener ml = new MinListener();
        knopMin.addActionListener( ml );
        DeelListener dl = new DeelListener();
        knopDeel.addActionListener( dl );
        KeerListener kl = new KeerListener();
        knopKeer.addActionListener( kl );


        add(tekstvak);
        add(tekstvak2);
        add(knopKeer);
        add(knopDeel);
        add(knopPlus);
        add(knopMin);

        a = "";
        b = "";



    }
    public void paint(Graphics g) {
        g.drawString("Antwoord: " + getal, 50,50);
    }

    class PlusListener implements ActionListener {
        public void actionPerformed(ActionEvent e){
            a = tekstvak.getText();
            b = tekstvak2.getText();
            getal = Double.parseDouble( a );
            getal2 = Double.parseDouble( b );
            getal+= getal2;
            repaint();

        }
    }
    class KeerListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            a = tekstvak.getText();
            b = tekstvak2.getText();
            getal = Double.parseDouble(a);
            getal2 = Double.parseDouble(b);
            getal *= getal2;
            repaint();
        }
    }
    class MinListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            a = tekstvak.getText();
            b = tekstvak2.getText();
            getal = Double.parseDouble(a);
            getal2 = Double.parseDouble(b);
            getal -= getal2;
            repaint();
        }
    }
    class DeelListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            a = tekstvak.getText();
            b = tekstvak2.getText();
            getal = Double.parseDouble(a);
            getal2 = Double.parseDouble(b);
            getal /= getal2;
            repaint();
        }
    }


}