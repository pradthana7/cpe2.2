package Test1;

public class Topping {
    private String name;
    private int price;
    public Topping(){

    }
    public Topping(String name, int price){
        this.name = name;
        this.price = price;
    }
    
    public int getPrice() {
        return price;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setPrice(int price) {
        this.price = price;
    }


}
