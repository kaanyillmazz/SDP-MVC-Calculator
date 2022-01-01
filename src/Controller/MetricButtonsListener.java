package Controller;

import Controller.ConversionCommands.ConversionCommand;
import Controller.ConversionCommands.ConversionCommandFactory;
import Controller.ConversionCommands.ConversionType;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MetricButtonsListener implements ActionListener {
    MetricCalculatorController metricCalculatorController;
    JLabel unit1label;
    JLabel unit2label;
    JLabel result;
    JTextField inputField;
    JComboBox jc1;
    JComboBox jc2;
    JComboBox jc3;
    JComboBox jc4;
    JLabel info;
    ConversionCommandFactory conversionCommandFactory;

    public MetricButtonsListener (MetricCalculatorController metricCalculatorController) {
        this.metricCalculatorController = metricCalculatorController;
        unit1label = metricCalculatorController.getUnit1label();
        unit2label = metricCalculatorController.getUnit2label();
        result = metricCalculatorController.getResult();
        info = metricCalculatorController.getInfo();
        inputField = metricCalculatorController.getInputField();
        conversionCommandFactory = new ConversionCommandFactory();
        jc1 = metricCalculatorController.getJc1();
        jc2 = metricCalculatorController.getJc2();
        jc3 = metricCalculatorController.getJc3();
        jc4 = metricCalculatorController.getJc4();
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (metricCalculatorController.getOperationState() == 2) {
            String s = unit1label.getText() + "To" + unit2label.getText();
            ConversionCommand command;
            double resultholder = 0;
            try {
                command = conversionCommandFactory.Create(ConversionType.valueOf(s));
                resultholder = command.Execute(Double.parseDouble(inputField.getText()));
            } catch (IllegalArgumentException i) {
                s = unit2label.getText() + "To" + unit1label.getText();
                command = conversionCommandFactory.Create(ConversionType.valueOf(s));
                resultholder = command.unExecute(Double.parseDouble(inputField.getText()));
            }
            result.setText(String.valueOf(resultholder));
            jc1.setEnabled(true);
            jc2.setEnabled(true);
            jc3.setEnabled(true);
            jc4.setEnabled(true);
            info.setText("select first unit");


            metricCalculatorController.setOperationState(0);
        }

    }
}
