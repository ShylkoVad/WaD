package by.teachmeskills.homeworks.hw_03032023.transport;

public abstract class Transport {

    private int power;
    private int speedMax;
    private int weight;
    private String brand;

    protected Transport(int power, int speedMax, int weight, String brand) {
        this.power = power;
        this.speedMax = speedMax;
        this.weight = weight;
        this.brand = brand;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getSpeedMax() {
        return speedMax;
    }

    public void setSpeedMax(int speedMax) {
        this.speedMax = speedMax;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Transport{" +
                "power=" + power +
                ", speedMax=" + speedMax +
                ", weight=" + weight +
                ", brand='" + brand + '\'' +
                '}';
    }

    protected abstract void power();

    protected abstract void speedMax();

    protected abstract void weight();

    protected abstract void brand();


}
