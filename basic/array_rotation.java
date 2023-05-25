import java.util.Scanner;

public class array_rotation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();  // Read the number of elements to be rotated from the end of the array to the beginning
        int rotateBy = n - k;  // Calculate the number of positions to rotate the array
        int[] rotatedArr = new int[n];

        for (int i = 0; i < n; i++) {
            int newIndex = (i+rotateBy) % n;
            rotatedArr[newIndex] = arr[i];
        }
        for (int i = 0; i < n; i++) {
            System.out.print(rotatedArr[i] + " ");
        }
    }
}
