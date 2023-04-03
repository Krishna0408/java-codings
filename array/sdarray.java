import java.util.*;

class sdarray{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        int a[]=new int[5];
        int b[]=new int[5];
        char c[]=new char[5];
        char d[]=new char[5];

        for(int i=0;i<5;i++){
            a[i]=sc.nextInt();
            if(a[i]<9){
                c[i]='S';
            }
            else{
                c[i]='D';
            }
        }
        for(int i=0;i<5;i++){
            b[i]=sc.nextInt();
        }
        for(int i=0;i<5;i++){
            if(b[i]%2==0 && b[i]>0){
                d[i]='E';
            }
            else if(b[i]==0){
                d[i]='N';
            }
            else{
                d[i]='O';
            }
        }
        for(int i=0;i<5;i++){
            System.out.print(c[i]+" ");
        }
        System.out.println();
        for(int i=0;i<5;i++){
            System.out.print(d[i]+" ");
        }
    }
}