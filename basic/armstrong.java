import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        int n,nc=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int a=n;
        while(a!=0){
            int nr=a%10;
            nc=nc+(nr*nr*nr);
            a=a/10;
        }
        //System.out.println(n);
        //System.out.println(nc);
        if(n==nc){
        System.out.println("Armstrong Number");
        }
        else{
        System.out.println("Not an Armstrong Number");
        }
    }
}
