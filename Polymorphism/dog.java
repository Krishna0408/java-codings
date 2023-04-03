// Program to downcast the class to get the values within the function
// it is done using the instance in java !


class animal{ }

public class dog extends animal
{
 static void method(animal a){
    if(a instanceof dog){
    dog d=(dog)a;
    System.out.println("downcasting Done");
 }   
}
public static void main(String[] args) {
    animal a=new dog();
    dog.method(a);
}
}