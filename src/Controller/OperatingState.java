package Controller;

import javax.swing.*;

public class OperatingState implements State {
    //this state is for when user is operating and
    //input field does not need a reset

    ButtonListener buttonListener;
    JTextField inputField;
    JLabel info;

    boolean wasReversed;
    boolean isDecimal;
    double localResult;


    OperatingState(ButtonListener buttonListener) {
        this.buttonListener = buttonListener;
        this.inputField = buttonListener.inputField;
        this.info = buttonListener.info;

    }

    public void Execute(String cmd) {

        if (cmd.equals("1")) {
            inputField.setText(inputField.getText() + "1");

        }
        if (cmd.equals("2")) {
            inputField.setText(inputField.getText() + "2");

        }
        if (cmd.equals("3")) {
            inputField.setText(inputField.getText() + "3");
        }

        if (cmd.equals("4")) {

            inputField.setText(inputField.getText() + "4");

        }
        if (cmd.equals("5")) {

            inputField.setText(inputField.getText() + "5");

        }
        if (cmd.equals("6")) {
            inputField.setText(inputField.getText() + "6");

        }
        if (cmd.equals("7")) {

            inputField.setText(inputField.getText() + "7");

        }
        if (cmd.equals("8")) {
            inputField.setText(inputField.getText() + "8");
        }
        if (cmd.equals("9")) {

            inputField.setText(inputField.getText() + "9");

        }
        if (cmd.equals("0")) {

            inputField.setText(inputField.getText() + "0");

        }
        if (cmd.equals("AC")) {
            inputField.setText("");
            wasReversed = false;
            isDecimal = false;

            buttonListener.setCurrentState(buttonListener.getEmptyState());
            buttonListener.setFirst(0);
            buttonListener.setSecond(0);
            buttonListener.setResult(0);
        }
        if (cmd.equals("log")) {

            localResult = Math.log(Double.parseDouble(inputField.getText()));
            inputField.setText("");
            inputField.setText(inputField.getText() + localResult);

        }
        if (cmd.equals("1/x")) {

            localResult = 1 / Double.parseDouble(inputField.getText());
            inputField.setText("");
            inputField.setText(inputField.getText() + localResult);

        }
        if (cmd.equals("Exp")) {

            localResult = Math.exp(Double.parseDouble(inputField.getText()));
            inputField.setText("");
            inputField.setText(inputField.getText() + localResult);

        }
        if (cmd.equals("x^2")) {

            localResult = Math.pow(Double.parseDouble(inputField.getText()), 2);
            inputField.setText("");
            inputField.setText(inputField.getText() + localResult);

        }
        if (cmd.equals("x^3")) {

            localResult = Math.pow(Double.parseDouble(inputField.getText()), 3);
            inputField.setText("");
            inputField.setText(inputField.getText() + localResult);

        }
        if (cmd.equals("+/-")) {
            if (!wasReversed) {
                inputField.setText("-" + inputField.getText());
                wasReversed = true;
            } else {
                String full = inputField.getText();
                String substr = full.substring(1);
                inputField.setText(substr);
                wasReversed = false;
            }
        }
        if (cmd.equals(".")) {
            if (!isDecimal) {
                inputField.setText(inputField.getText() + ".");
                isDecimal = true;
            } else {
                inputField.setText(inputField.getText());
            }
        }
        if (cmd.equals("+")) {

            buttonListener.setFirst(Double.parseDouble(inputField.getText()));
            inputField.setText("");
            buttonListener.setOperation('+');
            isDecimal = false;
            wasReversed = false;

            inputField.requestFocus();
        }
        if (cmd.equals("-")) {

            wasReversed = false;
            isDecimal = false;
            buttonListener.setFirst(Double.parseDouble(inputField.getText()));
            inputField.setText("");
            buttonListener.setOperation('-');

            inputField.requestFocus();
        }
        if (cmd.equals("/")) {
            wasReversed = false;
            isDecimal = false;
            buttonListener.setFirst(Double.parseDouble(inputField.getText()));
            buttonListener.setOperation('/');
            inputField.setText("");

            inputField.requestFocus();
        }
        if (cmd.equals("*")) {

            wasReversed = false;
            isDecimal = false;
            buttonListener.setFirst(Double.parseDouble(inputField.getText()));
            buttonListener.setOperation('*');
            inputField.setText("");

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
            if (inputField.getText().equals("")) {
                inputField.setText("");
            } else {
                localResult = Math.sqrt(Double.parseDouble(inputField.getText()));
                inputField.setText("");
                inputField.setText(inputField.getText() + localResult);
            }
        }
        if (cmd.equals("SIN")) {

            double degrees = Double.parseDouble(inputField.getText());
            double radians = Math.toRadians(degrees);
            localResult = Math.sin(radians);
            inputField.setText("");
            inputField.setText(inputField.getText() + localResult);

            buttonListener.setCurrentState(buttonListener.getResultShownState());

        }
        if (cmd.equals("COS")) {

            double degrees = Double.parseDouble(inputField.getText());
            double radians = Math.toRadians(degrees);
            double asquare = (1) - (Math.sin(radians) * Math.sin(radians));
            localResult = Math.sqrt(asquare);
            inputField.setText("");
            inputField.setText(inputField.getText() + localResult);

            buttonListener.setCurrentState(buttonListener.getResultShownState());

        }
        if (cmd.equals("TAN")) {

            double degrees = Double.parseDouble(inputField.getText());
            double radians = Math.toRadians(degrees);
            localResult = Math.tan(radians);
            inputField.setText("");
            inputField.setText(inputField.getText() + localResult);

            buttonListener.setCurrentState(buttonListener.getResultShownState());

        }
        if (cmd.equals("=")) {
            buttonListener.setSecond(Double.parseDouble(inputField.getText()));


            double first = buttonListener.getFirst();
            double second = buttonListener.getSecond();

            double result = 0;

            switch (buttonListener.getOperation()) {
                case '+':
                    result = first + second;
                    break;
                case '-':
                    result = first - second;
                    break;
                case '/':
                    result = first / second;
                    break;
                case '*':
                    result = first * second;
                    break;
            }
            inputField.setText("");
            inputField.setText(inputField.getText() + result);
            buttonListener.setResult(result);

            buttonListener.setCurrentState(buttonListener.getResultShownState());

        }
        if (cmd.equals("n!")) {

            localResult = fact(Double.parseDouble(inputField.getText()));
            inputField.setText("");
            inputField.setText(inputField.getText() + localResult);

        }
        inputField.requestFocus();

    }

    double fact(double x) {
        if (x == 0)
            return 1;
        else
            return(x * fact(x-1));
    }


}
