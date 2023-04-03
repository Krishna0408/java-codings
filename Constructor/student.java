
import java.util.*;

public class student{
    int id;
    String name;
    student(int id,String n){
        this.id=id;
        name=n;
    }
    void display(){
        System.out.print(id+" "+name);
    }
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int id=sc.nextInt();
    String name=sc.next();
    student s1=new student(id, name);
    s1.display();
}
}
