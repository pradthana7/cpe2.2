package Test1;

public class Pizza {
    private String customer;
    private Base base;
    private Topping topping;
    private double price;

    public Pizza(){

    }
    public Pizza(String customer, Base base, Topping topping, double price){
        this.customer = customer;
        this.base = base;
        this.topping = topping;
        this.price = price;
        
    }
    public Pizza(String customer){
        this.customer = customer;
    }
    public void base(Base base){
        this.base = base;
    }
    public String getCustomer() {
        return customer;
    }
    public Topping getTopping() {
        return topping;
    }
    public void setTopping(Topping topping) {
        this.topping = topping;
    }
    public Base getBase() {
        return base;
    }
    public void setBase(Base base) {
        this.base = base;
    }
    public void setCustomer(String customer) {
        this.customer = customer;
    }
    public void discount(int dis){
        price = base.getPrice() + topping.getPrice();
        if( dis >= 1 && dis <= 50){
            price = price - (price * (dis / 100.0)); 
        }else{
            price = price - (price * (50 / 100.0));
        }
        System.out.println(price);
    }
    public void summary(){
        System.out.println("========== YOUR PIZZA ORDER ==========");
        System.out.println("Costomer: " + getCustomer());
        System.out.println("Base: " + base.getName());
        System.out.println("Topping: " + topping.getName());
        System.out.print("Total price: ");
    }
}
