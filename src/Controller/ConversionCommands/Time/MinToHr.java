package Controller.ConversionCommands.Time;

import Controller.ConversionCommands.ConversionCommand;

public class MinToHr implements ConversionCommand {
    @Override
    public double Execute(double first) {
        return first / 60;
    }

    @Override
    public double unExecute(double first) {
        return first * 60;
    }
}
