package Model.ConversionCommands.Weight;

import Model.ConversionCommands.ConversionCommand;

public class GToOz implements ConversionCommand {
    @Override
    public double Execute(double first) {
        return first / 28.35;
    }

    @Override
    public double unExecute(double first) {
        return first * 28.35;
    }
}
