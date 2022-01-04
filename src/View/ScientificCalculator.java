package View;

import Controller.CalculatorButtonListener;
import Controller.ScientificCalculatorController;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class ScientificCalculator extends JFrame implements Calculator {
    //simple singleton implementation
    private static ScientificCalculator scientificCalculator = null;

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
    private JButton pow3;
    private JButton exp;
    private JButton fac;
    private JButton plus;
    private JButton min;
    private JButton div;
    private JButton log;
    private JButton rec;
    private JButton mul;
    private JButton eq;
    private JButton chSign;
    private JButton dot;
    private JButton mr;
    private JButton mc;
    private JButton mp;
    private JButton mm;
    private JButton ms;
    private JButton sqrt;
    private JButton sin;
    private JButton cos;
    private JButton tan;
    private JTextField inputField;
    private JLabel info;
    private JPanel buttonPanel;
    private JPanel infoPanel;
    private JPanel inputPanel;


    private ScientificCalculator() {
        container = getContentPane();
        container.setLayout(new BorderLayout());
        infoPanel = new JPanel();
        inputPanel = new JPanel();
        inputField = new JTextField(20);
        inputField.setEditable(false);
        buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(0, 3, 2, 2));
        info = new JLabel("Scientific Calculator");

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


        infoPanel.add(info);
        inputPanel.add(inputField);


        ScientificCalculatorController scientificCalculatorController = new ScientificCalculatorController(this, inputField, info);
        CalculatorButtonListener calculatorButtonListener = new CalculatorButtonListener(scientificCalculatorController);

        ms = new JButton("MS");
        buttonPanel.add(ms);
        ms.addActionListener(calculatorButtonListener);

        mr = new JButton("MR");
        buttonPanel.add(mr);
        mr.addActionListener(calculatorButtonListener);

        mc = new JButton("MC");
        buttonPanel.add(mc);
        mc.addActionListener(calculatorButtonListener);

        mp = new JButton("M+");
        buttonPanel.add(mp);
        mp.addActionListener(calculatorButtonListener);

        mm = new JButton("M-");
        buttonPanel.add(mm);
        mm.addActionListener(calculatorButtonListener);

        clr = new JButton("AC");
        buttonPanel.add(clr);
        clr.addActionListener(calculatorButtonListener);

        b1 = new JButton("1");
        buttonPanel.add(b1);
        b1.addActionListener(calculatorButtonListener);

        b2 = new JButton("2");
        buttonPanel.add(b2);
        b2.addActionListener(calculatorButtonListener);

        b3 = new JButton("3");
        buttonPanel.add(b3);
        b3.addActionListener(calculatorButtonListener);

        b4 = new JButton("4");
        buttonPanel.add(b4);
        b4.addActionListener(calculatorButtonListener);

        b5 = new JButton("5");
        buttonPanel.add(b5);
        b5.addActionListener(calculatorButtonListener);

        b6 = new JButton("6");
        buttonPanel.add(b6);
        b6.addActionListener(calculatorButtonListener);

        b7 = new JButton("7");
        buttonPanel.add(b7);
        b7.addActionListener(calculatorButtonListener);

        b8 = new JButton("8");
        buttonPanel.add(b8);
        b8.addActionListener(calculatorButtonListener);

        b9 = new JButton("9");
        buttonPanel.add(b9);
        b9.addActionListener(calculatorButtonListener);

        zero = new JButton("0");
        buttonPanel.add(zero);
        zero.addActionListener(calculatorButtonListener);

        plus = new JButton("+");
        buttonPanel.add(plus);
        plus.addActionListener(calculatorButtonListener);

        min = new JButton("-");
        buttonPanel.add(min);
        min.addActionListener(calculatorButtonListener);

        mul = new JButton("*");
        buttonPanel.add(mul);
        mul.addActionListener(calculatorButtonListener);

        div = new JButton("/");
        buttonPanel.add(div);
        div.addActionListener(calculatorButtonListener);

        chSign = new JButton("+/-");
        buttonPanel.add(chSign);
        chSign.addActionListener(calculatorButtonListener);

        dot = new JButton(".");
        buttonPanel.add(dot);
        dot.addActionListener(calculatorButtonListener);

        rec = new JButton("1/x");
        buttonPanel.add(rec);
        rec.addActionListener(calculatorButtonListener);

        sqrt = new JButton("Sqrt");
        buttonPanel.add(sqrt);
        sqrt.addActionListener(calculatorButtonListener);

        log = new JButton("log");
        buttonPanel.add(log);
        log.addActionListener(calculatorButtonListener);

        sin = new JButton("SIN");
        buttonPanel.add(sin);
        sin.addActionListener(calculatorButtonListener);

        cos = new JButton("COS");
        buttonPanel.add(cos);
        cos.addActionListener(calculatorButtonListener);

        tan = new JButton("TAN");
        buttonPanel.add(tan);
        tan.addActionListener(calculatorButtonListener);

        pow2 = new JButton("x^2");
        buttonPanel.add(pow2);
        pow2.addActionListener(calculatorButtonListener);

        pow3 = new JButton("x^3");
        buttonPanel.add(pow3);
        pow3.addActionListener(calculatorButtonListener);

        exp = new JButton("Exp");
        buttonPanel.add(exp);
        exp.addActionListener(calculatorButtonListener);

        fac = new JButton("n!");
        buttonPanel.add(fac);
        fac.addActionListener(calculatorButtonListener);

        eq = new JButton("=");
        buttonPanel.add(eq);
        eq.addActionListener(calculatorButtonListener);

        container.add("North", infoPanel);
        container.add("South", buttonPanel);
        container.add("Center", inputPanel);
    }


    //simple singleton implementation
    public static ScientificCalculator getInstance() {
        if (scientificCalculator == null)
            scientificCalculator = new ScientificCalculator();

        return scientificCalculator;
    }


}