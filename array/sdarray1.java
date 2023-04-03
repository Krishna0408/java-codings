import java.util.*;

public class sdarray1 {
    public static void main(String[] args) {
        //Scanner sc=new Scanner(System.in);
        int c[]=new int[5];
        int a[]={1,2,3,4,5};
        int b[]={6,7,8,9,10};
        for(int i=0;i<a.length;i++){
            if(i==0)
            c[i]=a[i]*b[i+1];
            else if(i==1)
            c[i]=a[i]*b[i-1];
            else if(i==2)
            c[i]=a[i]*b[i];
            else if(i==3)
            c[i]=a[i]*b[i+1];
            else if(i==4)
            c[i]=a[i]*b[i-1];
        }
        // for(int i=0;i<5;i++){
        //     System.out.println(c[i]);
        // }
    }
}
