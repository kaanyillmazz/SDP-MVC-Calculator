package Controller.ConversionCommands.Height;

import Controller.ConversionCommands.ConversionCommand;

public class MmToIn implements ConversionCommand {

    @Override
    public double Execute(double first) {
        return first * 0.03937007874;
    }

    @Override
    public double unExecute(double first) {
        return first / 0.03937007874;
    }
}
