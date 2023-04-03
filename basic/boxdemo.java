import java.util.Scanner;

class box{
    int a,b,c;
}

public class boxdemo {
    public static void main(String[] args) {
        box myobj=new box();
        Scanner sc=new Scanner(System.in);
        myobj.a=sc.nextInt();
        myobj.b=sc.nextInt();
        myobj.c=sc.nextInt();
        int volume=myobj.a*myobj.b*myobj.c;
        System.out.println(volume);
    }
    
}
