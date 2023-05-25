import java.util.Scanner;

public class breakingbad {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String[] words = s.split(" ");
        String first = words[0];
        String second = words[1];

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < first.length(); i++) {
            for (int j = 0; j <= i; j++) {
                result.append(first.charAt(j));
            }

            int limit = Math.min(i + 1, second.length());
            for (int k = 0; k < limit; k++) {
                result.append(second.charAt(k));
            }

            System.out.println(result.toString());
            result.setLength(0);
        }
    }
}
