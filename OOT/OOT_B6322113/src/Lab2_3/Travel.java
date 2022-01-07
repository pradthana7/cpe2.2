package Lab2_3;
import java.util.Scanner;
public class Travel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int d = 0;
        System.out.print("Did you go to Japan? ");
        String a1 = sc.next();
        if(a1.equals("yes")){
            System.out.print("Where did you visit? ");
            String a2 = sc.next();
            if(a2.equals("Toky")){
                d += 20;
            }else if(a2.equals("Hokkaido")){
                d += 50;
            }else if(a2.equals("Kyoto")){
                d += 40;
            }else{
                //d += 0;
            }
        }else if(a1.equals("no")){
            //
        }else{
            //
        }

        System.out.print("Did you go to UK? ");
        String a3 = sc.next();
        if(a3.equals("yes")){
            System.out.print("Where did you visit? ");
            String a4 = sc.next();
            if(a4.equals("London")){
                d += 10;
            }else if(a4.equals("York")){
                d += 100;
            }else{
                //d += 0;
            }
        }else if(a3.equals("no")){
            //
        }else{
            //
        }
        System.out.print("Did you go to US? ");
        String a5 = sc.next();
        if(a5.equals("yes")){
            System.out.print("Where did you visit? ");
            sc.nextLine();
            String a = sc.nextLine();
            if(a.equals("New York")){
                d += 90;
            }else if(a.equals("Washington")){
                d += 80;
            }else{
                //
            }
        }else if(a5.equals("no")){
            //
        }else{
            //
        }
        System.out.println("\nTotal distance is "+ d);
        sc.close();
    }
    
}
