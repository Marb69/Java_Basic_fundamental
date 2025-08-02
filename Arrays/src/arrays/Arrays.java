
package arrays;

import java.util.Scanner;
public class Arrays {


    public static void main(String[] args) {
       
        
     Scanner scanner = new Scanner(System.in);
     
     
        System.out.print("Enter your name: ");
          String name = scanner.nextLine();
       
         String coursechoose;
         boolean chooseAvail = true;
         
         do {       
             
              System.out.print("choose your Course (Available => DIT/BSHM,BSCRIM): ");
         String course = scanner.nextLine();
             
      if(course.equalsIgnoreCase("dit")){
             
             coursechoose = "DIT";
             chooseAvail = false;
         }
         else if(course.equalsIgnoreCase("BSHM")){
             
             coursechoose = "BSHM";
                chooseAvail = false;
         }
            else if(course.equalsIgnoreCase("BSCRIM")){
             
             coursechoose = "BSCRIM";
                chooseAvail = false;
         }
         
            else{
                
                System.out.println("Please choose again! Available course DIT/BSHM/BSCRIM");
                
            }
            
        } while (chooseAvail);
         
        
         String sex = " ";
         
                 try {
         do {            
             
     
                 
                    System.out.print("Choose your gender: ");
               int indexSex = scanner.nextInt();
     
               switch (indexSex) {
                 case 1:
                     
                     sex = "Male";
                     chooseAvail = false;
                     break;
                     
                       case 2:
                     
                     sex = "Female";
                       chooseAvail = false;
                     break;
                     
                     default: System.out.print("Male and Female gender only choose");
     
                     throw new AssertionError();
             }
                 
           
            
            
        } while (chooseAvail);
        
      
              
             } catch (Exception e) {
                 
                 System.out.println("Invalid input");
             }
        
      
        
    

    }
    
}
