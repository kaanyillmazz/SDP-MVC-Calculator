package Model.ConversionCommands.Height;

import Model.ConversionCommands.ConversionCommand;

public class CmToIn implements ConversionCommand {
    @Override
    public double Execute(double first) {
        return first * 0.3937007874;
    }

    @Override
    public double unExecute(double first) {
        return first / 0.3937007874;
    }
}
