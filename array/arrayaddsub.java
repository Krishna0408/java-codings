import java.util.*;

class matrix{
    void addsub(){
        int[][] m= new int [3][3];
        Scanner sc=new Scanner(System.in);
        for (int i=0;i<m.length;i++) {
            for(int j=0; j<m[i].length;j++){
                m[i][j]=sc.nextInt();
            }
        }
        System.out.println();

        for (int i=0;i<m.length;i++) {
          for(int j=0; j<m[i].length;j++) {
            if((i==0 && j==0) || (i==1 && j==0) || (i==2 && j==0)){
                System.out.print(m[i][2]+m[i][0]+" ");
            }
            else if((i==0 && j==2) || (i==1 && j==2) || (i==2 && j==2)){
                System.out.print(m[i][2]- m[i][0]+ " ");
            }
            else if((i==0 && j==1) || (i==1 && j==1) || (i==2 && j==1)){
                System.out.print(m[i][j]+" ");
            }
            }System.out.println();
          }
    }
}

public class arrayaddsub {
    public static void main(String[] args) {
        matrix m=new matrix();
        m.addsub();
      }
}
