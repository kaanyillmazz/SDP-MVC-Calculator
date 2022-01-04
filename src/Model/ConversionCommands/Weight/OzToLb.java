package Model.ConversionCommands.Weight;

import Model.ConversionCommands.ConversionCommand;

public class OzToLb implements ConversionCommand {
    @Override
    public double Execute(double first) {
        return first / 16;
    }

    @Override
    public double unExecute(double first) {
        return first * 16;
    }
}
