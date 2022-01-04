package Controller;

import View.MetricCalculator;

import javax.swing.*;



public class MetricCalculatorController {
    JLabel unit1label;
    JLabel unit2label;
    JLabel result;
    JTextField inputField;
    MetricCalculator metricCalculator;
    JComboBox jc1;
    JComboBox jc2;
    JComboBox jc3;
    JComboBox jc4;
    JLabel info;

    //operations state
    //0 no units
    //1 first unit selected
    //2 second unit selected
    int operationState;

   public MetricCalculatorController(MetricCalculator metricCalculator, JLabel unit1label, JLabel unit2label,JLabel info, JTextField inputField, JLabel result, JComboBox jc1, JComboBox jc2, JComboBox jc3, JComboBox jc4) {
        this.metricCalculator = metricCalculator;
        this.unit1label = unit1label;
        this.unit2label = unit2label;
        this.inputField = inputField;
        this.result = result;
        this.info = info;
        this.jc1 = jc1;
        this.jc2 = jc2;
        this.jc3 = jc3;
        this.jc4 = jc4;
    }

    public JLabel getUnit1label() {
        return unit1label;
    }

    public JLabel getUnit2label() {
        return unit2label;
    }

    public JTextField getInputField() {
        return inputField;
    }

    public JLabel getResult() {
        return result;
    }

    public JLabel getInfo() {
        return info;
    }

    public void setOperationState(int operationState) {
        this.operationState = operationState;
    }

    public int getOperationState() {
        return operationState;
    }

    public JComboBox getJc1() {
        return jc1;
    }

    public JComboBox getJc2() {
        return jc2;
    }

    public JComboBox getJc3() {
        return jc3;
    }

    public JComboBox getJc4() {
        return jc4;
    }
}
