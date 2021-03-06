package entities;

/**
 * Created by prajapas on 7/13/2017.
 */
public class Vehicle {
    private String vehicle_type;
    private String vehicle_model;
    private int number;
    private double price;
    private double tax;

    public Vehicle(String vehicle_type, String vehicle_model, int number, double price, double tax) {
        this.vehicle_type = vehicle_type;
        this.vehicle_model = vehicle_model;
        this.number = number;
        this.price = price;
        this.tax = tax;
    }

    public String getVehicle_type() {
        return vehicle_type;
    }

    public void setVehicle_type(String vehicle_type) {
        this.vehicle_type = vehicle_type;
    }

    public String getVehicle_model() {
        return vehicle_model;
    }

    public void setVehicle_model(String vehicle_model) {
        this.vehicle_model = vehicle_model;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }
}
