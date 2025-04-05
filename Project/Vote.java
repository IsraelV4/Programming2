package Project;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Vote extends JFrame implements ActionListener{

    /*
2. Request what party a voter wish to vote for in presidential election
3. Request for the party in Senate, House and Governorship elections
     */

    JPanel panel = new JPanel();
    JButton button = new JButton("Confirm");
    String[] choices = { "---", "Republican: Jerry Irwin", "Democratic: Israel John", "Conservative: Angilina Amelia", "Green: Samantha Scones", "Independent: ChatGPT" };
    int cycle = 0;
    JLabel label = new JLabel("Select a Presidential Candidate and press Confirm to vote for them");
    JComboBox<String> cb = new JComboBox<String>(choices);
    String selected = "---";



    public Vote(String name) {
        super(name);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 500);
        setLocation(0, 0);

        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        label.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.add(label);
        
        cb.setMaximumSize(cb.getPreferredSize());
        cb.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.add(cb);

        button.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.add(button);
        add(panel);
        setVisible(true);
        button.addActionListener(this);
        cb.addActionListener(this);
    }

    public static void main(String[] args) {
        Vote frame = new Vote("Political Project part 2");
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==button && !selected.equals("---")) {
            if (cycle==0) {
                choices = new String[] { "---", "Republican: Jive Jay", "Democratic: Alethea Velazquez", "Conservative: Blue Bird", "Green: Bushra Ray", "Independent: Alexander the Great" };
                cb.removeAllItems();
                for (int i=0; i<choices.length; i++) {
                    cb.addItem(choices[i]);
                }
                cycle++;
                label.setText("Select a Senate Candidate and press Confirm to vote for them");
            }
        }
        else if (e.getSource()==cb && cb.getSelectedItem()!=null) {
            selected = (String)cb.getSelectedItem();
        }
        else {

        }
    }
}