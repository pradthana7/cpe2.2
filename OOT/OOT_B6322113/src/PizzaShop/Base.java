package PizzaShop;

public class Base {
    private String name = "";
    private int price = 0;

    public Base(){

    }
    public Base(String name, int price){
        this.name = name;
        this.price = price;
        
    }
    public String getName() {
        return name;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public void setName(String name) {
        this.name = name;
    }
    

}
