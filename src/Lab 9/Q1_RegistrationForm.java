// 9.1 Design a registration form using Swing with following components
// on it – Label, Textbox, Text area, Checkbox, Radio button and Button, Image.

import javax.swing.*;
import java.awt.*;

class RegistrationForm extends JFrame {
    public RegistrationForm() {
        setLayout(new BorderLayout());
        setTitle("Registration Form");
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        JLabel nameLbl = new JLabel("Name: ");
        JTextField nameField = new JTextField();
        JLabel addrlbl = new JLabel("Address: ");
        JTextArea addrArea = new JTextArea();
        JLabel genderLbl = new JLabel("Gender");
        JRadioButton maleBtn = new JRadioButton("Male");
        JRadioButton femBtn = new JRadioButton("Female");
        JRadioButton othBtn = new JRadioButton("Others");
        ButtonGroup BtnGrp = new ButtonGroup();
        BtnGrp.add(maleBtn);
        BtnGrp.add(femBtn);
        BtnGrp.add(othBtn);
        JLabel imgLabel = new JLabel("Image");
        ImageIcon imgIco = new ImageIcon();
        imgLabel.setIcon(imgIco);
        JButton register = new JButton("Register");
        JLabel termsLbl = new JLabel("Accept Terms");
        JCheckBox termsNCond = new JCheckBox("I accept the terms and conditions");
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(7, 2, 10, 10));
        panel.add(nameLbl);
        panel.add(nameField);
        panel.add(addrlbl);
        panel.add(addrArea);
        panel.add(genderLbl);
        panel.add(maleBtn);
        panel.add(femBtn);
        panel.add(termsLbl);
        panel.add(termsNCond);
        panel.add(register);
        add(panel, BorderLayout.CENTER);
        setVisible(true);
    }

    public static void main(String[] args) {
        new RegistrationForm();
    }
}