package Quiz01;
import java.util.Scanner;
public class Quiz2_B6322113 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a num : ");
        double d;
        d = sc.nextDouble();
        int n = (int)d;
        if((n == d) && !(n == 0) ){
            if(n % 2 == 0){
               System.out.println(n +" is an even number"); 
            }else{
                System.out.println(n +" is an odd number");
            }
            
        }else {
            if(n>0){
                System.out.println((float)d +" is a positive number"); 
             }else if(n<0){
                 System.out.println((float)d +" is a nagative number");
            }else{
                System.out.println(n +" is zero");
            }
            sc.close();
        }
    }
    
    
}
