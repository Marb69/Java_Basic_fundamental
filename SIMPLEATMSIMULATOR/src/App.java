
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner Sc = new Scanner(System.in);
     

        boolean start = true;
        double balance = 1000;
        while (start) {
            
            
            System.out.println("\n1. Check Balance\n" + //
                                "2. Deposit Money\n" + //
                                "3. Withdraw Money\n" + //
                                "4. Exit");
            System.out.print("\nEnter your choice: ");
            int choice = Sc.nextInt();
           
            switch (choice) {
                case 1 -> {
                 
                        System.out.printf("You current balance is %,.2f\n",balance);
                }

                case 2 -> {

                    System.out.print("Enter Deposit Amount: ");
                    double amount = Sc.nextDouble();
                    balance +=amount;
                    System.out.printf("Successfully deposit! new Balance: %,.2f\n",balance);
                        
                }
                case 3->{

                    System.out.print("Enter withdraw amount: ");
                    double amount = Sc.nextDouble();
                 
                    if (amount>balance){


                        System.out.println("Insufficient balance!\n");
                    }
                    else if (amount <=0) {
                        System.out.println("Withdrawal amount cannot be negative.");
                    }
                    else {

                        balance -=amount;
                        System.out.printf("\nYour new balance is: %,.2f\n",balance);
                    }

                }
 case 4 ->{

    
  
    System.out.print("System Exiting");
    for (int i = 0; i<4; i++){

        System.out.print(".");
        Thread.sleep(700);
    }

    System.out.println("\nThank you!");
    start = false;
 }

            }
    
}
    }
}