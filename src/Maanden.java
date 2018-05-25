import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Maanden extends Applet {
    TextField tekstvak, jaarvak;
    Label label;
    String s, jaar, tekst;
    int maand;
    int jaartal;

    public void init() {
        setSize(400, 300);
        tekstvak = new TextField("", 20);
        jaarvak = new TextField("", 20);
        label = new Label("Type het maandnummer in en druk op enter");
        tekstvak.addActionListener(new TekstvakListener());
        jaarvak.addActionListener(new TekstvakListener());
        tekst = "";
        add(label);
        add(tekstvak);
        add(jaarvak);
    }

    public void paint(Graphics g) {
        g.drawString(tekst, 50, 90);
    }

    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            jaar = jaarvak.getText();
            s = tekstvak.getText();
            jaartal = Integer.parseInt(jaar);
            maand = Integer.parseInt(s);
            switch (maand) {

                case 1:
                    tekst = "januari, 30 dagen.";
                    break;
                case 2:

                    if ((jaartal % 4 == 0 && !(jaartal % 100 == 0)) || (jaartal % 400 == 0)) {

                        tekst = "februari, 29 dagen.";

                    } else {
                        tekst = "februari, 28 dagen.";

                    }
                    break;
                case 3:
                    tekst = "maart, 31 dagen.";
                    break;
                case 4:
                    tekst = "april, 30 dagen.";
                    break;
                case 5:
                    tekst = "mei, 31 dagen.";
                    break;
                case 6:
                    tekst = "juni, 30 dagen.";
                    break;
                case 7:
                    tekst = "juli, 31 dagen.";
                    break;
                case 8:
                    tekst = "augustus, 31 dagen.";
                    break;
                case 9:
                    tekst = "september, 30 dagen.";
                    break;
                case 10:
                    tekst = "oktober, 31 dagen.";
                    break;
                case 11:
                    tekst = "november, 30 dagen.";
                    break;
                case 12:
                    tekst = "december, 31 dagen.";
                    break;

            }
            repaint();

        }
    }
}

