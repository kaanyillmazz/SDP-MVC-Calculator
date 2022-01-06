package Controller;

import javax.swing.*;

//this state is for when user is operating and
//input field does not need a reset
public class OperatingState implements State {

    CalculatorButtonListener calculatorButtonListener;
    JTextField inputField;
    JLabel info;

    boolean wasReversed;
    boolean isDecimal;
    double localResult;


    OperatingState(CalculatorButtonListener calculatorButtonListener) {
        this.calculatorButtonListener = calculatorButtonListener;
        this.inputField = calculatorButtonListener.inputField;
        this.info = calculatorButtonListener.info;

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
            calculatorButtonListener.setCurrentState(calculatorButtonListener.getEmptyState());
            calculatorButtonListener.setFirst(0);
            calculatorButtonListener.setSecond(0);
            calculatorButtonListener.setResult(0);
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
            calculatorButtonListener.setFirst(Double.parseDouble(inputField.getText()));
            inputField.setText("");
            calculatorButtonListener.setOperation('+');
            isDecimal = false;
            wasReversed = false;
            inputField.requestFocus();
        }
        if (cmd.equals("-")) {
            wasReversed = false;
            isDecimal = false;
            calculatorButtonListener.setFirst(Double.parseDouble(inputField.getText()));
            inputField.setText("");
            calculatorButtonListener.setOperation('-');
            inputField.requestFocus();
        }
        if (cmd.equals("/")) {
            wasReversed = false;
            isDecimal = false;
            calculatorButtonListener.setFirst(Double.parseDouble(inputField.getText()));
            calculatorButtonListener.setOperation('/');
            inputField.setText("");
            inputField.requestFocus();
        }
        if (cmd.equals("*")) {
            wasReversed = false;
            isDecimal = false;
            calculatorButtonListener.setFirst(Double.parseDouble(inputField.getText()));
            calculatorButtonListener.setOperation('*');
            inputField.setText("");
            inputField.requestFocus();
        }
        if (cmd.equals("MC")) {
            calculatorButtonListener.setMemoryFull(false);
            calculatorButtonListener.setMemory(0);
            inputField.setText("");
            info.setText("memory clr");
        }
        if (cmd.equals("MR")) {
            inputField.setText("");
            inputField.setText(inputField.getText() + calculatorButtonListener.getMemory());
            info.setText("memory recall: " + inputField.getText());
            calculatorButtonListener.setCurrentState(calculatorButtonListener.getResultShownState());
        }
        if (cmd.equals("M+")) {
            //check if the memory is empty
            if (!calculatorButtonListener.isMemoryFull()) {
                calculatorButtonListener.setMemory(Double.parseDouble(inputField.getText()));
                calculatorButtonListener.setMemoryFull(true);
                info.setText("memory-empty-Set: " + inputField.getText());
            } else {
                calculatorButtonListener.setMemory(calculatorButtonListener.getMemory() + Double.parseDouble(inputField.getText()));
                info.setText("M+: " + calculatorButtonListener.getMemory());
            }
        }
        if (cmd.equals("M-")) {
            //check if the memory is empty
            if (!calculatorButtonListener.isMemoryFull()) {
                calculatorButtonListener.setMemory(Double.parseDouble(inputField.getText()));
                calculatorButtonListener.setMemoryFull(true);
                info.setText("memory-empty-Set: " + inputField.getText());
            } else {
                calculatorButtonListener.setMemory(calculatorButtonListener.getMemory() - Double.parseDouble(inputField.getText()));
                info.setText("M-: " + calculatorButtonListener.getMemory());
            }
        }
        if (cmd.equals("MS")) {
            calculatorButtonListener.setMemory(Double.parseDouble(inputField.getText()));
            calculatorButtonListener.setMemoryFull(true);
            info.setText("memory store: " + inputField.getText());
        }
        if (cmd.equals("Sqrt")) {
                localResult = Math.sqrt(Double.parseDouble(inputField.getText()));
                inputField.setText("");
                inputField.setText(inputField.getText() + localResult);
            calculatorButtonListener.setCurrentState(calculatorButtonListener.getResultShownState());

        }
        if (cmd.equals("SIN")) {
            double degrees = Double.parseDouble(inputField.getText());
            double radians = Math.toRadians(degrees);
            localResult = Math.sin(radians);
            inputField.setText("");
            inputField.setText(inputField.getText() + localResult);
            calculatorButtonListener.setCurrentState(calculatorButtonListener.getResultShownState());
        }
        if (cmd.equals("COS")) {
            double degrees = Double.parseDouble(inputField.getText());
            double radians = Math.toRadians(degrees);
            double asquare = (1) - (Math.sin(radians) * Math.sin(radians));
            localResult = Math.sqrt(asquare);
            inputField.setText("");
            inputField.setText(inputField.getText() + localResult);
            calculatorButtonListener.setCurrentState(calculatorButtonListener.getResultShownState());

        }
        if (cmd.equals("TAN")) {
            double degrees = Double.parseDouble(inputField.getText());
            double radians = Math.toRadians(degrees);
            localResult = Math.tan(radians);
            inputField.setText("");
            inputField.setText(inputField.getText() + localResult);
            calculatorButtonListener.setCurrentState(calculatorButtonListener.getResultShownState());
        }
        if (cmd.equals("=")) {
            calculatorButtonListener.setSecond(Double.parseDouble(inputField.getText()));

            double first = calculatorButtonListener.getFirst();
            double second = calculatorButtonListener.getSecond();
            double result = 0;

            switch (calculatorButtonListener.getOperation()) {
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
            calculatorButtonListener.setResult(result);
            calculatorButtonListener.setCurrentState(calculatorButtonListener.getResultShownState());
        }
        if (cmd.equals("n!")) {
            localResult = fact(Double.parseDouble(inputField.getText()));
            inputField.setText("");
            inputField.setText(inputField.getText() + localResult);
        }
        inputField.requestFocus();
    }
    double fact(double x) {
        if(x < 1 && x > 0) {
            return 0;
        }
        if (x == 0)
            return 1;
        else
            return(x * fact(x-1));
    }
}
