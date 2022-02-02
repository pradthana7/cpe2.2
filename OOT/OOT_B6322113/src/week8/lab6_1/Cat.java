package week8.lab6_1;

public class Cat extends Animal{ //5
    private String breed = "";

    public Cat(){
        System.out.println("New Cat object is created.");
    }

    public Cat(String name, String colour, String breed){
        super(name, colour); //6
        this.breed = breed;
        System.out.println(super.getName() + " is a " + super.getColour() + " " + this.breed + " cat."); 
    }

    public void makeNoise(){ //8
        System.out.println("Cat is meowing.");
    }
}
