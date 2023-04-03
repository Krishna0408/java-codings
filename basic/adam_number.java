import java.util.Scanner;

public class adam_number {
    public static void main(String[] args) {
        int n,ns,nsr=0,nr=0,nrs;
        Scanner  sc=new Scanner(System.in);
        n=sc.nextInt();
        ns=n*n;
        //for(int i=0;i<ns;i++){
            while(ns>0){
            int d=ns%10;
            nsr=nsr*10+d;
            ns=ns/10;
        }
        //System.out.println(nsr);
        while(n>0){
            int d=n%10;
            nr=nr*10+d;
            n=n/10;
        }
        //System.out.println(nr);
        nrs=nr*nr;
    if(nsr==nrs){
        System.out.print("Adam Number");
    }
    else{
        System.out.print("Not Adam Number");
    }
    }
}
