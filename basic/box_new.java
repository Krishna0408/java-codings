import java.util.*;
class box_new{
    void display(){
    Scanner s=new Scanner(System.in);
    int l=s.nextInt();
    int b=s.nextInt();
    System.out.println(" Area " + l*b);

}
public static void main(String args[])
{

System.out.println("Enter Length , Breath and Height");
Scanner s=new Scanner(System.in);
int l=s.nextInt();
//int b=s.nextInt();
box_new obj = new box_new();
obj.display();
}
}