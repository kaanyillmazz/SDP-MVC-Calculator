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
        buttonPanel.setLayout(new GridLayout(0, 3, 1, 1));
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
        infoPanel.setBackground(panelColor);

        infoPanel.add(info);
        inputPanel.add(inputField);

        ms = new JButton("MS");
        ms.setBackground(buttonColor);
        ms.setForeground(buttonTextColor);
        ms.setFont(buttonFont);
        buttonPanel.add(ms);
        ms.addActionListener(calculatorButtonListener);

        mr = new JButton("MR");
        mr.setBackground(buttonColor);
        mr.setForeground(buttonTextColor);
        mr.setFont(buttonFont);
        buttonPanel.add(mr);
        mr.addActionListener(calculatorButtonListener);

        mc = new JButton("MC");
        mc.setBackground(buttonColor);
        mc.setForeground(buttonTextColor);
        mc.setFont(buttonFont);
        buttonPanel.add(mc);
        mc.addActionListener(calculatorButtonListener);

        mp = new JButton("M+");
        mp.setBackground(buttonColor);
        mp.setForeground(buttonTextColor);
        mp.setFont(buttonFont);
        buttonPanel.add(mp);
        mp.addActionListener(calculatorButtonListener);

        mm = new JButton("M-");
        mm.setBackground(buttonColor);
        mm.setForeground(buttonTextColor);
        mm.setFont(buttonFont);
        buttonPanel.add(mm);
        mm.addActionListener(calculatorButtonListener);

        clr = new JButton("AC");
        clr.setBackground(buttonColor);
        clr.setForeground(buttonTextColor);
        clr.setFont(buttonFont);
        buttonPanel.add(clr);
        clr.addActionListener(calculatorButtonListener);

        b7 = new JButton("7");
        buttonPanel.add(b7);
        b7.setBackground(buttonColor);
        b7.setForeground(buttonTextColor);
        b7.setFont(buttonFont);
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

        zero = new JButton("0");
        zero.setBackground(buttonColor);
        zero.setForeground(buttonTextColor);
        zero.setFont(buttonFont);
        buttonPanel.add(zero);
        zero.addActionListener(calculatorButtonListener);

        min = new JButton("-");
        min.setBackground(buttonColor);
        min.setForeground(buttonTextColor);
        min.setFont(buttonFont);
        buttonPanel.add(min);
        min.addActionListener(calculatorButtonListener);

        mul = new JButton("*");
        mul.setBackground(buttonColor);
        mul.setForeground(buttonTextColor);
        mul.setFont(buttonFont);
        buttonPanel.add(mul);
        mul.addActionListener(calculatorButtonListener);

        div = new JButton("/");
        div.setBackground(buttonColor);
        div.setForeground(buttonTextColor);
        div.setFont(buttonFont);
        buttonPanel.add(div);
        div.addActionListener(calculatorButtonListener);

        rec = new JButton("1/x");
        rec.setBackground(buttonColor);
        rec.setForeground(buttonTextColor);
        rec.setFont(buttonFont);
        buttonPanel.add(rec);
        rec.addActionListener(calculatorButtonListener);

        sqrt = new JButton("Sqrt");
        sqrt.setBackground(buttonColor);
        sqrt.setForeground(buttonTextColor);
        sqrt.setFont(buttonFont);
        buttonPanel.add(sqrt);
        sqrt.addActionListener(calculatorButtonListener);

        log = new JButton("log");
        log.setBackground(buttonColor);
        log.setForeground(buttonTextColor);
        log.setFont(buttonFont);
        buttonPanel.add(log);
        log.addActionListener(calculatorButtonListener);

        sin = new JButton("SIN");
        sin.setBackground(buttonColor);
        sin.setForeground(buttonTextColor);
        sin.setFont(buttonFont);
        buttonPanel.add(sin);
        sin.addActionListener(calculatorButtonListener);

        cos = new JButton("COS");
        cos.setBackground(buttonColor);
        cos.setForeground(buttonTextColor);
        cos.setFont(buttonFont);
        buttonPanel.add(cos);
        cos.addActionListener(calculatorButtonListener);

        tan = new JButton("TAN");
        tan.setBackground(buttonColor);
        tan.setForeground(buttonTextColor);
        tan.setFont(buttonFont);
        buttonPanel.add(tan);
        tan.addActionListener(calculatorButtonListener);

        pow2 = new JButton("x^2");
        pow2.setBackground(buttonColor);
        pow2.setForeground(buttonTextColor);
        pow2.setFont(buttonFont);
        buttonPanel.add(pow2);
        pow2.addActionListener(calculatorButtonListener);

        pow3 = new JButton("x^3");
        pow3.setBackground(buttonColor);
        pow3.setForeground(buttonTextColor);
        pow3.setFont(buttonFont);
        buttonPanel.add(pow3);
        pow3.addActionListener(calculatorButtonListener);

        exp = new JButton("Exp");
        exp.setBackground(buttonColor);
        exp.setForeground(buttonTextColor);
        exp.setFont(buttonFont);
        buttonPanel.add(exp);
        exp.addActionListener(calculatorButtonListener);

        fac = new JButton("n!");
        fac.setBackground(buttonColor);
        fac.setForeground(buttonTextColor);
        fac.setFont(buttonFont);
        buttonPanel.add(fac);
        fac.addActionListener(calculatorButtonListener);

        dot = new JButton(".");
        dot.setBackground(buttonColor);
        dot.setForeground(buttonTextColor);
        dot.setFont(buttonFont);
        buttonPanel.add(dot);
        dot.addActionListener(calculatorButtonListener);

        chSign = new JButton("+/-");
        chSign.setBackground(buttonColor);
        chSign.setForeground(buttonTextColor);
        chSign.setFont(buttonFont);
        buttonPanel.add(chSign);
        chSign.addActionListener(calculatorButtonListener);

        eq = new JButton("=");
        eq.setBackground(buttonColor);
        eq.setForeground(buttonTextColor);
        eq.setFont(buttonFont);
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