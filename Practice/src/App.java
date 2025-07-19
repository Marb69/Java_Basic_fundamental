import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
       


try {
    
    Scanner scanner = new Scanner(System.in);
    int num1,num2;
    int choice;
    double sum;
    boolean run = true;

    System.out.print("Enter first number: ");
    num1 = scanner.nextInt();
    System.out.print("Enter second number: ");
    num2 = scanner.nextInt();

    while (run){

        System.out.println("Calculator");
        System.out.println("\n1.Multiplication \n2.Division \n3.Adition \n4.Subtraction \n5.Exit Program");
        System.out.print("Enter: ");
        choice = scanner.nextInt();
    
        try {
            switch (choice) {
                case 1 -> {
                            sum = num1 * num2;
                    }
                case 2 -> {
                        sum = num1 / num2;
                   }
                case 3 -> {
                    sum = num1 + num2;
                }
                case 4 -> {
                sum = num1 - num2;
                }
                    case 5 -> {
                
                        System.out.print("Closing program");
                        for (int i = 0; i<4; i++){
            
                            System.out.print(".");
                            Thread.sleep(600);
                        }
                     run = false;
            
            
                    }
                }
                
        } catch (Exception e) {
            System.out.println("cannot be divide by Zero");
        }
       
    }
    }
   

catch (Exception e) {
    System.out.println(e);

    }
    
}

}