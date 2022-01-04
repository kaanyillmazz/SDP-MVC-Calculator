package Model.ConversionCommands;

import Model.ConversionCommands.Height.*;
import Model.ConversionCommands.Temp.*;
import Model.ConversionCommands.Time.*;
import Model.ConversionCommands.Weight.*;

public class ConversionCommandFactory implements CommandFactory {


    @Override
    public ConversionCommand Create(ConversionType conversionType) {
        switch (conversionType) {
            case CmToFt:
                return new CmToFt();
            case CmToIn:
                return new CmToIn();
            case InToFt:
                return new InToFt();
            case MmToCm:
                return new MmToCm();
            case MmToFt:
                return new MmToFt();
            case MmToIn:
                return new MmToIn();
            case CToF:
                return new CToF();
            case CToK:
                return new CToK();
            case FToK:
                return new FToK();
            case HrToDay:
                return new HrToDay();
            case MinToDay:
                return new MinToDay();
            case MinToHr:
                return new MinToHr();
            case SecToDay:
                return new SecToDay();
            case SecToHr:
                return new SecToHr();
            case SecToMin:
                return new SecToMin();
            case GToKg:
                return new GToKg();
            case GToLb:
                return new GToLb();
            case GToOz:
                return new GToOz();
            case KgToLb:
                return new KgToLb();
            case OzToKg:
                return new OzToKg();
            case OzToLb:
                return new OzToLb();
            default:
                return null;
        }
    }
}
