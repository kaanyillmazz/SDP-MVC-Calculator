package View;

import Controller.CalculatorButtonListener;
import Controller.ScientificCalculatorController;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class BasicCalculator extends JFrame implements Calculator {
    //simple singleton implementation
    private static BasicCalculator basicCalculator = null;

    private Container container;
    private JButton b1;
    private JButton b2;
    private JButton b3;
    private JButton b4;
    private JButton b5;
    private JButton b6;
    private JButton b7;
    private JButton b8;
    private JButton b9;
    private JButton zero;
    private JButton clr;
    private JButton pow2;
    private JButton plus;
    private JButton min;
    private JButton div;
    private JButton mul;
    private JButton eq;
    private JButton chSign;
    private JButton dot;
    private JButton sqrt;
    private JTextField inputField;
    private JPanel inputPanel;
    private JPanel buttonPanel;
    private JLabel info;

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
        CalculatorButtonListener calculatorButtonListener = new CalculatorButtonListener(scientificCalculatorController);


        sqrt = new JButton("Sqrt");
        buttonPanel.add(sqrt);
        sqrt.addActionListener(calculatorButtonListener);

        pow2 = new JButton("x^2");
        buttonPanel.add(pow2);
        pow2.addActionListener(calculatorButtonListener);

        clr = new JButton("AC");
        buttonPanel.add(clr);
        clr.addActionListener(calculatorButtonListener);

        div = new JButton("/");
        buttonPanel.add(div);
        div.addActionListener(calculatorButtonListener);

        b7 = new JButton("7");
        buttonPanel.add(b7);
        b7.addActionListener(calculatorButtonListener);

        b8 = new JButton("8");
        buttonPanel.add(b8);
        b8.addActionListener(calculatorButtonListener);

        b9 = new JButton("9");
        buttonPanel.add(b9);
        b9.addActionListener(calculatorButtonListener);

        mul = new JButton("*");
        buttonPanel.add(mul);
        mul.addActionListener(calculatorButtonListener);

        b4 = new JButton("4");
        buttonPanel.add(b4);
        b4.addActionListener(calculatorButtonListener);

        b5 = new JButton("5");
        buttonPanel.add(b5);
        b5.addActionListener(calculatorButtonListener);

        b6 = new JButton("6");
        buttonPanel.add(b6);
        b6.addActionListener(calculatorButtonListener);

        min = new JButton("-");
        buttonPanel.add(min);
        min.addActionListener(calculatorButtonListener);

        b1 = new JButton("1");
        buttonPanel.add(b1);
        b1.addActionListener(calculatorButtonListener);

        b2 = new JButton("2");
        buttonPanel.add(b2);
        b2.addActionListener(calculatorButtonListener);

        b3 = new JButton("3");
        buttonPanel.add(b3);
        b3.addActionListener(calculatorButtonListener);

        plus = new JButton("+");
        buttonPanel.add(plus);
        plus.addActionListener(calculatorButtonListener);

        chSign = new JButton("+/-");
        buttonPanel.add(chSign);
        chSign.addActionListener(calculatorButtonListener);

        zero = new JButton("0");
        buttonPanel.add(zero);
        zero.addActionListener(calculatorButtonListener);

        dot = new JButton(".");
        buttonPanel.add(dot);
        dot.addActionListener(calculatorButtonListener);

        eq = new JButton("=");
        buttonPanel.add(eq);
        eq.addActionListener(calculatorButtonListener);


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
