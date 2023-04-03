import java.util.*;

class hollowtiangle{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        for(int i=1;i<=a;i++){
            if(i==1 || i==a)
            for(int  j=1;j<=i;j++){
               System.out.print("*");
            } else {
               for(int j=1;j<=i;j++){
                  if(j==1 || j==i)
                     System.out.print("*");
                  else
                     System.out.print(" ");
               }
            }
            System.out.println();
         }
    }
}