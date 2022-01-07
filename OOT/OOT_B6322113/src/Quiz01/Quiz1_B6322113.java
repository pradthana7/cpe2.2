package Quiz01;
import java.lang.Math;
import java.util.Scanner;
public class Quiz1_B6322113 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("a : ");
        int a = sc.nextInt();
        double b = (double)a/2.0; // cast to double เพื่อให้ถูกหลักการเขียน ถ้าใช้เป็น float จะติดสีแดง
        float area = (float)((Math.pow(a,2)) - (Math.PI*(Math.pow((b),2))));
        
        System.out.println("The highlighted area is "+ area);
        sc.close();

    }
    
}
