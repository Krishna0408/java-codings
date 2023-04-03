class animal{
    public void move(){
        System.out.println("animal can move");
    }
}

class dog extends animal{
    public void move(){
        System.out.println("dog can move");
    }
}


public class testdog {
    public static void main(String[] args) {
        animal a=new animal();
        animal b=new dog();
        a.move(); // run method in animal class
        b.move();  // run method in dog class
    }
}
