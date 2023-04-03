import java.util.*;
class overloading2{


void plusMethod(int x,int y){
    System.out.println(x+y);

}
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        overloading2 myNum1=new overloading2();
        myNum1.plusMethod(x,y);
    }
}