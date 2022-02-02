package week8.lab6_1;

public class Animal {
    private String name = "";
    private String colour = "";

    public Animal(){
        System.out.println("New Animal object is created.");
    }

    public Animal(String name, String colour){ //1
        this.name = name;
        this.colour = colour;
        System.out.println("New Animal's name: " + this.name);
    }

    public void makeNoise(){
        System.out.println("Animal is making a noise.");
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getColour(){
        return colour;
    }
    public void setColour(String colour){
        this.colour = colour;
    }
}
