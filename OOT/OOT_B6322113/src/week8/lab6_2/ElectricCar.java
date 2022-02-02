package week8.lab6_2;

public class ElectricCar extends Car{
    private String battery = "";
    public ElectricCar(){

    }
    public ElectricCar(String brand, String colour, String year, String modle, String bodyStyle, String battery){
        super(brand, colour, year, modle, bodyStyle);
        this.battery = battery;
    }

    public String getBattery() {
        return battery;
    }
    public void setBattery(String battery) {
        this.battery = battery;
    }
     
    public void printDetail(){
        super.printDetail();
        System.out.println("Battery Capacity: " + getBattery() + " kWh");
      
    }
}
