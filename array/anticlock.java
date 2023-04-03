import java.util.*;

public class anticlock {
    public static void main(String[] args) {
        int[][] m = new int[3][3];
        int[][] a = new int[3][3];
        int[][] b = new int[3][3];
        Scanner sc = new Scanner(System.in);

        for (int k = 0; k < m.length; k++) {
            for (int j = 0; j < m[k].length; j++) {
                m[k][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                a[i][j] = m[j][i];
            }
        }
        for (int j = 0; j < m.length; j++) {
            for (int i = 0; i < m.length; i++) {
                b[i][3 - 1 - j] = m[j][i];
            }
        }
        System.out.println();
        for (int i = m.length -1; i >= 0; i--,System.out.println()) {
            for (int j = m.length - 1; j >= 0; j--) {
                System.out.print(b[i][j]+" ");
            }
        }
    }
}