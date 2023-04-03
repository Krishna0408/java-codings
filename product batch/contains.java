import java.util.*;

public class contains {
    public static void main(String[] args) {
        String s="abcde";
        String s1=s+s;
        Scanner sc=new Scanner(System.in);
        String s2=sc.next();
        boolean b=s1.contains(s2);
        System.out.println(b);
    }
}
