import java.util.Scanner;
public class if_star{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        if(a>b){
            int i,j;
            for (i=0;i<a;i++) 
            {
                System.out.print("* ");
            }
            System.out.print("\n");
          
            for (i=0;i<b; i++) 
            {
                System.out.print("*");
              if(a%2==0){
                for (j=0;j<b;j++) 
              {
                System.out.print("  ");
              }
            }
            else{
                for (j=0;j<=b;j++) 
              {
                System.out.print("  ");
              }
            }
              System.out.print(" *\n");
            }
          
            for (i=0;i<a;i++) 
            {
                System.out.print("* ");
            }
            System.out.print("\n");
          }
        }
    }
    
