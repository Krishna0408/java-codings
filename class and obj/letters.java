import java.util.*;
class H{
    void displayH(){
        for(int i=0;i<9;i++){
            for(int j=0;j<10;j++){
                if(j==0 || j==6){
                    if(i==4)
                    continue;
                    System.out.print("*");
                }
                if(i==4){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }System.out.println();
            }
    }
}
public class letters {
    public static void main(String[] args) {
    H h=new H();
    h.displayH();
    }
}
