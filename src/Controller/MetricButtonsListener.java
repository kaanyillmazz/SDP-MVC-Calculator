package Controller;

import Model.ConversionCommands.ConversionCommand;
import Model.ConversionCommands.ConversionCommandFactory;
import Model.ConversionCommands.ConversionType;

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

    public MetricButtonsListener(MetricCalculatorController metricCalculatorController) {
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
            String unitGetter = unit1label.getText() + "To" + unit2label.getText();
            ConversionCommand command;
            double resultHolder = 0;
            //Check if user provided numbers
            try {
                Double.parseDouble(inputField.getText());
            } catch (Exception asd) {
                JDialog warning = new JDialog();
                JLabel warn = new JLabel("Please Enter Numbers!");
                warning.setTitle("Warning!");
                warning.add(warn);
                warning.setVisible(true);
                warning.setLocationRelativeTo(null);
                warning.pack();
            }
            //Check if the user requested one of the available conversion classes
            //if not check if the user can use one of the unExecute commands
            try {
                command = conversionCommandFactory.Create(ConversionType.valueOf(unitGetter));
                resultHolder = command.Execute(Double.parseDouble(inputField.getText()));
            } catch (IllegalArgumentException i) {
                unitGetter = unit2label.getText() + "To" + unit1label.getText();
                command = conversionCommandFactory.Create(ConversionType.valueOf(unitGetter));
                resultHolder = command.unExecute(Double.parseDouble(inputField.getText()));
            }
            //set the result
            result.setText(String.valueOf(resultHolder));
            //make buttons available for next conversion
            jc1.setEnabled(true);
            jc2.setEnabled(true);
            jc3.setEnabled(true);
            jc4.setEnabled(true);

            //set conversion state to nothing selected
            info.setText("select first unit");
            metricCalculatorController.setOperationState(0);
        }

    }
}
