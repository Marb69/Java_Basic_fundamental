import java.util.Scanner;
import java.util.ArrayList;
public class App {

    public static void main(String[] args) throws Exception {
       
        try {
            

        Scanner scanner = new Scanner(System.in);
        ArrayList<function> info = new ArrayList<>();

            boolean start = true;

            //option 1 log in and create
            while (start){

                System.out.println("\n1.Log In");
                System.out.println("2.Create ATM Account");
                System.out.println("3.Exit Program");
                System.out.print("\n Enter: ");
                int choose = scanner.nextInt();


               // first 1 switch login and create 
                switch (choose) {
                    
                    case 1 -> {
                          
                        System.out.print("Enter Account Number: ");
                        int accnumber = scanner.nextInt();
                        
                        System.out.print("Enter Account Pin (Four # digit!): ");
                        int pinacc = scanner.nextInt();
                        String pinstring = Integer.toString(pinacc);

                       
                        for (function Verify : info){

                           
                            if(Verify.getaccountholdernumberr()!=accnumber){
                                
                                System.out.println("Invalid account number! Please Try again");
                            
                                }
                            else {

                                if(pinstring.length()==4){

                                    if(Verify.getPin()==pinacc){

                                        System.out.print("\nLogIn");
                                        for(int i = 0; i<4; i++){

                                            System.out.print(".");
                                            Thread.sleep(700);
                                        }

                                        boolean Exit = true;
                                        while (Exit) {
                                        
                                        System.out.println("\n1.Balance inquir");
                                        System.out.println("2.Withdraw");
                                        System.out.println("3.Deposit");
                                        System.out.println("4.Log out");
                
                                        System.out.print("\nEnter: ");
                                        int ch = scanner.nextInt();
                                        scanner.nextLine();

                                        //second swictch balinquir,withdraw,deposit
                                        switch (ch) {
                                            case 1 -> {
                                             
                                                user.balanceinquir();
                                               
                
                
                                            }

                                            case 2 ->{

                                                System.out.print("Enter amount to withdraw: ");
                                                double amount = scanner.nextDouble();
                                               user.withdraw(amount);
                                            }

                                            case 3->{
              
                                                System.out.print("Enter amount to Deposit: ");
                                                double amount = scanner.nextDouble();
                                                user.deposit(amount);

                                            }
                                        case 4 -> {

                                            Exit = false;
                                        }
                                        }
                                        }
                                        
                                }
                                else {

                                    System.out.println("Wrong Pin please try again!");
                                }
                                }
                                else{

                                   System.out.println("Four # digit only! Please try again");
                               
                                    }

                            }
                        }
                        
                    }

                    case 2 -> {


                        System.out.print("Enter Account Number: ");
                         int numacc = scanner.nextInt();

                        System.out.print("Enter Pin: ");
                         int pin = scanner.nextInt();
                         String pinString = Integer.toString(pin);
                         scanner.nextLine();
                         if(pinString.length()==4){

                            System.out.print("Enter Name: ");
                            String name = scanner.nextLine();
                            info.add(new function(numacc, pin, name));
                            System.out.println("Account Created!");
                         }

                         else {

                                  System.out.println("Pin must be 4 digit");
                         }
                       

                    }

                    case 3 ->{

                        System.out.print("Exit Program");
                        for(int i = 0; i<4; i++){

                            System.out.print(".");
                            Thread.sleep(600);
                        }

                        start = false;
                    }
                }


            }






scanner.close();
        } catch (Exception e) {
            System.out.println(e);


    }
}
}