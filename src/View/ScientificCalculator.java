package View;

import Controller.ButtonListener;
import Controller.ScientificCalculatorController;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class ScientificCalculator extends JFrame implements Calculator {
    //simple singleton implementation
    private static ScientificCalculator scientificCalculator = null;

    private  Container container;
    private   JButton b1;
    private    JButton b2;
    private    JButton b3;
    private      JButton b4;
    private    JButton b5;
    private     JButton b6;
    private     JButton b7;
    private     JButton b8;
    private    JButton b9;
    private    JButton zero;
    private     JButton clr;
    private     JButton pow2;
    private   JButton pow3;
    private      JButton exp;
    private    JButton fac;
    private     JButton plus;
    private     JButton min;
    private     JButton div;
    private      JButton log;
    private     JButton rec;
    private    JButton mul;
    private     JButton eq;
    private    JButton chSign;
    private     JButton dot;
    private    JButton mr;
    private    JButton mc;
    private   JButton mp;
    private      JButton mm;
    private     JButton ms;
    private     JButton sqrt;
    private     JButton sin;
    private     JButton cos;
    private     JButton tan;
    private     JTextField inputField;
    private    JLabel info;
    private     JPanel buttonPanel;
    private    JPanel infoPanel;
    private    JPanel inputPanel;


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
        ButtonListener buttonListener = new ButtonListener(scientificCalculatorController);

        ms = new JButton("MS");
        buttonPanel.add(ms);
        ms.addActionListener(buttonListener);

        mr = new JButton("MR");
        buttonPanel.add(mr);
        mr.addActionListener(buttonListener);

        mc = new JButton("MC");
        buttonPanel.add(mc);
        mc.addActionListener(buttonListener);

        mp = new JButton("M+");
        buttonPanel.add(mp);
        mp.addActionListener(buttonListener);

        mm = new JButton("M-");
        buttonPanel.add(mm);
        mm.addActionListener(buttonListener);

        clr = new JButton("AC");
        buttonPanel.add(clr);
        clr.addActionListener(buttonListener);

        b1 = new JButton("1");
        buttonPanel.add(b1);
        b1.addActionListener(buttonListener);

        b2 = new JButton("2");
        buttonPanel.add(b2);
        b2.addActionListener(buttonListener);

        b3 = new JButton("3");
        buttonPanel.add(b3);
        b3.addActionListener(buttonListener);

        b4 = new JButton("4");
        buttonPanel.add(b4);
        b4.addActionListener(buttonListener);

        b5 = new JButton("5");
        buttonPanel.add(b5);
        b5.addActionListener(buttonListener);

        b6 = new JButton("6");
        buttonPanel.add(b6);
        b6.addActionListener(buttonListener);

        b7 = new JButton("7");
        buttonPanel.add(b7);
        b7.addActionListener(buttonListener);

        b8 = new JButton("8");
        buttonPanel.add(b8);
        b8.addActionListener(buttonListener);

        b9 = new JButton("9");
        buttonPanel.add(b9);
        b9.addActionListener(buttonListener);

        zero = new JButton("0");
        buttonPanel.add(zero);
        zero.addActionListener(buttonListener);

        plus = new JButton("+");
        buttonPanel.add(plus);
        plus.addActionListener(buttonListener);

        min = new JButton("-");
        buttonPanel.add(min);
        min.addActionListener(buttonListener);

        mul = new JButton("*");
        buttonPanel.add(mul);
        mul.addActionListener(buttonListener);

        div = new JButton("/");
        buttonPanel.add(div);
        div.addActionListener(buttonListener);

        chSign = new JButton("+/-");
        buttonPanel.add(chSign);
        chSign.addActionListener(buttonListener);

        dot = new JButton(".");
        buttonPanel.add(dot);
        dot.addActionListener(buttonListener);

        rec = new JButton("1/x");
        buttonPanel.add(rec);
        rec.addActionListener(buttonListener);

        sqrt = new JButton("Sqrt");
        buttonPanel.add(sqrt);
        sqrt.addActionListener(buttonListener);

        log = new JButton("log");
        buttonPanel.add(log);
        log.addActionListener(buttonListener);

        sin = new JButton("SIN");
        buttonPanel.add(sin);
        sin.addActionListener(buttonListener);

        cos = new JButton("COS");
        buttonPanel.add(cos);
        cos.addActionListener(buttonListener);

        tan = new JButton("TAN");
        buttonPanel.add(tan);
        tan.addActionListener(buttonListener);

        pow2 = new JButton("x^2");
        buttonPanel.add(pow2);
        pow2.addActionListener(buttonListener);

        pow3 = new JButton("x^3");
        buttonPanel.add(pow3);
        pow3.addActionListener(buttonListener);

        exp = new JButton("Exp");
        buttonPanel.add(exp);
        exp.addActionListener(buttonListener);

        fac = new JButton("n!");
        buttonPanel.add(fac);
        fac.addActionListener(buttonListener);

        eq = new JButton("=");
        buttonPanel.add(eq);
        eq.addActionListener(buttonListener);

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