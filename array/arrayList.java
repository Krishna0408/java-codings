import java.util.*;
public class arrayList {
    public static void main(String[] args) {
        ArrayList<Integer> demo=new ArrayList<>();
        demo.add(1);
        demo.add(2);
        demo.add(3);
        demo.add(4);
        demo.set(3, 5);//to set the value at the desired index position
        System.out.println(demo);
    }
}
