import java.util.Scanner;
public class if_else{
        public static void main(String[] args) {
        int a;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a Number :");
        a=sc.nextInt();
        if(a%3==0){
            System.out.println(a+" is Divisible by 3");
            int b=a+a+a;
            System.out.println(b);
            int length = (int) (Math.log10(b) + 1);
            if(length==1){
                System.out.println("0");
            }
            else if(length==2){
                System.out.println("The last digit are "+b%10);
            }
            else if(length==3){
                System.out.println("The last two digits are "+b%100);
            }
        }
        else{
            System.out.println(a+"is not divisible  by 3");
        }
    }
}