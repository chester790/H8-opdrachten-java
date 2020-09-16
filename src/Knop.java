import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Knop extends Applet {
    TextField woordvak;
    Button druk;
    TextField tekstvak;
    Button knop;
    String schermtekst;


    public void init() {
        tekstvak = new TextField("Type hier iets",20);
        add(tekstvak);
        knop = new Button("Klik op mij");
        knop.setLabel( "enter" );
        KnopListener kl = new KnopListener();
        knop.addActionListener( kl );
        add(knop);
        schermtekst = "Vul iets in";

        woordvak = new TextField("Reset",20);
        druk = new Button("Reset");
        druk.setLabel("Reset");
        ResetListener np = new ResetListener();
        druk.addActionListener( np );
        add(druk);
    }

    public void paint(Graphics g) {
        g.drawString(schermtekst, 20, 100 );
        setBackground(Color.lightGray);
    }

    class KnopListener implements ActionListener {
        public void actionPerformed( ActionEvent e ){
            schermtekst = tekstvak.getText();
            repaint();
        }
    }
    class ResetListener implements ActionListener {
        public void actionPerformed( ActionEvent e ){
            tekstvak.setText("Vul weer wat in");
            schermtekst = "";
            repaint();
        }
    }
}