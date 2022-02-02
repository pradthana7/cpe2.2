package week8.lab6_2;

public class Car extends Vehicle{
    private String bodyStyle = "";

    public Car(){

    }

    public Car(String brand, String colour, String year, String model, String bodyStyle){
        super(brand, colour, year, model);
        this.bodyStyle = bodyStyle;
    }

    public String getBodyStyle() {
        return bodyStyle;
    }

    public void setBodyStyle(String bodyStyle) {
        this.bodyStyle = bodyStyle;
    }

    public void printDetail(){
        super.printDetail();
        System.out.println("Body Style: " + getBodyStyle());
        
        
    }
}
