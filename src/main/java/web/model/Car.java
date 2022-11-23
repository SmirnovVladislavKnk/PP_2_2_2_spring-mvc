package web.model;

public class Car {
    private String model;
    private int series;
    private String fuel;

    public Car() {
    }

    public Car(String model, int series, String fuel) {
        this.model = model;
        this.series = series;
        this.fuel = fuel;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", series=" + series +
                ", fuel='" + fuel + '\'' +
                '}';
    }
}
