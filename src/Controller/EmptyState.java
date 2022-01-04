package Controller;

import javax.swing.*;

public class EmptyState implements State {
    //this state is for when input field is empty

    ButtonListener buttonListener;
    JTextField inputField;
    JLabel info;

    EmptyState(ButtonListener buttonListener) {
        this.buttonListener = buttonListener;
        this.inputField = buttonListener.inputField;
        this.info = buttonListener.info;

    }

    public void Execute(String s) {

        if (s.equals("1")) {
            inputField.setText(inputField.getText() + "1");
            buttonListener.setCurrentState(buttonListener.getOperatingState());
        }
        if (s.equals("2")) {
            inputField.setText(inputField.getText() + "2");
            buttonListener.setCurrentState(buttonListener.getOperatingState());

        }
        if (s.equals("3")) {
            inputField.setText(inputField.getText() + "3");
            buttonListener.setCurrentState(buttonListener.getOperatingState());

        }
        if (s.equals("4")) {
            inputField.setText(inputField.getText() + "4");
            buttonListener.setCurrentState(buttonListener.getOperatingState());

        }
        if (s.equals("5")) {
            inputField.setText(inputField.getText() + "5");
            buttonListener.setCurrentState(buttonListener.getOperatingState());

        }
        if (s.equals("6")) {
            inputField.setText(inputField.getText() + "6");
            buttonListener.setCurrentState(buttonListener.getOperatingState());

        }
        if (s.equals("7")) {
            inputField.setText(inputField.getText() + "7");
            buttonListener.setCurrentState(buttonListener.getOperatingState());

        }
        if (s.equals("8")) {
            inputField.setText(inputField.getText() + "8");
            buttonListener.setCurrentState(buttonListener.getOperatingState());

        }
        if (s.equals("9")) {
            inputField.setText(inputField.getText() + "9");
            buttonListener.setCurrentState(buttonListener.getOperatingState());

        }
        if (s.equals("0")) {
            inputField.setText(inputField.getText() + "0");
            buttonListener.setCurrentState(buttonListener.getOperatingState());

        }
        if (s.equals("AC")) {
            buttonListener.setFirst(0);
            buttonListener.setSecond(0);
            buttonListener.setResult(0);
            inputField.setText("");

        }
        if (s.equals("log")) {
            inputField.setText("");

        }
        if (s.equals("1/x")) {
            inputField.setText("");
        }
        if (s.equals("Exp")) {
            inputField.setText("");
        }
        if (s.equals("x^2")) {
            inputField.setText("");
        }
        if (s.equals("x^3")) {
            inputField.setText("");
        }
        if (s.equals("+/-")) {
            inputField.setText("");
        }
        if (s.equals(".")) {
            inputField.setText("");
        }
        if (s.equals("+")) {

            inputField.setText("");
            buttonListener.setFirst(0);
            buttonListener.setOperation('+');

            inputField.requestFocus();
        }
        if (s.equals("-")) {

            inputField.setText("");
            buttonListener.setFirst(0);
            buttonListener.setOperation('-');

            inputField.requestFocus();
        }
        if (s.equals("/")) {

            inputField.setText("");
            buttonListener.setFirst(1);
            buttonListener.setOperation('/');

            inputField.requestFocus();
        }
        if (s.equals("*")) {

            inputField.setText("");
            buttonListener.setFirst(1);
            buttonListener.setOperation('*');

            inputField.requestFocus();
        }
        if (s.equals("MC")) {
            buttonListener.setMemoryFull(false);
            buttonListener.setMemory(0);
            inputField.setText("");
            info.setText("memory clr");
        }
        if (s.equals("MR")) {
            inputField.setText("");
            inputField.setText(inputField.getText() + buttonListener.getMemory());
            info.setText("memory rcl" + inputField.getText());
            buttonListener.setCurrentState(buttonListener.getResultShownState());
        }
        if (s.equals("M+")) {
            if (!buttonListener.isMemoryFull()) {
                buttonListener.setMemory(Double.parseDouble(inputField.getText()));
                buttonListener.setMemoryFull(true);
                info.setText("memory-empty-Set: " + inputField.getText());
            } else {
                buttonListener.setMemory(buttonListener.getMemory() + Double.parseDouble(inputField.getText()));
                info.setText("M+: " + buttonListener.getMemory());
            }
        }
        if (s.equals("M-")) {
            if (!buttonListener.isMemoryFull()) {
                buttonListener.setMemory(Double.parseDouble(inputField.getText()));
                buttonListener.setMemoryFull(true);
                info.setText("memory-empty-Set: " + inputField.getText());
            } else {
                buttonListener.setMemory(buttonListener.getMemory() - Double.parseDouble(inputField.getText()));
                info.setText("M-: " + buttonListener.getMemory());

            }
        }
        if (s.equals("MS")) {
            buttonListener.setMemory(Double.parseDouble(inputField.getText()));
            buttonListener.setMemoryFull(true);
            info.setText("memory store: " + inputField.getText());
        }
        if (s.equals("Sqrt")) {
            inputField.setText("");

        }
        if (s.equals("SIN")) {
            inputField.setText("");

        }
        if (s.equals("COS")) {
            inputField.setText("");

        }
        if (s.equals("TAN")) {
            inputField.setText("");

        }
        if (s.equals("=")) {
            inputField.setText("");

        }
        if (s.equals("n!")) {
            inputField.setText("");

        }
        inputField.requestFocus();
    }
}
