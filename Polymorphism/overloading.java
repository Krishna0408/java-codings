// public class overloading {
//     void sum(int a,int b){
//         System.out.println("int method invoked");
//     }
//     void sum(long a,long b){
//         System.out.println("long method invoked");
//     }

//     public static void main(String[] args) {
//         overloading o=new overloading();
//         o.sum(20,20);
//     }
// }

// ************************************************************************************************************************************


public class overloading {
    void sum(int a,long b){
        System.out.println("a method invoked");
    }
    void sum(long a,int b){
        System.out.println("b method invoked");
    }

    public static void main(String[] args) {
        overloading o=new overloading();
        o.sum(20,20);
    }
}