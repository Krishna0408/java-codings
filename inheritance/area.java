import java.util.*;

class a {
    void calculateArea() {
        System.out.println("Area");
    }
}

class Square extends a {
    void calculateArea(int a) {
        System.out.println(a * a);
    }
}

class Rectangle extends Square {
    void calculateArea(int l, int b) {
        System.out.println(l * b);
    }       
}

public class area {
    public static void main(String[] args) {
        Square s = new Square();
        s.calculateArea(5);
        Rectangle r = new Rectangle();
        r.calculateArea(4, 5);
    }
}