package View;

import Controller.ButtonListener;
import Controller.ScientificCalculatorController;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class BasicCalculator extends JFrame implements Calculator {
    //simple singleton implementation
    private static BasicCalculator basicCalculator = null;

    Container container;
    JButton b1;
    JButton b2;
    JButton b3;
    JButton b4;
    JButton b5;
    JButton b6;
    JButton b7;
    JButton b8;
    JButton b9;
    JButton zero;
    JButton clr;
    JButton pow2;
    JButton plus;
    JButton min;
    JButton div;
    JButton mul;
    JButton eq;
    JButton chSign;
    JButton dot;
    JButton sqrt;
    JTextField inputField;
    JPanel inputPanel;
    JPanel buttonPanel;
    JLabel info;

    private BasicCalculator() {
        info = new JLabel();
        container = getContentPane();
        container.setLayout(new BorderLayout());
        inputPanel = new JPanel();
        buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(0, 4, 2, 2));

        inputField = new JTextField(20);
        inputField.setEditable(false);
        inputField.setHorizontalAlignment(SwingConstants.RIGHT);
        inputField.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent keyevent) {
                char c = keyevent.getKeyChar();
                if (c >= '0' && c <= '9') {
                } else {
                    keyevent.consume();
                }
            }
        });

        inputPanel.add(inputField);

        ScientificCalculatorController scientificCalculatorController = new ScientificCalculatorController(this, inputField, info);
        ButtonListener buttonListener = new ButtonListener(scientificCalculatorController);


        sqrt = new JButton("Sqrt");
        buttonPanel.add(sqrt);
        sqrt.addActionListener(buttonListener);

        pow2 = new JButton("x^2");
        buttonPanel.add(pow2);
        pow2.addActionListener(buttonListener);

        clr = new JButton("AC");
        buttonPanel.add(clr);
        clr.addActionListener(buttonListener);

        div = new JButton("/");
        buttonPanel.add(div);
        div.addActionListener(buttonListener);

        b7 = new JButton("7");
        buttonPanel.add(b7);
        b7.addActionListener(buttonListener);

        b8 = new JButton("8");
        buttonPanel.add(b8);
        b8.addActionListener(buttonListener);

        b9 = new JButton("9");
        buttonPanel.add(b9);
        b9.addActionListener(buttonListener);

        mul = new JButton("*");
        buttonPanel.add(mul);
        mul.addActionListener(buttonListener);

        b4 = new JButton("4");
        buttonPanel.add(b4);
        b4.addActionListener(buttonListener);

        b5 = new JButton("5");
        buttonPanel.add(b5);
        b5.addActionListener(buttonListener);

        b6 = new JButton("6");
        buttonPanel.add(b6);
        b6.addActionListener(buttonListener);

        min = new JButton("-");
        buttonPanel.add(min);
        min.addActionListener(buttonListener);

        b1 = new JButton("1");
        buttonPanel.add(b1);
        b1.addActionListener(buttonListener);

        b2 = new JButton("2");
        buttonPanel.add(b2);
        b2.addActionListener(buttonListener);

        b3 = new JButton("3");
        buttonPanel.add(b3);
        b3.addActionListener(buttonListener);

        plus = new JButton("+");
        buttonPanel.add(plus);
        plus.addActionListener(buttonListener);

        chSign = new JButton("+/-");
        buttonPanel.add(chSign);
        chSign.addActionListener(buttonListener);

        zero = new JButton("0");
        buttonPanel.add(zero);
        zero.addActionListener(buttonListener);

        dot = new JButton(".");
        buttonPanel.add(dot);
        dot.addActionListener(buttonListener);

        eq = new JButton("=");
        buttonPanel.add(eq);
        eq.addActionListener(buttonListener);


        container.add("Center", buttonPanel);
        container.add("North", inputPanel);
    }


    //simple singleton implementation
    public static BasicCalculator getInstance() {
        if (basicCalculator == null)
            basicCalculator = new BasicCalculator();

        return basicCalculator;

    }
}
