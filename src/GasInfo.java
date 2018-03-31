import java.util.Date;

public interface GasInfo {
    int getLitresGasConsumption(Date from, Date to);
    int getGasCost(Date from, Date to);
}
