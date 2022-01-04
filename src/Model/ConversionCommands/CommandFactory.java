package Model.ConversionCommands;

public interface CommandFactory {
    public ConversionCommand Create(ConversionType conversionType);
}
