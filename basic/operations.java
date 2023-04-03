import java.util.Scanner;
public class operations {
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter number 1 :");
            int a = sc.nextInt();
            System.out.print("Enter number 2 :");
            int b = sc.nextInt();
            System.out.print("\nThe Sum is "+(a+b));
            System.out.print("\nThe difference is "+(a-b));
            System.out.print("\nThe Product is "+(a*b));
            System.out.print("\nThe Quotient is "+(a/b));
            System.out.println("\nThe Reminder is "+(a%b));
        }   
    }   
}
