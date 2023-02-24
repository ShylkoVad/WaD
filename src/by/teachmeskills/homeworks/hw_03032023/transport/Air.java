package by.teachmeskills.homeworks.hw_03032023.transport;

public abstract class Air extends Transport {
    public Air(int power, int speedMax, int weight, String brand) {
        super(power, speedMax, weight, brand);
    }

    protected int wingspan;
    protected int stripLengthMin;

    public Air(int power, int speedMax, int weight, String brand, int stripLengthMin) {
        super(power, speedMax, weight, brand);
        this.stripLengthMin = stripLengthMin;
    }

    public int getWingspan() {
        return wingspan;
    }

    public void setWingspan(int wingspan) {
        this.wingspan = wingspan;
    }

    public int getStripLengthMin() {
        return stripLengthMin;
    }

    public void setStripLengthMin(int stripLengthMin) {
        this.stripLengthMin = stripLengthMin;
    }
    protected abstract void wingspan();
    protected abstract void stripLengthMin();
}
