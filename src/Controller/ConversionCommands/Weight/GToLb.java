package Controller.ConversionCommands.Weight;

import Controller.ConversionCommands.ConversionCommand;

public class GToLb implements ConversionCommand {
    @Override
    public double Execute(double first) {
        return first / 454;
    }

    @Override
    public double unExecute(double first) {
        return first * 454;
    }
}
