// 9.2 Write a GUI program in Java with three Labels – Enter the First
// Number, Enter the Second Number, Result, and three text fields for - first number,
// second number and result and four buttons - Add, Sub, multiply and reset as shown
// below. On clicking of any of these buttons, the corresponding operation should be
// performed with input1 and input2 and the result should be displayed in the result box.

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Calculator extends JFrame implements ActionListener {
    JButton addBtn, subBtn, mulBtn, divBtn, resetBtn;
    JTextField num1Field, num2Field, resultField;

    public Calculator() {
        setTitle("My Calc");
        setLayout(new BorderLayout());
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        JLabel num1Lbl = new JLabel("Enter 1st number: ");
        this.num1Field = new JTextField();
        JLabel num2Lbl = new JLabel("Enter 2nd number: ");
        this.num2Field = new JTextField();
        JLabel resultLbl = new JLabel("Result: ");
        this.resultField = new JTextField();
        this.addBtn = new JButton("ADD");
        this.subBtn = new JButton("SUB");
        this.mulBtn = new JButton("MUL");
        this.divBtn = new JButton("DIV");
        this.resetBtn = new JButton("Reset");
        addBtn.addActionListener(this);
        subBtn.addActionListener(this);
        mulBtn.addActionListener(this);
        divBtn.addActionListener(this);
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(7, 5, 10, 10));
        panel.add(num1Lbl);
        panel.add(num1Field);
        panel.add(num2Lbl);
        panel.add(num2Field);
        panel.add(resultLbl);
        panel.add(resultField);
        panel.add(addBtn);
        panel.add(subBtn);
        panel.add(mulBtn);
        panel.add(divBtn);
        panel.add(resetBtn);
        add(panel, BorderLayout.CENTER);
        setVisible(true);
    }

    private void doOps(char op) {
        double num1 = Double.parseDouble(num1Field.getText());
        double num2 = Double.parseDouble(num2Field.getText());
        double result = 0;
        switch (op) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            case 'r':
                this.num1Field.setText("");
                this.num2Field.setText("");
                this.resultField.setText("");
                return;
            default:
                return;
        }
        resultField.setText(String.valueOf(result));
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == addBtn) {
            doOps('+');
        } else if (e.getSource() == subBtn) {
            doOps('-');
        } else if (e.getSource() == mulBtn) {
            doOps('*');
        } else if (e.getSource() == divBtn) {
            doOps('/');
        } else {
            doOps('r');
        }
    }

    public static void main(String[] args) {
        new Calculator();
    }
}