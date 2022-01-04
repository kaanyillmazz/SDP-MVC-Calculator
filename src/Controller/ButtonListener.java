package Controller;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonListener implements ActionListener {
    ScientificCalculatorController scientificCalculatorController;
    JTextField tfield;
    JLabel info;

    double first;
    double second;
    double result;
    double memory;
    char operation;
    boolean memoryFull;


    State currentState;
    OperatingState operatingState;
    ResultShownState resultShownState;
    EmptyState emptyState;


    public ButtonListener(ScientificCalculatorController scientificCalculatorController) {
        this.scientificCalculatorController = scientificCalculatorController;
        tfield = scientificCalculatorController.getTfield();
        info = scientificCalculatorController.getInfo();
        operatingState = new OperatingState(this);
        resultShownState = new ResultShownState(this);
        emptyState = new EmptyState(this);
        currentState = emptyState;
    }


    public OperatingState getOperatingState() {
        return operatingState;
    }

    public ResultShownState getResultShownState() {
        return resultShownState;
    }

    public EmptyState getEmptyState() {
        return emptyState;
    }

    public void setCurrentState(State currentState) {
        this.currentState = currentState;
    }

    public double getFirst() {
        return first;
    }

    public double getResult() {
        return result;
    }

    public double getSecond() {
        return second;
    }

    public double getMemory() {
        return memory;
    }

    public boolean isMemoryFull() {
        return memoryFull;
    }

    public void setMemoryFull(boolean memoryFull) {
        this.memoryFull = memoryFull;
    }

    public void setOperation(char operation) {
        this.operation = operation;
    }

    public void setFirst(double first) {
        this.first = first;
    }

    public void setSecond(double second) {
        this.second = second;
    }

    public void setResult(double result) {
        this.result = result;
    }

    public char getOperation() {
        return operation;
    }

    public void setMemory(double memory) {
        this.memory = memory;
    }

    public void actionPerformed(ActionEvent e) {
        String s = e.getActionCommand();

        currentState.Execute(s);

        tfield.requestFocus();
    }

}
