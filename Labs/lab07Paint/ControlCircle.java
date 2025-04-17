package Labs.lab07Paint;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ControlCircle extends JFrame implements ActionListener {

    int size = 100;
    int height = 500;
    int width = 500;
    int ay = -20;
    int ax = -7;
    //x^2 + y^2 = size^2
    // y = +-sqrt(size^2-x^2)
    JButton in = new JButton("Increase");
    JButton ou = new JButton("Decrease");

    JPanel paintPanel = new JPanel() {
        @Override
        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            for (int x=0; x<size; x++) {
                int x1 = x+width/2+ax;
                int help = (int)Math.sqrt(size*size-x*x);
                int y1 = height/2+ay;
                int help2 = (int)Math.sqrt(size*size-(x+1)*(x+1));

                g.drawLine(x1, y1 +help, x1+1, help2+y1);
                g.drawLine(x1, y1-help, x1+1, y1-help2);
                g.drawLine(x1 -2*x, help+y1, x1-2*x+1, help2+y1);
                g.drawLine(x1 -2*x, y1-help, x1-2*x+1, y1-help2);
            }
        }
    };

    public ControlCircle(String name) {
        super(name);
        setTitle("Paint");
        setSize(width, height);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        paintPanel.add(in);
        paintPanel.add(ou);
        ou.addActionListener(this);
        in.addActionListener(this);
        add(paintPanel);
    }

    public static void main(String[] args) {
        ControlCircle f = new ControlCircle("Circle");
        f.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==in) {
            size+=5;
        }
        else {
            size-=5;
        }
        paintPanel.repaint();
    }  

    
       
}
