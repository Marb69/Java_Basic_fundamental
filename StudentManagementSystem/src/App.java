
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
    
       StudentManager stdm = new StudentManager();


    try {
        

        Scanner scanner = new Scanner(System.in);
        boolean start = true;
        while (start) {
            
            System.out.println("1.Add Students\n2.Show All Students\n3.Find by ID\n4.Exit");
            System.out.print("\nEnter your choice: ");
             int choice = scanner.nextInt();
           scanner.nextLine();
            switch (choice) {
                case 1 -> {
                    

                    System.out.print("Enter Name: ");
                    String name= scanner.nextLine();
                    System.out.print("Enter Age: ");
                    int age = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter Student Id: ");
                    String id = scanner.nextLine();
                   System.out.print("Enter 3 grades: ");
                   double [] grades = {scanner.nextDouble(),scanner.nextDouble(),scanner.nextDouble()};
                    stdm.addstudent(name, age, id,grades);
                    
                }

                case 2 ->{

                    stdm.showallstudents();


                }
                    
                case 3 ->{

                     System.out.print("Enter student Id: ");

                     String id = scanner.nextLine();

                     stdm.findstudentById(id);
                }
                    case 4 -> start = false;
            }

        }



    } catch (Exception e) {
        System.out.println(e);
    }




    }
}
