package web.model;

import java.util.ArrayList;
import java.util.List;

public class Car {
    private String model;
    private int series;
    private String color;

    public Car() {
    }

    public Car(String model, int series, String color) {
        this.model = model;
        this.series = series;
        this.color = color;
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

    public String getColor() {
        return color;
    }

    public void setQuantity(String color) {
        this.color = color;
    }

    public List<Car> get5Cars() {
        List<Car> cars = new ArrayList<>();

        cars.add(new Car("Tuareg", 3, "red"));
        cars.add(new Car("Mondeo", 6, "green"));
        cars.add(new Car("Rio", 2, "grey"));
        cars.add(new Car("Solaris", 1, "black"));
        cars.add(new Car("Matiz", 11, "cyan"));

        return cars;
    }
}