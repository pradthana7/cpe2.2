package Lab2_2;
import java.util.Scanner;

public class NumberChecker {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num : ");
        int n = sc.nextInt();
        n = (int)n;
        int m = Math.abs(n); //เพื่อให้เป็นจำนวนบวกเมื่อนำไปตรวจสอบในswitch caseจะได้ลดลง

        String result1 = (n >0)? "บวก  ": (n<0)? "ลบ ":"ศูนย์" ;
        System.out.print(result1);
        
        switch(m){
            case 1:
                System.out.println("หนึ่ง");
                break;
            case 2:
                System.out.println("สอง");
                break;
            case 3:
                System.out.println("สาม");
                break;
            case 4:
                System.out.println("สี่");
                break;
            case 5:
                System.out.println("ห้า");
                break;
            case 6:
                System.out.println("หก");
                break;
            case 7:
                System.out.println("เจ็ด");
                break;
            case 8:
                System.out.println("แปด");
                break;
            case 9:
                System.out.println("เก้า");
                break;
            
        }
        sc.close();
        
    }
}
/*  
import java.util.Scanner;
public class NumberChecker {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //Input
        System.out.println("Enter num : ");
        int n = sc.nextInt();
        // Method
        String result1 = (n >0)? "บวก  ": (n<0)? "ลบ ":"ศูนย์" ;
        int m = Math.abs(n);
        // Terdinary
        String result2 = (m == 1)? "หนึ่ง"
                                : (m == 2)? "สอง"
                                : (m == 3)? "สาม" 
                                : (m == 4)? "สี่" 
                                : (m == 5)? "ห้า"
                                : (m == 6)? "หก" 
                                : (m == 7)? "เจ็ด"
                                : (m == 8)? "แปด" : "เก้า";
        System.out.print(result1);
        System.out.print(result2);
    }
}
  */