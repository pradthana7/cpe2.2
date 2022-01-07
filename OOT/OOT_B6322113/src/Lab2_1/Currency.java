package Lab2_1;

import java.util.Scanner;

public class Currency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter currency:");
        String cur = sc.next();
        double total = 0;
        if(cur.equals("JPY")){ 
            System.out.println("How much?");
            float amount = sc.nextFloat();
            total = amount*0.3;
        }else if(cur.equals("USD")){
            System.out.println("How much?");
            float amount = sc.nextFloat();
            total = amount*33.58;
        }else{
            System.out.println("Please choose the proper currency");
        }
        System.out.println("You earn "+ (float)total+" THB"); //String.format("%.01f", total)
        sc.close();
    }
    
}
// String sf1=String.format("name is %s",name); 