package Controller;

import View.Calculator;
import View.ScientificCalculator;

import javax.swing.*;

public class ScientificCalculatorController {
    Calculator scientificCalculator;
    JTextField tfield;
    JLabel info;

    public ScientificCalculatorController(Calculator scientificCalculator, JTextField tfield, JLabel info) {
        this.scientificCalculator = scientificCalculator;
        this.tfield = tfield;
        this.info = info;


    }

    public Calculator getScientificCalculator() {
        return scientificCalculator;
    }

    public JTextField getTfield() {
        return tfield;
    }

    public JLabel getInfo() {
        return info;
    }
}
