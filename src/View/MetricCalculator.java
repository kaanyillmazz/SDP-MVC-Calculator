package View;

import Controller.*;
import javax.swing.*;
import java.awt.*;

public class MetricCalculator extends JFrame implements Calculator {
    private static MetricCalculator metricCalculator = null;
    Container cont;
    JLabel info;
    JLabel unit1label;
    JLabel unit2label;
    JLabel result;
    JLabel equals;
    JPanel comboBoxPanel;
    JButton calculate;
    JComboBox heights;
    JComboBox weights;
    JComboBox times;
    JComboBox temps;
    JTextField inputField;
    JPanel inputPanel;
    JPanel conversionPanel;

    private MetricCalculator () {
        cont = getContentPane();
        cont.setLayout(new BorderLayout());
        inputPanel = new JPanel();
        conversionPanel = new JPanel();
        inputField = new JTextField(13);
        comboBoxPanel = new JPanel();
        comboBoxPanel.setLayout(new GridLayout(0, 4,2,2 ));
        info = new JLabel("Select First Unit");
        unit1label = new JLabel(" ");
        unit2label = new JLabel(" ");
        calculate = new JButton("Calculate!");
        equals = new JLabel(" = ");
        result = new JLabel(" ");


        String[] heightUnitList = {"Mm","Cm","In","Ft"};
        String[] weightUnitList = {"G","Oz","Kg","Lb"};
        String[] timeUnitList = {"Sec","Min","Hr","Day"};
        String[] tempUnitList = {"C","F","K"};

        heights = new JComboBox(heightUnitList);
        weights = new JComboBox(weightUnitList);
        times = new JComboBox(timeUnitList);
        temps = new JComboBox(tempUnitList);


        MetricCalculatorController metricCalculatorController = new MetricCalculatorController(this, unit1label, unit2label, info,inputField, result, heights,weights,times,temps);
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

        cont.add("Center", comboBoxPanel);
        cont.add("North", inputPanel);
        cont.add("South", conversionPanel);
    }

    public static MetricCalculator getInstance() {
        if (metricCalculator == null)
            metricCalculator = new MetricCalculator();

        return metricCalculator;

    }
}