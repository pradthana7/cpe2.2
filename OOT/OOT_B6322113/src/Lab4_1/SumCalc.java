package Lab4_1;

import java.util.Scanner;
public class SumCalc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int num = sc.nextInt();
        double sum = summation(num);
        System.out.printf("The sum of sequence is %.2f", sum);
    }
    static double summation(int num){
        double total = 0;
        for(int i = 1; i <= num; i++){  
            total = total + 2*((1.0/(3*i)));
        }
        return total;
    }
}
