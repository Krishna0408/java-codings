import java.util.*;

class rectangle
{
    int lt;
    int bt;
    void display1(int lt , int bt){
        this.lt=lt;                   // here i declared inside display method 
                                // where as in other 2 places i have declared on class 
        this.bt=bt;
        int area=lt*bt;
        System.out.println(area);
        
    }
}
class triangle
{
    int at;
    int ct;
    triangle(int a,int c)
    {
        at=a;
        ct=c;
    }
    void display2(){
        System.out.println(0.5*at*ct);
    }
}
class circle{
    int radius;
    circle(int r){
        radius = r;
    }
    void display3(){
        System.out.println(3.14*radius*radius);
        
    }
}

public class rectsqrcir {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int lt = sc.nextInt();
        int bt = sc.nextInt();

        int a = sc.nextInt();
        int c = sc.nextInt();
        
        int r = sc.nextInt();

        rectangle rect = new rectangle();
        triangle tri = new triangle(a,c);
        circle circ = new circle(r);
        rect.display1(lt,bt);
        tri.display2();
        circ.display3();
    }
}
