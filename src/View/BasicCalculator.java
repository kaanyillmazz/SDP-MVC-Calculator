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

        Font buttonFont = new Font(Font.DIALOG,Font.BOLD,12);
        Font textFont = new Font(Font.DIALOG,Font.BOLD,12);
        Color panelColor = new Color(17, 38, 52);
        Color buttonColor = new Color(54, 24, 24);
        Color buttonTextColor = new Color(222, 205, 205);

        info.setForeground(Color.white);
        info.setFont(textFont);
        inputField.setForeground(Color.white);
        inputField.setBackground(new Color(133, 101, 101));

        buttonPanel.setBackground(panelColor);
        inputPanel.setBackground(panelColor);

        sqrt = new JButton("Sqrt");
        sqrt.setBackground(buttonColor);
        sqrt.setForeground(buttonTextColor);
        sqrt.setFont(buttonFont);
        buttonPanel.add(sqrt);
        sqrt.addActionListener(calculatorButtonListener);

        pow2 = new JButton("x^2");
        pow2.setBackground(buttonColor);
        pow2.setForeground(buttonTextColor);
        pow2.setFont(buttonFont);
        buttonPanel.add(pow2);
        pow2.addActionListener(calculatorButtonListener);

        clr = new JButton("AC");
        clr.setBackground(buttonColor);
        clr.setForeground(buttonTextColor);
        clr.setFont(buttonFont);
        buttonPanel.add(clr);
        clr.addActionListener(calculatorButtonListener);

        div = new JButton("/");
        div.setBackground(buttonColor);
        div.setForeground(buttonTextColor);
        div.setFont(buttonFont);
        buttonPanel.add(div);
        div.addActionListener(calculatorButtonListener);

        b7 = new JButton("7");
        b7.setBackground(buttonColor);
        b7.setForeground(buttonTextColor);
        b7.setFont(buttonFont);
        buttonPanel.add(b7);
        b7.addActionListener(calculatorButtonListener);

        b8 = new JButton("8");
        b8.setBackground(buttonColor);
        b8.setForeground(buttonTextColor);
        b8.setFont(buttonFont);
        buttonPanel.add(b8);
        b8.addActionListener(calculatorButtonListener);

        b9 = new JButton("9");
        b9.setBackground(buttonColor);
        b9.setForeground(buttonTextColor);
        b9.setFont(buttonFont);
        buttonPanel.add(b9);
        b9.addActionListener(calculatorButtonListener);

        mul = new JButton("*");
        mul.setBackground(buttonColor);
        mul.setForeground(buttonTextColor);
        mul.setFont(buttonFont);
        buttonPanel.add(mul);
        mul.addActionListener(calculatorButtonListener);

        b4 = new JButton("4");
        b4.setBackground(buttonColor);
        b4.setForeground(buttonTextColor);
        b4.setFont(buttonFont);
        buttonPanel.add(b4);
        b4.addActionListener(calculatorButtonListener);

        b5 = new JButton("5");
        b5.setBackground(buttonColor);
        b5.setForeground(buttonTextColor);
        b5.setFont(buttonFont);
        buttonPanel.add(b5);
        b5.addActionListener(calculatorButtonListener);

        b6 = new JButton("6");
        b6.setBackground(buttonColor);
        b6.setForeground(buttonTextColor);
        b6.setFont(buttonFont);
        buttonPanel.add(b6);
        b6.addActionListener(calculatorButtonListener);

        min = new JButton("-");
        min.setBackground(buttonColor);
        min.setForeground(buttonTextColor);
        min.setFont(buttonFont);
        buttonPanel.add(min);
        min.addActionListener(calculatorButtonListener);

        b1 = new JButton("1");
        b1.setBackground(buttonColor);
        b1.setForeground(buttonTextColor);
        b1.setFont(buttonFont);
        buttonPanel.add(b1);
        b1.addActionListener(calculatorButtonListener);

        b2 = new JButton("2");
        b2.setBackground(buttonColor);
        b2.setForeground(buttonTextColor);
        b2.setFont(buttonFont);
        buttonPanel.add(b2);
        b2.addActionListener(calculatorButtonListener);

        b3 = new JButton("3");
        b3.setBackground(buttonColor);
        b3.setForeground(buttonTextColor);
        b3.setFont(buttonFont);
        buttonPanel.add(b3);
        b3.addActionListener(calculatorButtonListener);

        plus = new JButton("+");
        plus.setBackground(buttonColor);
        plus.setForeground(buttonTextColor);
        plus.setFont(buttonFont);
        buttonPanel.add(plus);
        plus.addActionListener(calculatorButtonListener);

        chSign = new JButton("+/-");
        chSign.setBackground(buttonColor);
        chSign.setForeground(buttonTextColor);
        chSign.setFont(buttonFont);
        buttonPanel.add(chSign);
        chSign.addActionListener(calculatorButtonListener);

        zero = new JButton("0");
        zero.setBackground(buttonColor);
        zero.setForeground(buttonTextColor);
        zero.setFont(buttonFont);
        buttonPanel.add(zero);
        zero.addActionListener(calculatorButtonListener);

        dot = new JButton(".");
        dot.setBackground(buttonColor);
        dot.setForeground(buttonTextColor);
        dot.setFont(buttonFont);
        buttonPanel.add(dot);
        dot.addActionListener(calculatorButtonListener);

        eq = new JButton("=");
        eq.setBackground(buttonColor);
        eq.setForeground(buttonTextColor);
        eq.setFont(buttonFont);
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
