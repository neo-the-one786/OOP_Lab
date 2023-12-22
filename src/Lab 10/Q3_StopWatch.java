// 10.3 Design a Stop Watch using event handling and multi-threading
// in Java.

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class StopWatch extends JFrame implements ActionListener {
    public StopWatch() {
        setTitle("StopWatch");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400, 300);
        setLayout(new GridLayout(7, 2, 15, 15));
        JLabel timeLbl = new JLabel("00:00:00", JLabel.CENTER);
        timeLbl.setFont(new Font("Verdana", Font.PLAIN, 20));
        add(timeLbl);
        JPanel panel = new JPanel();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    public static void main(String[] args) {
        new StopWatch();
    }
}
