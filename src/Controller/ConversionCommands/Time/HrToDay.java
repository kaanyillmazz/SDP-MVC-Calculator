package Controller.ConversionCommands.Time;

import Controller.ConversionCommands.ConversionCommand;

public class HrToDay implements ConversionCommand {
    @Override
    public double Execute(double first) {
        return first / 24;
    }

    @Override
    public double unExecute(double first) {
        return first * 24;
    }
}
