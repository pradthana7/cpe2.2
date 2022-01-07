package Lab3_3;
import java.util.Scanner;
public class CrossedBox {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, row, col;
        String [][] arr;
        do{
            System.out.println("Enter a number:");
            n = sc.nextInt();
        }while(!(n % 2 == 1));

        arr = new String [n][n];
        for(row = 0; row < n; row++){
            for(col =0; col < n; col++){
                if((row == 0) || (row == n-1) || (row == col) || (row + col == n-1) || (col == n-1) || (col == 0)){
                    arr[row][col] = " *";
                }else{
                    arr[row][col] = "  ";
                }
            }
        }
        for(row = 0; row < arr.length; row++){
            for(col =0; col < arr[row].length; col++){
                System.out.print(arr[row][col]);
            }
            System.out.println();
        }
        sc.close();
    }  
}
