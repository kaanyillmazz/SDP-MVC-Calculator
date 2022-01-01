package Controller.ConversionCommands.Height;

import Controller.ConversionCommands.ConversionCommand;

public class InToFt implements ConversionCommand {

    @Override
    public double Execute(double first) {
        return first/12;
    }

    @Override
    public double unExecute(double first) {
        return first * 12;
    }
}
