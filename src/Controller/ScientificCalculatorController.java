package Controller;

import View.Calculator;

import javax.swing.*;

public class ScientificCalculatorController {
    Calculator scientificCalculator;
    JTextField inputField;
    JLabel info;

    public ScientificCalculatorController(Calculator scientificCalculator, JTextField inputField, JLabel info) {
        this.scientificCalculator = scientificCalculator;
        this.inputField = inputField;
        this.info = info;


    }

    public Calculator getScientificCalculator() {
        return scientificCalculator;
    }

    public JTextField getInputField() {
        return inputField;
    }

    public JLabel getInfo() {
        return info;
    }
}
