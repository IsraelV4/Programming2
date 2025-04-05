package Labs.lab07Paint;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class Paint extends JFrame implements ActionListener{

    ArrayList<Point> points = new ArrayList<>();
    ArrayList<int[]> col = new ArrayList<>();
    
    JButton red = new JButton("Red");
    JButton green = new JButton("green");
    JButton blue = new JButton("blue");
    JButton white = new JButton("erase");
    JButton clear = new JButton("clear");
    Color[] c = new Color[] {Color.RED, Color.GREEN, Color.BLUE, Color.WHITE};

    JPanel paintPanel = new JPanel() {
        @Override
        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            int cur = 0;
            for (int i = 1; i < points.size(); i++) {
                Point p1 = points.get(i - 1);
                Point p2 = points.get(i);
                if (cur<col.size() && i==col.get(cur)[0]) {
                    g.setColor(c[col.get(cur)[1]]);
                    cur++;
                }
                if (p1.x!=-999 && p1.y!=-999 && p2.x!=-999 && p2.y!=-999) {
                    g.drawLine(p1.x, p1.y, p2.x, p2.y);
                }
            }
        }
    };

    public Paint() {
        setTitle("Paint");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        col.add(new int[] {1, 0});

        paintPanel.setBackground(Color.WHITE);
        paintPanel.addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseDragged(MouseEvent e) {
                points.add(e.getPoint());
                paintPanel.repaint();
            }

            @Override
            public void mouseMoved(MouseEvent e) {
                points.add(new Point(-999, -999));
            }
        });

        
        paintPanel.add(red); red.addActionListener(this);
        paintPanel.add(green); green.addActionListener(this);
        paintPanel.add(blue); blue.addActionListener(this);
        paintPanel.add(white); white.addActionListener(this);
        paintPanel.add(clear); clear.addActionListener(this);
        add(paintPanel);
        setVisible(true);
    }


    public static void main(String[] args) {
        new Paint();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() instanceof JButton) {
            if (e.getSource()==red) {
                col.add(new int[] {points.size()+1, 0});
            }
            else if (e.getSource()==green) {
                col.add(new int[] {points.size()+1, 1});
            }
            else if (e.getSource()==blue) {
                col.add(new int[] {points.size()+1, 2});
            }
            else if (e.getSource()==white) {
                col.add(new int[] {points.size()+1, 3});
            }
            else { // clear
                col.removeAll(col);
                points.removeAll(points);
                paintPanel.repaint();
            }
        }
    }
}
