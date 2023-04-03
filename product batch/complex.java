import java.util.*;

class complex {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[][]=new int[n][2];
        for(int i=0;i<n;i++){
            for(int j=0;j<2;j++){
            a[i][j]=sc.nextInt();
            }
        }
        int a1=a[0][0]+a[1][0];
        int b1=a[0][0]-a[1][0];
        int c1=(a[0][0]*a[1][0]-a[0][1]*a[1][1]);
        int a2=a[0][1]+a[1][1];
        int b2=a[0][1]-a[1][1];
        int c2=((a[0][1]*a[1][0])+(a[0][0]*a[1][1]));
        System.out.println(a1+"+"+a2+"i");
        System.out.println(b1+"-"+b2+"i");
        System.out.println(c1+"+"+c2+"i");
    }
 }

