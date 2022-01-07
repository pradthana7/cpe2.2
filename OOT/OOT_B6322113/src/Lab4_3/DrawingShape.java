package Lab4_3;

import java.util.Scanner;
public class DrawingShape {
    static void drawTriangle(int row){
        //Scanner sc = new Scanner(System.in);
        for(int i = 0; i < row; i++ ){
            for(int j = row - i; j > 1;j--){
                System.out.print(" ");
            }
            for(int j =0 ; j <= i; j++){
                System.out.print("o ");
            }
            System.out.println();
        }
    }
    static void drawRectangle(int n){
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n;j++ ){
                System.out.print("o ");
            }
            System.out.println();
        }
    }
    static void drawRectangle(int width, int length){
        for(int i = 0; i < width; i++){
            for(int j = 0; j < length;j++ ){
                System.out.print("0 ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter option: ");
        char op = sc.next().charAt(0);
        

        switch(op){
            case 'A':
                System.out.print("Input size: ");
                drawRectangle(sc.nextInt());
                break;
            case 'B':
                System.out.print("Input size: ");
                drawTriangle(sc.nextInt());
                break;
            case 'C':
                System.out.print("Input width size: ");
                int width = sc.nextInt();
                System.out.print("Input length size: ");
                int length = sc.nextInt();
                drawRectangle(width, length);
                break;
            default:
                System.out.println("Invalid option");
        }
        sc.close();
    }

}
