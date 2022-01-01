package Controller.ConversionCommands.Temp;

import Controller.ConversionCommands.ConversionCommand;

public class CToK implements ConversionCommand {
    @Override
    public double Execute(double first) {
        return first +273.15;
    }

    @Override
    public double unExecute(double first) {
        return first - 273.15;
    }
}
