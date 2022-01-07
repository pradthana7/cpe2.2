package Lab3_2;

import java.util.Scanner;

public class AverageScore {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n, count = 0, score;
        float sum = (float)0.0;

        System.out.print("Enter the number of students: ");
        n = sc.nextInt();
        do{
            System.out.print("Enter student score: ");
            score = sc.nextInt();
            
            if(score < 0 || score > 100){
                System.out.println("Please enter the score 0-100: ");
    
            }else{
                count += 1;
                sum += score;
            }

        }while(count < n);
        System.out.println(String.format("The average score is %.1f",(sum/n)));
        sc.close();
    }
}
