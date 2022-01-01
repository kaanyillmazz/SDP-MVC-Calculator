package Controller;

import javax.swing.*;

public class OperatingState implements State{
    ButtonListener buttonListener;
    JTextField tfield;
    JLabel info;

    boolean wasReversed;
    boolean isDecimal;
    double localResult;





    OperatingState(ButtonListener buttonListener) {
        this.buttonListener = buttonListener;
        this.tfield = buttonListener.tfield;
        this.info = buttonListener.info;

    }
    public void Execute(String s) {

        if (s.equals("1")) {
                tfield.setText(tfield.getText() + "1");

        }
        if (s.equals("2")) {
                tfield.setText(tfield.getText() + "2");

        }
        if (s.equals("3")) {
                tfield.setText(tfield.getText() + "3");
        }

        if (s.equals("4")) {

            tfield.setText(tfield.getText() + "4");

        }
        if (s.equals("5")) {

                tfield.setText(tfield.getText() + "5");

        }
        if (s.equals("6")) {
            tfield.setText(tfield.getText() + "6");

        }
        if (s.equals("7")) {

                tfield.setText(tfield.getText() + "7");

        }
        if (s.equals("8")) {
                tfield.setText(tfield.getText() + "8");
        }
        if (s.equals("9")) {

                tfield.setText(tfield.getText() + "9");

        }
        if (s.equals("0")) {

                tfield.setText(tfield.getText() + "0");

        }
        if (s.equals("AC")) {
            tfield.setText("");
            wasReversed = false;
            isDecimal = false;

            buttonListener.setCurrentState(buttonListener.getEmptyState());
            buttonListener.setFirst(0);
            buttonListener.setSecond(0);
            buttonListener.setResult(0);
        }
        if (s.equals("log")) {

                localResult = Math.log(Double.parseDouble(tfield.getText()));
                tfield.setText("");
                tfield.setText(tfield.getText() + localResult);

        }
        if (s.equals("1/x")) {

                localResult = 1 / Double.parseDouble(tfield.getText());
                tfield.setText("");
                tfield.setText(tfield.getText() + localResult);

        }
        if (s.equals("Exp")) {

                localResult = Math.exp(Double.parseDouble(tfield.getText()));
                tfield.setText("");
                tfield.setText(tfield.getText() + localResult);

        }
        if (s.equals("x^2")) {

                localResult = Math.pow(Double.parseDouble(tfield.getText()), 2);
                tfield.setText("");
                tfield.setText(tfield.getText() + localResult);

        }
        if (s.equals("x^3")) {

                localResult = Math.pow(Double.parseDouble(tfield.getText()), 3);
                tfield.setText("");
                tfield.setText(tfield.getText() + localResult);

        }
        if (s.equals("+/-")) {
            if (!wasReversed) {
                tfield.setText("-" + tfield.getText());
                wasReversed = true;
            } else {
                String full = tfield.getText();
                String substr = full.substring(1);
                tfield.setText(substr);
                wasReversed = false;
            }
        }
        if (s.equals(".")) {
            if (!isDecimal) {
                tfield.setText(tfield.getText() + ".");
                isDecimal = true;
            } else {
                tfield.setText(tfield.getText());
            }
        }
        if (s.equals("+")) {

                buttonListener.setFirst(Double.parseDouble(tfield.getText()));
                tfield.setText("");
            buttonListener.setOperation('+');
            isDecimal = false;
            wasReversed = false;

            tfield.requestFocus();
        }
        if (s.equals("-")) {

            wasReversed = false;
            isDecimal = false;
            buttonListener.setFirst(Double.parseDouble(tfield.getText()));
            tfield.setText("");
            buttonListener.setOperation('-');

            tfield.requestFocus();
        }
        if (s.equals("/")) {
            wasReversed = false;
            isDecimal = false;
            buttonListener.setFirst(Double.parseDouble(tfield.getText()));
            buttonListener.setOperation('/');
                tfield.setText("");

            tfield.requestFocus();
        }
        if (s.equals("*")) {

            wasReversed = false;
            isDecimal = false;
            buttonListener.setFirst(Double.parseDouble(tfield.getText()));
            buttonListener.setOperation('*');
                tfield.setText("");

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
            if (tfield.getText().equals("")) {
                tfield.setText("");
            } else {
                localResult = Math.sqrt(Double.parseDouble(tfield.getText()));
                tfield.setText("");
                tfield.setText(tfield.getText() + localResult);
            }
        }
        if (s.equals("SIN")) {

                double degrees = Double.parseDouble(tfield.getText());
                double radians = Math.toRadians(degrees);
                localResult = Math.sin(radians);
                tfield.setText("");
                tfield.setText(tfield.getText() + localResult);

                buttonListener.setCurrentState(buttonListener.getResultShownState());

        }
        if (s.equals("COS")) {

                double degrees = Double.parseDouble(tfield.getText());
                double radians = Math.toRadians(degrees);
                double asquare = (1) - (Math.sin(radians)*Math.sin(radians) );
                localResult = Math.sqrt(asquare);
                tfield.setText("");
                tfield.setText(tfield.getText() + localResult);

            buttonListener.setCurrentState(buttonListener.getResultShownState());

        }
        if (s.equals("TAN")) {

                double degrees = Double.parseDouble(tfield.getText());
                double radians = Math.toRadians(degrees);
                localResult = Math.tan(radians);
                tfield.setText("");
                tfield.setText(tfield.getText() + localResult);

            buttonListener.setCurrentState(buttonListener.getResultShownState());

        }
        if (s.equals("=")) {
            buttonListener.setSecond(Double.parseDouble(tfield.getText()));


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
                tfield.setText("");
                tfield.setText(tfield.getText() + result);
                buttonListener.setResult(result);

            buttonListener.setCurrentState(buttonListener.getResultShownState());

        }
        if (s.equals("n!")) {

                localResult = fact(Double.parseDouble(tfield.getText()));
                tfield.setText("");
                tfield.setText(tfield.getText() + localResult);

        }
        tfield.requestFocus();

    }
    double fact(double x) {
        int er = 0;
        if (x < 0) {
            er = 20;
            return 0;
        }
        double i, s = 1;
        for (i = 2; i <= x; i += 1.0)
            s *= i;
        return s;
    }


}
