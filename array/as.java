public class as {   
    public static void main(String[] args) {
        int a[]={1,2,3,4,5};
        int b[]={6,7,8,9,10};
        int c[] = new int[5];
        int d[] = new int[5];
        int j=5;
        for(int i=0;i<5;i++){
            c[j-1]=b[i];
            j=j-1;
        }
        for(int i=0; i<5; ++i){
            d[i] = a[i] + c[i];
        System.out.print(d[i]+" ");
    }
}
}