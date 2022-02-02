package week8.lab6_2;

public class Aeroplane extends Vehicle{
    private String propulsion = "";
    public Aeroplane(){

    }
    public Aeroplane(String brand, String colour, String year, String model, String propulsion){
        super(brand, colour, year, model);
        this.propulsion = propulsion;
    }
    public String getPropulsion() {
        return propulsion;
    }
    public void setPropulsion(String propulsion) {
        this.propulsion = propulsion;
    }
    public void printDetail(){
        super.printDetail();
        System.out.println("Propulsions: " + getPropulsion());
        
        
    }

}
