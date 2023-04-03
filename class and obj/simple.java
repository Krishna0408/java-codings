import java.util.*;

class simple1{
    int n;
    String name;
    int age;
    void display(int n,String name){
        this.n=n;
        this.name=name;
    }
    void display(int n,String name,int age){
        this.n=n;
        this.name=name;
        this.age=age;
    }
    void display(){
        System.out.println(n+" "+name+" "+age);
    }
}

public class simple {  
   public static void main(String[] args) {
    simple1 s2=new simple1();
    s2.display(2,"Bava",19);
    s2.display();
    simple1 s=new simple1();
    s.display(1,"krish");
    s.display();
   } 
}