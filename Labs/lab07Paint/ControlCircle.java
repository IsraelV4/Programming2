package Labs.lab07Paint;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

@SuppressWarnings("unused")
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
                g.drawLine(x+width/2+ax, (int)Math.sqrt(size*size-x*x)+height/2+ay, x+1+width/2+ax, (int)Math.sqrt(size*size-(x+1)*(x+1))+height/2+ay);
                g.drawLine(x+width/2+ax, -1*(int)Math.sqrt(size*size-x*x)+height/2+ay, x+1+width/2+ax, -1*(int)Math.sqrt(size*size-(x+1)*(x+1))+height/2+ay);
                g.drawLine(-x+width/2+ax, (int)Math.sqrt(size*size-x*x)+height/2+ay, -x+1+width/2+ax, (int)Math.sqrt(size*size-(x+1)*(x+1))+height/2+ay);
                g.drawLine(-x+width/2+ax, -1*(int)Math.sqrt(size*size-x*x)+height/2+ay, -x+1+width/2+ax, -1*(int)Math.sqrt(size*size-(x+1)*(x+1))+height/2+ay);
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
