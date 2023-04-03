import java.util.Scanner;
public class onetofive{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();

            int i,j;
            for (i=0;i<a;i++) 
            {
                System.out.print("5 ");
            }
            System.out.print("\n");
          
            for (i=0;i<b-2; i++) 
            {
              if(i==0 || i==1){
                System.out.print(a-3);
              }
              else{
                System.out.print(a-4);
              }
              if(a%2==0){
                for (j=0;j<b;j++) 
              {
                System.out.print("k");
              }
            }
            else{
                for (j=0;j<b;j++) 
              {
                System.out.print(" l");
              }
            }
              System.out.print(" 4\n");
            }
          
            for (i=0;i<a;i++) 
            {
                for (j=a-1;j<a;j++) {
                    if(i==0 || i==1){
                    System.out.print(a-3+" ");
                    }
                    else if(i==2 || i==3 || i==4){
                        System.out.print(a-2+" ");
                    }
            }
        }
            System.out.print("\n");
          }
        }
    

      