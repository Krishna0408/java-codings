import java.util.*;

class rectangle
{
    void display1(){
        Scanner r=new Scanner(System.in);
        int l=r.nextInt();
        int b=r.nextInt();
        int area=l*b;
        System.out.println(area);

}
}
class triangle
{
    void display2(){
        Scanner t=new Scanner(System.in);
        int a=t.nextInt();
        int b=t.nextInt();
        System.out.println(0.5*(a*b));

}
}
class circle{
    void display3(){
        Scanner c=new Scanner(System.in);
        int r=c.nextInt();
        System.out.println(3.14*r*r);

    }
}

public class class1 {
    public static void main(String[] args) {

        rectangle r=new rectangle();
        triangle t=new triangle();
        circle c=new circle();
        r.display1();
        t.display2();
        c.display3();
    }
}
