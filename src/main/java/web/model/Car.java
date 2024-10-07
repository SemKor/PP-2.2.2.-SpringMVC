package web.model;


public class Car {
    private String model;
    private int year;
    private int milage;

    public Car(String model, int year, int milage) {
        this.model = model;
        this.year = year;
        this.milage = milage;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMilage() {
        return milage;
    }

    public void setMilage(int milage) {
        this.milage = milage;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", year=" + year +
                ", milage=" + milage +
                '}';
    }
}
