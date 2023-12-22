// 9.3 Implement a GUI application which consists of one List Box and
// one button. The list box will have four different color names. When the user will
// select a color from the list box and click on the button, the panel color will be
// changed to that color.

import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

class ChangeBGColour extends JFrame implements ActionListener, ListSelectionListener {
    JButton clickBtn;
    JList<String> colourList;
    JPanel panel;
    String[] colours = {"Red", "Green", "Blue", "Yellow"};
    Color[] colourVal = {Color.RED, Color.GREEN, Color.BLUE, Color.YELLOW};
    Color selectColour;

    public ChangeBGColour() {
        setLayout(new BorderLayout());
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400, 300);
        this.panel = new JPanel();
        panel.setBackground(Color.WHITE);
        this.colourList = new JList<>(colours);
        colourList.addListSelectionListener(this);
        add(colourList, BorderLayout.CENTER);
        panel.add(colourList);
        this.clickBtn = new JButton("Click");
        clickBtn.addActionListener(this);
        panel.add(clickBtn, BorderLayout.SOUTH);
        add(panel, BorderLayout.CENTER);
        setVisible(true);
    }

    @Override
    public void valueChanged(ListSelectionEvent e) {
        if (!e.getValueIsAdjusting()) {
            this.selectColour = colourVal[colourList.getSelectedIndex()];
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == clickBtn) {
            panel.setBackground(selectColour);
        }
    }

    public static void main(String[] args) {
        new ChangeBGColour();
    }
}