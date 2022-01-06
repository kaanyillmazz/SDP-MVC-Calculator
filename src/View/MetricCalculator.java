package View;

import Controller.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class MetricCalculator extends JFrame implements Calculator {
    //simple singleton implementation
    private static MetricCalculator metricCalculator = null;

    private Container cont;
    private JLabel info;
    private JLabel unit1label;
    private JLabel unit2label;
    private JLabel result;
    private JLabel equals;
    private JPanel comboBoxPanel;
    private JButton calculate;
    private JComboBox heights;
    private JComboBox weights;
    private JComboBox times;
    private JComboBox temps;
    private JTextField inputField;
    private JPanel inputPanel;
    private JPanel conversionPanel;

    private MetricCalculator() {
        cont = getContentPane();
        cont.setLayout(new BorderLayout());
        inputPanel = new JPanel();
        conversionPanel = new JPanel();
        inputField = new JTextField(8);
        comboBoxPanel = new JPanel();
        comboBoxPanel.setLayout(new GridLayout(2, 2, 2, 2));
        info = new JLabel("Select First Unit");
        unit1label = new JLabel(" ");
        unit2label = new JLabel(" ");
        calculate = new JButton("Calculate!");
        equals = new JLabel(" = ");
        result = new JLabel(" ");

        String[] heightUnitList = {"Mm", "Cm", "In", "Ft"};
        String[] weightUnitList = {"G", "Oz", "Kg", "Lb"};
        String[] timeUnitList = {"Sec", "Min", "Hr", "Day"};
        String[] tempUnitList = {"C", "F", "K"};

        heights = new JComboBox(heightUnitList);
        weights = new JComboBox(weightUnitList);
        times = new JComboBox(timeUnitList);
        temps = new JComboBox(tempUnitList);

        MetricCalculatorController metricCalculatorController = new MetricCalculatorController(this, unit1label, unit2label, info, inputField, result, heights, weights, times, temps);
        MetricComboBoxListener metricComboBoxListener = new MetricComboBoxListener(metricCalculatorController);
        MetricButtonsListener metricButtonsListener = new MetricButtonsListener(metricCalculatorController);

        comboBoxPanel.add(heights);
        comboBoxPanel.add(weights);
        comboBoxPanel.add(times);
        comboBoxPanel.add(temps);
        inputPanel.add(info);

        calculate.addActionListener(metricButtonsListener);
        heights.addActionListener(metricComboBoxListener);
        weights.addActionListener(metricComboBoxListener);
        times.addActionListener(metricComboBoxListener);
        temps.addActionListener(metricComboBoxListener);

        conversionPanel.add(inputField);
        conversionPanel.add(unit1label);
        conversionPanel.add(equals);
        conversionPanel.add(result);
        conversionPanel.add(unit2label);
        conversionPanel.add(calculate);

        Font buttonFont = new Font(Font.DIALOG,Font.BOLD,12);
        Font textFont = new Font(Font.DIALOG,Font.BOLD,12);
        Color panelColor = new Color(17, 38, 52);
        Color buttonColor = new Color(54, 24, 24);
        Color buttonTextColor = new Color(222, 205, 205);

        conversionPanel.setBackground(panelColor);
        comboBoxPanel.setBackground(panelColor);
        inputPanel.setBackground(panelColor);

        info.setForeground(Color.white);
        unit1label.setForeground(Color.white);
        unit2label.setForeground(Color.white);
        equals.setForeground(Color.white);
        result.setForeground(Color.white);

        calculate.setBackground(buttonColor);
        calculate.setForeground(Color.white);
        calculate.setFont(buttonFont);
        inputField.setFont(textFont);
        info.setFont(textFont);

        times.setBackground(buttonColor);
        heights.setBackground(buttonColor);
        weights.setBackground(buttonColor);
        temps.setBackground(buttonColor);

        times.setFont(textFont);
        heights.setFont(textFont);
        weights.setFont(textFont);
        temps.setFont(textFont);

        inputField.setBackground(new Color(133, 101, 101));
        info.setBackground(panelColor);
        info.setFont(textFont);

        cont.add("Center", comboBoxPanel);
        cont.add("North", inputPanel);
        cont.add("South", conversionPanel);
    }
    //simple singleton implementation
    public static MetricCalculator getInstance() {
        if (metricCalculator == null)
            metricCalculator = new MetricCalculator();

        return metricCalculator;

    }
}
