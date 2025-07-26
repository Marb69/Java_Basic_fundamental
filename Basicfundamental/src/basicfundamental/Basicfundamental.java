
package basicfundamental;

import java.util.Scanner;
public class Basicfundamental {


    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
        
        
            boolean isExit = true;
            
            
        do {            
            
            
            
            System.out.println("[1]Exit Program"); 
            System.out.println("[2]Enter Program"); 
            System.out.print("Enter choice: ");
            int exit = scanner.nextInt();
         
            if(exit==1){
                
                isExit = false;
            }
        
            else if(exit==2){
                
                 
        System.out.print("Enter First num: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter Second num: ");
        double num2 = scanner.nextDouble();
        scanner.nextLine();
        
        
                try {
                    
         System.out.print("Enter Operator: ");
        String operator = scanner.nextLine();
        
        switch (operator) {
            case "+":
                
                System.out.println( num1 + num2 );          
                break;
                
            case "*":
                
                    System.out.println( num1 * num2 );   
                
                break;
                
            case "-":
                
                System.out.println(num1 - num2);
                
                break;
                
            case "/":
                
               if(num1 == 0 || num2 == 0){
                   
                   System.out.println("Zero cannot be devide");
               }
               
               else{
                   
                   System.out.println(num1 / num2);
               }
                break;
             default:
            
         }
        
                
                    
                } catch (Exception e) {
                    
                    System.out.println(e + "invalid operator");
                }
       
                
            }
            
            else{
                
                System.out.println("Enter the correct choice (1 oR 2)");
            }
            
            
        } while (isExit);
       
        
    }
    
}
