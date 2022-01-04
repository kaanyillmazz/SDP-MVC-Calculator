package Controller;
import javax.swing.*;

//this state is for when input field is empty
public class EmptyState implements State {

    CalculatorButtonListener calculatorButtonListener;
    JTextField inputField;
    JLabel info;

    EmptyState(CalculatorButtonListener calculatorButtonListener) {
        this.calculatorButtonListener = calculatorButtonListener;
        this.inputField = calculatorButtonListener.inputField;
        this.info = calculatorButtonListener.info;
    }

    public void Execute(String cmd) {
        if (cmd.equals("1")) {
            inputField.setText(inputField.getText() + "1");
            calculatorButtonListener.setCurrentState(calculatorButtonListener.getOperatingState());
        }
        if (cmd.equals("2")) {
            inputField.setText(inputField.getText() + "2");
            calculatorButtonListener.setCurrentState(calculatorButtonListener.getOperatingState());
        }
        if (cmd.equals("3")) {
            inputField.setText(inputField.getText() + "3");
            calculatorButtonListener.setCurrentState(calculatorButtonListener.getOperatingState());
        }
        if (cmd.equals("4")) {
            inputField.setText(inputField.getText() + "4");
            calculatorButtonListener.setCurrentState(calculatorButtonListener.getOperatingState());
        }
        if (cmd.equals("5")) {
            inputField.setText(inputField.getText() + "5");
            calculatorButtonListener.setCurrentState(calculatorButtonListener.getOperatingState());
        }
        if (cmd.equals("6")) {
            inputField.setText(inputField.getText() + "6");
            calculatorButtonListener.setCurrentState(calculatorButtonListener.getOperatingState());
        }
        if (cmd.equals("7")) {
            inputField.setText(inputField.getText() + "7");
            calculatorButtonListener.setCurrentState(calculatorButtonListener.getOperatingState());
        }
        if (cmd.equals("8")) {
            inputField.setText(inputField.getText() + "8");
            calculatorButtonListener.setCurrentState(calculatorButtonListener.getOperatingState());
        }
        if (cmd.equals("9")) {
            inputField.setText(inputField.getText() + "9");
            calculatorButtonListener.setCurrentState(calculatorButtonListener.getOperatingState());
        }
        if (cmd.equals("0")) {
            inputField.setText(inputField.getText() + "0");
            calculatorButtonListener.setCurrentState(calculatorButtonListener.getOperatingState());
        }
        if (cmd.equals("AC")) {
            calculatorButtonListener.setFirst(0);
            calculatorButtonListener.setSecond(0);
            calculatorButtonListener.setResult(0);
            inputField.setText("");
        }
        if (cmd.equals("log")) {
            //can't do these operations on nonexistent number
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
            calculatorButtonListener.setFirst(0);
            calculatorButtonListener.setOperation('+');
            inputField.requestFocus();
        }
        if (cmd.equals("-")) {
            inputField.setText("");
            calculatorButtonListener.setFirst(0);
            calculatorButtonListener.setOperation('-');
            inputField.requestFocus();
        }
        if (cmd.equals("/")) {
            inputField.setText("");
            calculatorButtonListener.setFirst(1);
            calculatorButtonListener.setOperation('/');
            inputField.requestFocus();
        }
        if (cmd.equals("*")) {
            inputField.setText("");
            calculatorButtonListener.setFirst(1);
            calculatorButtonListener.setOperation('*');
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
            //you can't add nothing to memory variable
            inputField.setText("");
            info.setText("m: can't add nothing " + inputField.getText());
        }
        if (cmd.equals("M-")) {
            //you can't subtract nothing from memory variable
            inputField.setText("");
            info.setText("m: can't subtract nothing " + inputField.getText());
        }
        if (cmd.equals("MS")) {
            //you can't store nothing as memory variable
            inputField.setText("");
            info.setText("m: can't store nothing" + inputField.getText());
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
