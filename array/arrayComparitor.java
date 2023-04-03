import java.util.*;

public class arrayComparitor {
  public static void main(String[] args) {
    ArrayList<Integer> demo=new ArrayList<>();
        demo.add(1);
        demo.add(2);
        demo.add(3);
        demo.add(4);
        demo.set(3,6);
        int n1=demo.get(2);
        System.out.println(n1);
        int n2=demo.remove(1);
        System.out.println(n2);
        int size=demo.size();
        System.out.println(size);
        demo.sort(Comparator.naturalOrder());
        System.out.print(demo);
  }   
}
