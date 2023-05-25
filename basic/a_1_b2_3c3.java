import java.util.*;

public class a_1_b2_3c3 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int rows = scanner.nextInt();

        char ch = 'a';
        int num = 1;

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                if (j % 2 == 0) {
                    System.out.print(ch);
                } else {
                    System.out.print(num);
                }
            }
            num++;
            ch++;
            System.out.println();
        }
    }
}
