import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
    /*
    
    
    System.out.println("Even numbers");
       
        
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        
        int sum = 0;
        
        // Loop through numbers from 1 to n
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {  
                sum += i;  
            }
        }
        
        System.out.println("Sum of even numbers up to " + n + ": " + sum);


     for loop     if       Sum + n   Sum;
   1<10 True  -   false  
   2<10 True  -   True ->  0 + 2     2
   3<10 True  -   false
   4<10 True  -   True ->  2 + 4     6
   5<10 True  -   false
   6<10 Truev -   True ->  6 + 6     12
   7<10 True  -   false
   8<10 True  -   True ->  12 + 8    20
   9<10 True  -   false
   10<10 True -   True ->  20 + 10   30
   */

/*
 
   String [] names = {"Jhon Alvert","Cristian dave","Jean","John Erwin","Clint Joey","Jhomarie"};

   Arrays.sort(names);
   for(String name : names){

    System.out.printf("\nName:%s",name);

   }


    String [] names = {"Jhon","Alvert","MArbebe"};
    System.out.print("Enter name: ");
    String targetname = scanner.nextLine();
    boolean found = false;
    for (int i = 0; i<names.length; i++){

        if(targetname.equalsIgnoreCase(names[i])){

            System.out.println("Person found at index of: " + i);
            found = true;
            break;

        }
    }
   
    if (!found){

        System.out.println("Person cannot found in a array");
    }


 
 System.out.print("Enter a grade 5: ");
 double grade1 = scanner.nextDouble(); 
 double grade2 = scanner.nextDouble(); 
 double grade3 = scanner.nextDouble(); 

average(grade1,grade2,grade3);



    scanner.close();


    }

    static double average (double... grade){

         double sum = 0;

         if (grade.length == 0){

            return 0;
         }

         for(double avg : grade ){

            sum += avg;

           
         }

         return sum / grade.length;
          


          char [][] telephone = {{'1', '2', '3'},
                                 {'4', '5', '6'},
                                 {'7', '8', '9'},
                                 {'*', '0', '#'}
                                };

            for (char [] row : telephone){

                for (char number : row){

                    System.out.print(number + " ");

                }
                System.out.println();
            }   */
           
            

             String[] question = {"What is my name?","What is programming language currently learn?","Asa ko nag school? ", };
             String [][] option = {{"1.Jhon","2.Ern","3.Doe"},
                                   {"1.HTML","2.Java","3.JavaScript"},
                                   {"1.Dnsc","2.Aces Tagum ","3.Aces Panabo"},
                                };

            int answer [] = {1,2,2};
            int choice;
            int correct = 0;

            for (int i = 0; i<question.length; i++){

                 System.out.println(question[i]);
                 for (String options : option[i] ) {
                    System.out.println(options);
                   
                    
                 }
                 System.out.print("Enter your choice: ");
                 choice = scanner.nextInt();
                 if(choice == answer[i]){

                    System.out.println("Your are correct!");
                    correct++;
                 }
                 else {
                       
                    System.out.println("You are wrong!");

                 }
            }
            System.out.println("Your score is "+ correct + "/" + question.length);

    }
}
