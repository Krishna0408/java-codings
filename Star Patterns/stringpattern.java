import java.util.*;

public class stringpattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        for(int i=0;i<s.length();i++,System.out.println()){
            for(int j=0;j<=s.length()/2;j++){
                if(i==s.length()/2){
                    System.out.print(s);
                    break;
                }else {
                if(j==s.length()/2){
                    System.out.print(s.charAt(i));
                }
                else{
                    System.out.print(" ");
                }
            }
            }
        }
    }
}
