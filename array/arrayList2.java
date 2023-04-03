import java.util.*;
public class arrayList2 {
    public static void main(String[] args) {
        ArrayList<Integer> demo=new ArrayList<>();
        ArrayList<Integer> demo1=new ArrayList<>();
        demo.add(1);
        demo.add(2);
        demo.add(3);
        demo.add(4);
        demo1.addAll(demo);
        System.out.print(demo1);
    }
}
