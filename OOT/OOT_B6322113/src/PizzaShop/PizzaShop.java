package Test1;
import java.util.Scanner;
public class PizzaShop {
    public static void main(String[] args) {
         
        Scanner sc = new Scanner(System.in);
        Pizza p1 = new Pizza();
        boolean flat = false;
        boolean flat1 = false;
        boolean flat2 = false;

        Base base1 = new Base("thickly", 300);
        Base base2 = new Base("thinly", 200);

        Topping topping1 = new Topping("Pepperoni", 150);
        Topping topping2 = new Topping("Supreme", 175);
        Topping topping3 = new Topping("Hawaian", 200);
        Topping topping4 = new Topping("BBQ Meatlovers", 250);

        System.out.print("Welcom to Pizza Shop");
        System.out.print("Enter your name> ");
        String name = sc.next();
        p1.setCustomer(name);

        System.out.println("Please select your base\n1. Thickly\n2.thinly");
        int nbase = sc.nextInt();
        while(!flat){
            switch(nbase){
            case 1:   
                p1.setBase(base1);
                flat = true;
                break;
            case 2:
                flat = true;
                p1.setBase(base2);
                break;
            default:
                System.out.println("Please select your base\n1. Thickly\n2.thinly");
                nbase = sc.nextInt();
        }
    }
    System.out.println(p1.getCustomer() + " select " + p1.getBase().getName());
    System.out.println("price : ฿ " + p1.getBase().getPrice());
    System.out.println("\nPlease select your topping\n1. Pepperoni\n2.Supreme\n3. Hawaian\n4. BBQ Meatlovers");
    int ntopping = sc.nextInt();
    while(!flat1){
        switch(ntopping){
        case 1:
            p1.setTopping(topping1);
            flat1 = true;
            break;
        case 2: 
            p1.setTopping(topping2);
            flat1 = true;
            break;
        case 3:
            p1.setTopping(topping3);
            flat1 = true;
            break;
        case 4:
            p1.setTopping(topping4);
            flat1 = true;
            break;
        default:
        System.out.println("Please select your topping\n1. Pepperoni\n2.Supreme\n3. Hawaian\n4. BBQ Meatlovers");
        ntopping = sc.nextInt();
    }
}
    System.out.println(p1.getCustomer() + " select " + p1.getTopping().getName());
    System.out.println("price: \n฿ " +p1.getTopping().getPrice());

    System.out.println("Discount (%)");
    int discount = sc.nextInt();
    while(!flat2){
        if(discount < 1 || discount > 100){
            System.out.println("Discount (%)");
            discount = sc.nextInt();
        }else{
            flat2 = true;
           
            }
        }
    p1.summary();
    p1.discount(discount);

    sc.close();
    }
}
