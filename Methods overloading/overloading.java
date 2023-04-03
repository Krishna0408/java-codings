import java.util.*;
class overloading{

static int plusMethod(int x,int y){
    return x+y;
}
static double plusMethod(double x,double y){
    return x+y;
}
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        int myNum1=plusMethod(x, y);
        double a=sc.nextDouble();
        double b=sc.nextDouble();
        double myNum2=plusMethod(a, b);
        System.out.println(myNum1);
        System.out.println(myNum2);
}
}