package Lab4_2;
// ver.1
import java.util.Scanner;
public class GetAndPay {
    public static void summary(){
        Scanner sc = new Scanner(System.in);
        float balance = 1000.0f, income = 0.0f, expense = 0.0f; 
        Boolean exit = false;
        while(!(exit)){ 
            System.out.print("Option: ");
            String op = sc.next();
        switch(op){
            case "+":
                System.out.print("List: "); sc.next();
                String list = sc.nextLine();
                System.out.print("Amount of money: ");
                income += sc.nextFloat(); 
                break;
            case "-":
                System.out.print("List: "); sc.next();
                String list1 = sc.nextLine();
                System.out.print("Amount of money: ");
                expense += sc.nextFloat();
                break;
            case "0":
                exit = true;
                break;
            default : System.out.println("Invalid option!");
        }
    }
    sc.close();
        balance = balance + income - expense;
        System.out.println("Amount of income: "+ income);
        System.out.println("Amount of expense: " +  expense);
        System.out.println("Remaining balance: " + balance + " Baht");
}
    public static void main(String[] args) {
        summary();
    }
}
