
import java.util.Scanner;

public class ATMsimulate {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            Function obj = new Function(scanner);
            boolean logexit = true;

            while (logexit) {
                System.out.println("\n1. Log In \n2. Create Account \n3. Exit Program\n");
                System.out.print("Enter choice: ");
                int choice = scanner.nextInt();
                scanner.nextLine(); // Consume newline

                switch (choice) {
                    case 1 -> obj.login();
                    case 2 -> obj.createaccount();
                    case 3 -> {
                        System.out.print("Program Exiting");
                        for (int i = 0; i < 5; i++) {
                            System.out.print(".");
                            Thread.sleep(700);
                        }
                        logexit = false;
                    }
                    default -> System.out.println("Enter 1-3 only!");
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}