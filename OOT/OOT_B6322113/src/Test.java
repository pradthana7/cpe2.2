/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Pradthana
 */
import java.util.Scanner;
public class Test {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num : ");
        double d;
        d = sc.nextFloat();
        int n = (int)d;
        
        String result1 = (n >= 0)? "บวก  ": "ลบ  " ;
        String result2 = (n == d)? "จำนวนเต็ม  " : "จำนวนจริง  ";
        String result3 = (n % 2 == 0)? "เลขคู่  ": "เลขคี่  ";
        //output
        System.out.print(result1);
        System.out.print(result2);
        System.out.print(result3);
        
    }
    
}
