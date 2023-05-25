import java.util.Scanner;

public class FibonacciPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        int second = 1;
        int first = 1;

        while (first <= n) {
            for (int i = 0; i < first; i++) {
                if (first > 0) {
                    System.out.print(first + " ");
                    first--;
                }
            }
            System.out.println();
            int temp = first;
            first = first + second;
            second = temp;
        }
    }
}
