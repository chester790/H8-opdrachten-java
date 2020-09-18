import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class H8praktijkopdracht extends Applet {
    Button plus;
    Button min;
    Button delen;
    Button keer;
    TextField tekstvak1;
    TextField tekstvak2;
    double getal1;
    double getal2;
    String input1;
    String input2;

    public void init() {
        tekstvak1 = new TextField();
        add(tekstvak1);

        tekstvak2 = new TextField();
        add(tekstvak2);


        plus = new Button( "+");
        plusListener pl = new plusListener();
        plus.addActionListener( pl );
        resetListener rl = new resetListener();
        plus.addActionListener( rl );
        add(plus);

        min = new Button("-");
        minListener ml = new minListener();
        min.addActionListener( ml );
        min.addActionListener( rl );
        add(min);

        delen = new Button("/");
        delenListener dl = new delenListener();
        delen.addActionListener( dl );
        delen.addActionListener( rl );
        add(delen);

        keer = new Button("x");
        keerListener kl = new keerListener();
        keer.addActionListener( kl );
        keer.addActionListener( rl );
        add(keer);
    }

    public void paint(Graphics g) {
        setBackground(Color.blue);

        tekstvak2.setSize(70,20);
        tekstvak2.setLocation(170,38);

        tekstvak1.setSize(70,20);
        tekstvak1.setLocation(90, 38);

        plus.setLocation(120, 60);


        min.setLocation(140,60);

        delen.setLocation(170,60);

        keer.setLocation(185,60);
    }

    class resetListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            tekstvak2.setText(" ");
            repaint();
        }
    }
    class plusListener implements ActionListener {
        public void actionPerformed( ActionEvent e ) {
            input1 = tekstvak1.getText();
            input2 = tekstvak2.getText();
            getal1 = Double.parseDouble(input1);
            getal2 = Double.parseDouble(input2);
            getal1 = getal1 + getal2;
            tekstvak1.setText("" + getal1);
        }
    }
    class minListener implements ActionListener {
        public void actionPerformed( ActionEvent e){
            input1 = tekstvak1.getText();
            input2 = tekstvak2.getText();
            getal1 = Double.parseDouble(input1);
            getal2 = Double.parseDouble(input2);
            getal1 = getal1 - getal2;
            tekstvak1.setText("" + getal1);
        }
    }
    class delenListener implements ActionListener {
        public void actionPerformed( ActionEvent e){
            input1 = tekstvak1.getText();
            input2 = tekstvak2.getText();
            getal1 = Double.parseDouble(input1);
            getal2 = Double.parseDouble(input2);
            getal1 = getal1 / getal2;
            tekstvak1.setText("" + getal1);
        }
    }
    class keerListener implements ActionListener {
        public void actionPerformed( ActionEvent e){
            input1 = tekstvak1.getText();
            input2 = tekstvak2.getText();
            getal1 = Double.parseDouble(input1);
            getal2 = Double.parseDouble(input2);
            getal1 = getal1 * getal2;
            tekstvak1.setText("" + getal1);
        }
    }


}
