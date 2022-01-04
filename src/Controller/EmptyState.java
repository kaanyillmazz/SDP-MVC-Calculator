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

    public void Execute(String cmd) {

        if (cmd.equals("1")) {
            inputField.setText(inputField.getText() + "1");
            buttonListener.setCurrentState(buttonListener.getOperatingState());
        }
        if (cmd.equals("2")) {
            inputField.setText(inputField.getText() + "2");
            buttonListener.setCurrentState(buttonListener.getOperatingState());

        }
        if (cmd.equals("3")) {
            inputField.setText(inputField.getText() + "3");
            buttonListener.setCurrentState(buttonListener.getOperatingState());

        }
        if (cmd.equals("4")) {
            inputField.setText(inputField.getText() + "4");
            buttonListener.setCurrentState(buttonListener.getOperatingState());

        }
        if (cmd.equals("5")) {
            inputField.setText(inputField.getText() + "5");
            buttonListener.setCurrentState(buttonListener.getOperatingState());

        }
        if (cmd.equals("6")) {
            inputField.setText(inputField.getText() + "6");
            buttonListener.setCurrentState(buttonListener.getOperatingState());

        }
        if (cmd.equals("7")) {
            inputField.setText(inputField.getText() + "7");
            buttonListener.setCurrentState(buttonListener.getOperatingState());

        }
        if (cmd.equals("8")) {
            inputField.setText(inputField.getText() + "8");
            buttonListener.setCurrentState(buttonListener.getOperatingState());

        }
        if (cmd.equals("9")) {
            inputField.setText(inputField.getText() + "9");
            buttonListener.setCurrentState(buttonListener.getOperatingState());

        }
        if (cmd.equals("0")) {
            inputField.setText(inputField.getText() + "0");
            buttonListener.setCurrentState(buttonListener.getOperatingState());

        }
        if (cmd.equals("AC")) {
            buttonListener.setFirst(0);
            buttonListener.setSecond(0);
            buttonListener.setResult(0);
            inputField.setText("");

        }
        if (cmd.equals("log")) {
            inputField.setText("");

        }
        if (cmd.equals("1/x")) {
            inputField.setText("");
        }
        if (cmd.equals("Exp")) {
            inputField.setText("");
        }
        if (cmd.equals("x^2")) {
            inputField.setText("");
        }
        if (cmd.equals("x^3")) {
            inputField.setText("");
        }
        if (cmd.equals("+/-")) {
            inputField.setText("");
        }
        if (cmd.equals(".")) {
            inputField.setText("");
        }
        if (cmd.equals("+")) {

            inputField.setText("");
            buttonListener.setFirst(0);
            buttonListener.setOperation('+');

            inputField.requestFocus();
        }
        if (cmd.equals("-")) {

            inputField.setText("");
            buttonListener.setFirst(0);
            buttonListener.setOperation('-');

            inputField.requestFocus();
        }
        if (cmd.equals("/")) {

            inputField.setText("");
            buttonListener.setFirst(1);
            buttonListener.setOperation('/');

            inputField.requestFocus();
        }
        if (cmd.equals("*")) {

            inputField.setText("");
            buttonListener.setFirst(1);
            buttonListener.setOperation('*');

            inputField.requestFocus();
        }
        if (cmd.equals("MC")) {
            buttonListener.setMemoryFull(false);
            buttonListener.setMemory(0);
            inputField.setText("");
            info.setText("memory clr");
        }
        if (cmd.equals("MR")) {
            inputField.setText("");
            inputField.setText(inputField.getText() + buttonListener.getMemory());
            info.setText("memory rcl" + inputField.getText());
            buttonListener.setCurrentState(buttonListener.getResultShownState());
        }
        if (cmd.equals("M+")) {
            if (!buttonListener.isMemoryFull()) {
                buttonListener.setMemory(Double.parseDouble(inputField.getText()));
                buttonListener.setMemoryFull(true);
                info.setText("memory-empty-Set: " + inputField.getText());
            } else {
                buttonListener.setMemory(buttonListener.getMemory() + Double.parseDouble(inputField.getText()));
                info.setText("M+: " + buttonListener.getMemory());
            }
        }
        if (cmd.equals("M-")) {
            if (!buttonListener.isMemoryFull()) {
                buttonListener.setMemory(Double.parseDouble(inputField.getText()));
                buttonListener.setMemoryFull(true);
                info.setText("memory-empty-Set: " + inputField.getText());
            } else {
                buttonListener.setMemory(buttonListener.getMemory() - Double.parseDouble(inputField.getText()));
                info.setText("M-: " + buttonListener.getMemory());

            }
        }
        if (cmd.equals("MS")) {
            buttonListener.setMemory(Double.parseDouble(inputField.getText()));
            buttonListener.setMemoryFull(true);
            info.setText("memory store: " + inputField.getText());
        }
        if (cmd.equals("Sqrt")) {
            inputField.setText("");

        }
        if (cmd.equals("SIN")) {
            inputField.setText("");

        }
        if (cmd.equals("COS")) {
            inputField.setText("");

        }
        if (cmd.equals("TAN")) {
            inputField.setText("");

        }
        if (cmd.equals("=")) {
            inputField.setText("");

        }
        if (cmd.equals("n!")) {
            inputField.setText("");

        }
        inputField.requestFocus();
    }
}
