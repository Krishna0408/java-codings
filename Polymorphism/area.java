class ar{
    static int a(int a){
        return a;
    }
    static int a(int l,int b){
        return l*b;
    }
    double a(double l,double b){
        return l*b;
    }
}

public class area{
    public static void main(String args[]){
        System.out.println(ar.a(5));
        System.out.println(ar.a(5,6));
        ar a=new ar();               //static keyword is not used so object is created to call 
        System.out.println(a.a(11.2,6.5));
    }    
}