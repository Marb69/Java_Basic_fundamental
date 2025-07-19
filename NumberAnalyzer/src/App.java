import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
     
        Scanner Sc = new Scanner(System.in);



    System.out.println("Enter 5 number: ");
    int num1 = Sc.nextInt();
    int num2 = Sc.nextInt();
    int num3 = Sc.nextInt();
    int num4 = Sc.nextInt();
    int num5 = Sc.nextInt();

    int sum = num1+num2+num3+num4+num5;
    
    float avg = sum/5.0f;
    
    

    int smallest  = Math.min(num1, Math.min(num2, Math.min(num3,Math.min(num4,num5))));
    int lasrgest =  Math.max(num1, Math.max(num2, Math.max(num3,Math.max(num4,num5))));

    System.out.printf("\nSum: %d ",sum);
    System.out.printf("\nAverage: %.2f ",avg);
    System.out.printf("\nSmallest: %d",smallest);
    System.out.printf("\nLargest: %d",lasrgest);
    }
}
