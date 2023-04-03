import java.util.Scanner;
class Krish{
int num1,num2;
public static void main(String args[])
{
Krish obj=new Krish();
System.out.println("Enter num1 and num2 values");
Scanner s=new Scanner(System.in);
obj.num1=s.nextInt();
obj.num2=s.nextInt();
System.out.println(+(obj.num1*obj.num2));
}
}
