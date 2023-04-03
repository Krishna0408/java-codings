import java.util.*;

abstract class Hide {
    abstract void fine();
    abstract void fees();
}

class Details {
    long id;
    String name;
    int bookid;

    public Details() {
        System.out.println("Enter your Id and Name:");
        Scanner d = new Scanner(System.in);
        id = d.nextLong();
        name = d.next();
    }

    public int getBookId() {
        Scanner o = new Scanner(System.in);
        System.out.print("Enter the Book ID (1/2) :");
        int b = o.nextInt();
        return b;
    }
}


class Fine extends Hide {
    void fine() {
        System.out.println("Fine method implementation(abstract)");
    }

    void fees() {
        System.out.println("Fees method implementation(abstract)");
    }
}


class Book {
    int Book1 = 20;
    int Book2 = 25;

    public void out(int b) {
        Scanner o = new Scanner(System.in);
        for (int i = 0; i < 1; i++) {
            if (b == 1) {
                Book1--;
            } else if (b == 2) {
                Book2--;
            } else {
                System.out.println("Enter a Valid choice");
            }
        }
        System.out.println("\nNumber of Books Left ");
        System.out.println("Book 1 =" + Book1);
        System.out.println("Book 2=" + Book2);
    }
}

class WithStud {
    void withStud(int bookid) {
        System.out.println("Book " + bookid + " is with the student and return it within 10 days");
    }
}

public class Library {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Details d = new Details();
        int bookid = d.getBookId();
        Book b = new Book();
        b.out(bookid);
        WithStud w = new WithStud();
        w.withStud(bookid);
        Hide obj = new Fine();
        obj.fine();
        obj.fees();

    }
}


//****************************************************************************************************************** */

// interface in java 

// interface drawable{
//     void draw();
// } 

// class Rectangle implements drawable{
//     public void draw{}{ System.out.println("drawing rect"); }
// }

// class circle implements drawable{
//     public void draw{}{ System.out.println("drawing rect"); }
// }

// class testinterface{
//     public static void main(String[] args) {
//         drawable d=new circle();
//         d.draw();
//     }
// }