package Model.ConversionCommands.Weight;

import Model.ConversionCommands.ConversionCommand;

public class GToKg implements ConversionCommand {

    @Override
    public double Execute(double first) {
        return first / 1000;
    }

    @Override
    public double unExecute(double first) {
        return first * 1000;
    }
}
