package Controller.ConversionCommands.Weight;

import Controller.ConversionCommands.ConversionCommand;

public class KgToLb implements ConversionCommand {
    @Override
    public double Execute(double first) {
        return first * 2.205;
    }

    @Override
    public double unExecute(double first) {
        return first / 2.205;
    }
}
