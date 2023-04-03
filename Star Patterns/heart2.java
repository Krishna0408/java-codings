public class heart2{
    public static void main(String[] args) {
        int size = 9;

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size * 2; j++) {
                double a = i - size / 2.0;
                double b = j - size;
                if (Math.pow(a, 2) / (size / 4.0) + Math.pow(b, 2) / (size * 2.0 / 3.0) <= 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
