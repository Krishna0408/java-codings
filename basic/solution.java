import java.util.*;

class solution{
        public static void main(String []args){
        Scanner in = new Scanner(System.in);
        double a=0;
        int b=0,c=0;
        int t=in.nextInt();
        for(int i=0;i<t;i++){
             a = in.nextInt();
             b = in.nextInt();
             c = in.nextInt();
        }
        for(int j = 0 ; j <c ;j++){
            double d=Math.pow(2,j);
            a= a + d * b;
                System.out.print(a+" "+d);
    
        }
        System.out.println();
        in.close();
    }
}
