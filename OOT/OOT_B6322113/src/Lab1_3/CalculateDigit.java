package Lab1_3;
import java.util.Scanner;

public class CalculateDigit {
    public static void main(String[] args){
        int n1,n2,n3,n4;
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a four-digit integer: ");
        int a = sc.nextInt();
        n1 = a / 1000;
        n2 = a / 100 % 10;
        n3 = a / 10 % 10;
        n4 = a % 10;
        float ans = (float)(n1*n4)/(n2+n3) ;
        sc.close();
       
        System.out.println("The result of all digits in " + a +" is "+ ans);
        /* System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);
        System.out.println(n4);
        System.out.println(ans); */

    }
    
}
