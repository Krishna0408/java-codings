import java.util.Scanner;

public class cash2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int m[]={1, 2, 5, 10, 20, 50, 100, 200, 500, 2000};
        for(int i=m.length-1;i>=0;i--){
            if(a>=m[i]){
            int max=m[i];
            if(a>=max){
                a-=max;
                i++;
            }
            System.out.print(max+" ");
        }
    }
    }
}