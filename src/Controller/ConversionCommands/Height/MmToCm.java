package Controller.ConversionCommands.Height;

import Controller.ConversionCommands.ConversionCommand;

public class MmToCm implements ConversionCommand {
    @Override
    public double Execute(double first) {
        return first * 0.1;

    }

    @Override
    public double unExecute(double first) {
        return first / 0.1;

    }
}
