// Opdracht 8.2

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Acht extends Applet {


    Button knopman;
    Button knopvrouw;
    Button knopPvrouw;
    Button knopPman;
    int getalman;
    int getalvrouw;
    int getalPman;
    int getalPvrouw;
    int getaltotaal;


    public void init() {
        setSize(1000,200);

        knopman = new Button("Mannelijke leerlingen");
        ListenerMan lm = new ListenerMan();
        knopman.addActionListener( lm );



        knopvrouw = new Button("Vrouwelijke leerlingen");
        ListenerVrouw lv = new ListenerVrouw();
        knopvrouw.addActionListener( lv );


        knopPman = new Button("Potentiële mannelijke leerlingen");
        ListenerPman pm = new ListenerPman();
        knopPman.addActionListener( pm );


        knopPvrouw = new Button("Potentiële vrouwelijke leerlingen");
        ListenerPvrouw pv = new ListenerPvrouw();
        knopPvrouw.addActionListener( pv );


        add(knopman);
        add(knopvrouw);
        add(knopPman);
        add(knopPvrouw);

    }

    public void paint(Graphics g) {

        g.drawString("Aantal mannen: " + getalman,50, 60);
        g.drawString("Aantal vrouwen: " + getalvrouw, 50, 80);
        g.drawString("Aantal potentiële mannen: " + getalPman,50, 100);
        g.drawString("Aantal potentiële vrouwen: " + getalPvrouw,50, 120);
        g.drawString("Totaal: " + getaltotaal,50, 140);


    }

    class ListenerMan implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            getaltotaal++;
            getalman++;
            repaint();
        }
    }

    class ListenerVrouw implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            getaltotaal++;
            getalvrouw++;
            repaint();

        }
    }

    class ListenerPman implements ActionListener {
        public void actionPerformed(ActionEvent e){
            getaltotaal++;
            getalPman++;
            repaint();
        }
    }

    class ListenerPvrouw implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            getaltotaal++;
            getalPvrouw++;
            repaint();
        }
    }










}