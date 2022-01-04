package Model.ConversionCommands.Temp;

import Model.ConversionCommands.ConversionCommand;

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
