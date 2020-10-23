package web.model;

public class Car {

    private String carModel;
    private String carColor;
    private int carSeries;

    public Car() {}

    public Car(String carModel, String carColor, int carSeries) {
        this.carModel = carModel;
        this.carColor = carColor;
        this.carSeries = carSeries;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public String getCarColor() {
        return carColor;
    }

    public void setCarColor(String carColor) {
        this.carColor = carColor;
    }

    public int getCarSeries() {
        return carSeries;
    }

    public void setCarSeries(int carSeries) {
        this.carSeries = carSeries;
    }

    @Override
    public String toString() {
        return "Car{" +
                "carModel='" + carModel + '\'' +
                ", carColor='" + carColor + '\'' +
                ", carSeries=" + carSeries +
                '}';
    }
}
