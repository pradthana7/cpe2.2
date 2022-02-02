package week8.lab6_1;

public class Dog extends Animal{ //2
    public Dog(){
        System.out.println("New Dog object is created.");
    }

    public Dog(String name, String colour){
        super(name,colour); //3
        System.out.println(super.getName() + " is a " + super.getColour() + " dog.");
    }

    public void makeNoise(){ //4
        System.out.println("Dog is barking.");
    }
}
