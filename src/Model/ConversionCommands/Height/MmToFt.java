package Model.ConversionCommands.Height;

import Model.ConversionCommands.ConversionCommand;

public class MmToFt  implements ConversionCommand {
    @Override
    public double Execute(double first) {
        return first * 0.00328084;
    }

    @Override
    public double unExecute(double first) {
        return first / 0.00328084;
    }
}
