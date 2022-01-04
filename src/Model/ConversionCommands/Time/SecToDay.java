package Model.ConversionCommands.Time;


import Model.ConversionCommands.ConversionCommand;

public class SecToDay implements ConversionCommand {

    @Override
    public double Execute(double first) {
        return first / 86400;
    }

    @Override
    public double unExecute(double first) {
        return first * 86400;
    }
}
