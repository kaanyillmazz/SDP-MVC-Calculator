package Controller.ConversionCommands.Temp;

import Controller.ConversionCommands.ConversionCommand;

public class CToF implements ConversionCommand {
    @Override
    public double Execute(double first) {
        return (first * 9/5) + 32;
    }

    @Override
    public double unExecute(double first) {
        return (first - 32) / 9/5 ;
    }
}
