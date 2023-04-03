public class BoyarMoore {
    public static void main(String[] args) {
        int a[]={2,3,4,2,2,3};
        int count=0;
        int candidate=0;
        for(int i=0;i<a.length;i++){
            if(count==0)
            candidate=a[i];
            if(candidate==a[i])
            count++;
            else
            count--;
        }
        System.out.println(candidate);
    }
}
