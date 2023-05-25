public class train {
    public static void main(String[] args) {
        double a[] = {9.0, 10.10, 11.0};
        double b[] = {10.0, 12.0, 13.0};
        int count = 0;
        int max=0;
        int i=1,j=1;
        while(i<a.length && j<b.length){
                if (b[j] > a[i]) {
                    count++;
                    max=Math.max(max, count);
                    i++;
                }
                else{
                    count--;
                    j++;
                }
            }
        System.out.println(count);
    }
}
