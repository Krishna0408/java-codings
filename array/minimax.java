import java.util.*;
public class minimax {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=0,b=0;
        int nums[]=new int [5];
        for(int i=0;i<5;i++){
            nums[i]=sc.nextInt();
        }
        for(int i=0;i<4;i++){
            a=a+nums[i];
        }
        for(int i=1;i<5;i++){
            b=b+nums[i];

        }
        System.out.println(a+" "+b);
    }
}
