import java.util.Scanner;
class learn{
public static void main(String args[])
{
int a,b,c,num;
System.out.println("Enter A B and C values");
Scanner s=new Scanner(System.in);
a=s.nextInt();
b=s.nextInt();
c=s.nextInt();
System.out.println("Enter your choice :\n 1 for A*B*C \n 2 for A+B-C \n 3 Greater or lower \n 4 for A*B+C ");
num=s.nextInt();
switch(num)
{
case 1:{
System.out.println(+(a*b*c));
}break;
case 2:{
System.out.println(+(a+b-c));
}break;
case 4:{
System.out.println(+(a*b+c));
}break;
case 3:{
if(a>b && a>c)
{
System.out.println("A is greater");
}
else if(b>c && b>a)
{
System.out.println("B is greater");
}
else if(c>a && c>b)
{
System.out.println("C is greater");
}
}break;
}
}
}
