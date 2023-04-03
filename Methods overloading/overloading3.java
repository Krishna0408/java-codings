import java.util.*;
class overloading3{

static int square (int a) {
    return a*a;
}
static int rect(int x,int y){
    return x*y;
}
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int area1=square(a);      
        int x=sc.nextInt();
        int y=sc.nextInt();
        int area2=rect(x,y);
        System.out.printf("Area of Square :"+ area1 + "\nArea of Rectangle :"  + area2);
    }
}


