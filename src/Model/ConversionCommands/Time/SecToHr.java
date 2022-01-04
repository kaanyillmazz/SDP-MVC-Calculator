package Model.ConversionCommands.Time;

import Model.ConversionCommands.ConversionCommand;

public class SecToHr implements ConversionCommand {
    @Override
    public double Execute(double first) {
        return first / 3600;
    }

    @Override
    public double unExecute(double first) {
        return first * 3600;
    }
}
