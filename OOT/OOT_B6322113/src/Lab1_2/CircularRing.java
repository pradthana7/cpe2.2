package Lab1_2;
import java.util.Scanner;
import java.lang.Math;
public class CircularRing {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("r1 : ");
        int r1 = sc.nextInt();
        System.out.print("r2 : ");
        int r2 = sc.nextInt();
        double a = Math.PI*(Math.pow(r1,2) - Math.pow(r2,2));
        

        System.out.println("The area is "+ a );

    }
    
}
