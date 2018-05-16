import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class PraktijkOpdrachtH10 extends Applet {

    TextField tekstvak;
    Button knopOK;
    int Cijfer;
    String beoordeling;


    public void init(){
        setSize(400,300);
        tekstvak = new TextField(20);
        knopOK = new Button("OK");
        KnopListener kl = new KnopListener();
        knopOK.addActionListener( kl );
        add(tekstvak);
        add(knopOK);

    }
    public void paint(Graphics g){
    g.drawString("" + beoordeling, 50,50);
    }
    class KnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e){
            beoordeling = tekstvak.getText();
            Cijfer = Integer.parseInt( beoordeling );
            switch(Cijfer) {
                case 1:
                    beoordeling = "slecht";
                    break;
                case 2:
                    beoordeling = "slecht";
                    break;
                case 3:
                    beoordeling = "slecht";
                    break;
                case 4:
                    beoordeling = "onvoldoende";
                    break;
                case 5:
                    beoordeling = "matig";
                    break;
                case 6:
                    beoordeling = "voldoende";
                    break;
                case 7:
                    beoordeling = "voldoende";
                    break;
                case 8:
                    beoordeling = "goed";
                break;
                case 9:
                    beoordeling = "goed";
                    break;
                case 10:
                    beoordeling = "goed";
                    break;
                default:
                    beoordeling = "U hebt een verkeerd nummer ingetikt ..!";
                    break;
            }
            repaint();
        }
    }
}
