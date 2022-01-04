package Controller;

import javax.swing.*;

public class EmptyState implements State {
    ButtonListener buttonListener;
    JTextField tfield;
    JLabel info;

    EmptyState(ButtonListener buttonListener) {
        this.buttonListener = buttonListener;
        this.tfield = buttonListener.tfield;
        this.info = buttonListener.info;

    }

    public void Execute(String s) {

        if (s.equals("1")) {
            tfield.setText(tfield.getText() + "1");
            buttonListener.setCurrentState(buttonListener.getOperatingState());
        }
        if (s.equals("2")) {
            tfield.setText(tfield.getText() + "2");
            buttonListener.setCurrentState(buttonListener.getOperatingState());

        }
        if (s.equals("3")) {
            tfield.setText(tfield.getText() + "3");
            buttonListener.setCurrentState(buttonListener.getOperatingState());

        }
        if (s.equals("4")) {
            tfield.setText(tfield.getText() + "4");
            buttonListener.setCurrentState(buttonListener.getOperatingState());

        }
        if (s.equals("5")) {
            tfield.setText(tfield.getText() + "5");
            buttonListener.setCurrentState(buttonListener.getOperatingState());

        }
        if (s.equals("6")) {
            tfield.setText(tfield.getText() + "6");
            buttonListener.setCurrentState(buttonListener.getOperatingState());

        }
        if (s.equals("7")) {
            tfield.setText(tfield.getText() + "7");
            buttonListener.setCurrentState(buttonListener.getOperatingState());

        }
        if (s.equals("8")) {
            tfield.setText(tfield.getText() + "8");
            buttonListener.setCurrentState(buttonListener.getOperatingState());

        }
        if (s.equals("9")) {
            tfield.setText(tfield.getText() + "9");
            buttonListener.setCurrentState(buttonListener.getOperatingState());

        }
        if (s.equals("0")) {
            tfield.setText(tfield.getText() + "0");
            buttonListener.setCurrentState(buttonListener.getOperatingState());

        }
        if (s.equals("AC")) {
            buttonListener.setFirst(0);
            buttonListener.setSecond(0);
            buttonListener.setResult(0);
            tfield.setText("");

        }
        if (s.equals("log")) {
            tfield.setText("");

        }
        if (s.equals("1/x")) {
            tfield.setText("");
        }
        if (s.equals("Exp")) {
            tfield.setText("");
        }
        if (s.equals("x^2")) {
            tfield.setText("");
        }
        if (s.equals("x^3")) {
            tfield.setText("");
        }
        if (s.equals("+/-")) {
            tfield.setText("");
        }
        if (s.equals(".")) {
            tfield.setText("");
        }
        if (s.equals("+")) {

            tfield.setText("");
            buttonListener.setFirst(0);
            buttonListener.setOperation('+');

            tfield.requestFocus();
        }
        if (s.equals("-")) {

            tfield.setText("");
            buttonListener.setFirst(0);
            buttonListener.setOperation('-');

            tfield.requestFocus();
        }
        if (s.equals("/")) {

            tfield.setText("");
            buttonListener.setFirst(1);
            buttonListener.setOperation('/');

            tfield.requestFocus();
        }
        if (s.equals("*")) {

            tfield.setText("");
            buttonListener.setFirst(1);
            buttonListener.setOperation('*');

            tfield.requestFocus();
        }
        if (s.equals("MC")) {
            buttonListener.setMemoryFull(false);
            buttonListener.setMemory(0);
            tfield.setText("");
            info.setText("memory clr");
        }
        if (s.equals("MR")) {
            tfield.setText("");
            tfield.setText(tfield.getText() + buttonListener.getMemory());
            info.setText("memory rcl" + tfield.getText());
            buttonListener.setCurrentState(buttonListener.getResultShownState());
        }
        if (s.equals("M+")) {
            if (!buttonListener.isMemoryFull()) {
                buttonListener.setMemory(Double.parseDouble(tfield.getText()));
                buttonListener.setMemoryFull(true);
                info.setText("memory-empty-Set: " + tfield.getText());
            } else {
                buttonListener.setMemory(buttonListener.getMemory() + Double.parseDouble(tfield.getText()));
                info.setText("M+: " + buttonListener.getMemory());
            }
        }
        if (s.equals("M-")) {
            if (!buttonListener.isMemoryFull()) {
                buttonListener.setMemory(Double.parseDouble(tfield.getText()));
                buttonListener.setMemoryFull(true);
                info.setText("memory-empty-Set: " + tfield.getText());
            } else {
                buttonListener.setMemory(buttonListener.getMemory() - Double.parseDouble(tfield.getText()));
                info.setText("M-: " + buttonListener.getMemory());

            }
        }
        if (s.equals("MS")) {
            buttonListener.setMemory(Double.parseDouble(tfield.getText()));
            buttonListener.setMemoryFull(true);
            info.setText("memory store: " + tfield.getText());
        }
        if (s.equals("Sqrt")) {
            tfield.setText("");

        }
        if (s.equals("SIN")) {
            tfield.setText("");

        }
        if (s.equals("COS")) {
            tfield.setText("");

        }
        if (s.equals("TAN")) {
            tfield.setText("");

        }
        if (s.equals("=")) {
            tfield.setText("");

        }
        if (s.equals("n!")) {
            tfield.setText("");

        }
        tfield.requestFocus();
    }
}
