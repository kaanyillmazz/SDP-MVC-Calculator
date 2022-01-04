package Model.ConversionCommands.Time;

import Model.ConversionCommands.ConversionCommand;

public class MinToDay implements ConversionCommand {
    @Override
    public double Execute(double first) {
        return first / 1440;
    }

    @Override
    public double unExecute(double first) {
        return first * 1440;
    }
}
