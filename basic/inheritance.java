class animal{
void eat(){
System.out.println("Eating");
}
}


class dog extends animal{
void bark(){
System.out.println("Barking");
}
}

class cat extends animal{
void meow(){
System.out.println("Meowing");
}
}

class inheritance{
public static void main(String args[]){
cat c=new cat();
dog d=new dog();
c.meow();
d.bark();
d.eat();   
}
}