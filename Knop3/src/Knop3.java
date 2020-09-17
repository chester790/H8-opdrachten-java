import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Knop3 extends Applet {
    Label label;
    Button knop;
    String stringgeld;
    TextField input;
    double bedrag;
    String display;


    public void init() {
        input = new TextField("Type hier", 40);
        label = new Label("Schrijf uw getal in het vak en druk op Enter");
        knop = new Button();
        knop.setLabel("Ok");
        knop.addActionListener(new KnopListener());
        input.addActionListener(new KnopListener());
        add(input);
        add(label);
        add(knop);

    }

    public void paint(Graphics g) {
        setBackground(Color.gray);
        g.drawString(display, 20, 100 );

    }
    class KnopListener implements ActionListener {
        public void actionPerformed( ActionEvent e ){
            stringgeld = input.getText();
            bedrag = Double.parseDouble(stringgeld);
            double btwper = bedrag / 100 * 21;
            bedrag = bedrag + btwper;
            display = "" + bedrag;
            repaint();
        }
    }
}