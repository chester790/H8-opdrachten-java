import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Knop2 extends Applet {

    int mancount;
    int vrouwcount;
    int vleerlingcount;
    int mleerlingcount;
    Button man;
    Button vrouw;
    Button vleerling;
    Button mleerling;

    public void init() {

        ManEvent mc = new ManEvent();
        man = new Button("Man");
        man.addActionListener(mc);

        VrouwEvent vc = new VrouwEvent();
        vrouw = new Button("Vrouw");
        vrouw.addActionListener(vc);

        MLeerlingEvent mlc = new MLeerlingEvent();
        mleerling = new Button("Mannelijke leerling");
        mleerling.addActionListener(mlc);

        VLeerlingEvent vlc = new VLeerlingEvent();
        vleerling = new Button("Vrouwelijke Leerling");
        vleerling.addActionListener(vlc);

        add(man);
        add(vrouw);
        add(vleerling);
        add(mleerling);

    }

    public void paint(Graphics g) {

        g.drawString("Mannen: " + mancount,10,40);
        g.drawString("Vrouwen: " + vrouwcount,10,60);
        g.drawString("Vrouwelijke leerlingen: " + vleerlingcount,10,80);
        g.drawString("Mannelijke leerlingen: " + mleerlingcount,10,100);
    }

    class ManEvent implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            ++mancount;
            repaint();
        }
    }
    class VrouwEvent implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            ++vrouwcount;
            repaint();
        }
    }
    class MLeerlingEvent implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            ++mleerlingcount;
            repaint();
        }
    }
    class VLeerlingEvent implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            ++vleerlingcount;
            repaint();
        }
    }
}