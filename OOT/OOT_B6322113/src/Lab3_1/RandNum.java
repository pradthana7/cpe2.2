package Lab3_1;
import java.util.*; //1
public class RandNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int[] arr1 = new int[10];
        int min = 10, max = 50;
        for(int i = 0; i < arr1.length ; i++){ //2
            arr1[i] = rand.nextInt(max-min+1)+ min; //3
        }
        System.out.println("The array is ");
        for(int a : arr1){ //4
            System.out.print(a + " ");
        }
        System.out.print("\nThe number, where the last digit" +
                " is greater than or equal to five, are ");
        for(int a : arr1){ //5
            int num = a % 10; //6
            if (num >= 5){
                System.out.print(a + " ");
            }
        }
        sc.close();
    }
}
