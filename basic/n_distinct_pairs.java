import java.util.Scanner;

public class n_distinct_pairs {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int n=num/2;
        for(int i=1;i<=n;i++){
            if(n%2==1){
                System.out.println(-n +" "+ n+" " + num);
            }
            else{
                System.out.println("0" + " "+n+" "+-n+" "+num);
            }
        }
    }
}