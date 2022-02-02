package week8.lab6_2;

public class Vehicle {
    private String brand = "";
    private String colour = "";
    private String year = "";
    private String model = "";

    public Vehicle(){

    }

    public Vehicle(String brand, String colour, String year, String model){
        this.setBrand(brand);
        this.setColour(colour);
        this.setYear(year);
        this.setModel(model);
    }

    public String getModel() {
        return model;
    }

    public void setModel(String modle) {
        this.model = modle;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }    

    public void printDetail(){
        System.out.println("Vehicle: " + getClass().getSimpleName());
        System.out.println("Manufacturer: " + getBrand());
        System.out.println("Colour: " + getColour());
        System.out.println("Year: " + getYear());
        System.out.println("Model: " + getModel());     
    }


}
