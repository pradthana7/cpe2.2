package week11.idAndNameCheck;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String firstName="", lastName="", name="", id="";
        boolean flag = false;
        System.out.print("Please enter your student ID: ");
        id = sc.nextLine();
        System.out.print("Please enter your name: ");
        name = sc.nextLine();
        // try id
        try{
            if(id.length()==8){
                if((int)id.charAt(0)>=65 && (int)id.charAt(0)<=90){   
                    for(int i=1; i<id.length(); i++){
                        if(Character.isLetter(id.charAt(i))){
                            throw new StudentIDFormatException("ID number format is incorrect");
                        }
                    }           
                }else{
                    throw new StudentIDFormatException("ID format not start with letter");
                }
            }else{
                throw new StudentIDFormatException("ID length is not 8");
            }
        }catch(StudentIDFormatException ex){
            System.out.println(ex.getMessage());
        }
        //try name
        try{ 
            String[] temp = name.split(" ");
            //System.out.println("lenght of temp after split "+temp.length+ "item in temp are-->" +temp[0]+"--"+temp[1]+"--"+temp[2]);
            if(temp.length == 2){
                firstName = temp[0];
                lastName = temp[1];
                flag = true;
            }else{
                throw new StudentNameFormatException("Name must contain first name and last name");
            }
        }catch(StudentNameFormatException ex){
            System.out.println(ex.getMessage());
        }
        try{
            for(int i=0; i<firstName.length();i++){
                if(Character.isDigit(firstName.charAt(i))){
                    throw new StudentNameFormatException("Name must contain only letters");
                }
            }
            for(int i=0; i<lastName.length();i++){
                 if(Character.isDigit(lastName.charAt(i))){
                    throw new StudentNameFormatException("Name must contain only letters");
                } 
            }  
        }catch(StudentNameFormatException ex){
            System.out.println(ex.getMessage());
        }
        //System.out.println(flag);     
    }
}
