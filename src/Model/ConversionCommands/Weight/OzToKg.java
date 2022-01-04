package Model.ConversionCommands.Weight;

import Model.ConversionCommands.ConversionCommand;

public class OzToKg implements ConversionCommand {
    @Override
    public double Execute(double first) {
        return first / 35.274;
    }

    @Override
    public double unExecute(double first) {
        return first * 35.274;
    }
}
