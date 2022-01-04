package Model.ConversionCommands.Time;

import Model.ConversionCommands.ConversionCommand;

public class SecToMin implements ConversionCommand {
    @Override
    public double Execute(double first) {
        return first / 60;
    }

    @Override
    public double unExecute(double first) {
        return first * 60;
    }
}
