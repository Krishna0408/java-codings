abstract class abs{
    abstract void swap(int a,int b);
}
public class aswap extends abs{
public void swap(int a,int b){
 
        int temp;
	temp = a;
        a = b;
        b = temp;
System.out.println(a);
System.out.println(b);
    }

    public static void main(String args[]){
        abs obj=new aswap();
        int x = 10;
        int y = 20;
	obj.swap(x,y);
    }
}