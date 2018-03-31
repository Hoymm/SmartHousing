import java.util.Date;

public class House implements GasInfo {
    private HouseData houseData;

    public House(HouseData houseData) {
        this.houseData = houseData;
    }

    @Override
    public int getLitresGasConsumption(Date from, Date to) {
        // TODO
        return 0;
    }

    @Override
    public int getGasCost(Date from, Date to) {
        // TODO
        return 0;
    }
}
