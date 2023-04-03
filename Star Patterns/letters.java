import java.util.*;
public class letters {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char a=sc.next().charAt(0);
        System.out.println();
        if(a=='I'){
            for(int i=0;i<10;i++){
                for(int j=0;j<10;j++){
                    if(i==0 || i==9){
                        if(j==8)
                        continue;
                        System.out.print("*");
                    }
                    if(j==8){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }System.out.println();
            }
        }
        else if(a=='L'){
            for(int i=0;i<8;i++){
                for(int j=0;j<7;j++){
                    if(j==0){
                      System.out.print("* ");
                    if(i==7 || j==7 ){
                        System.out.print("* * * * * * *");  
                    }
                }
            }System.out.println();
        }
    }
    else if(a=='E'){
        for(int i=0;i<9;i++){
            for(int j=0;j<7;j++){
                if(j==0){
                    System.out.print("*");
                }
                if(i==0 || i==4 || i==8){
                    System.out.print(" *");
                }
                
            }System.out.println();
        }
    }
    else if(a=='F'){
        for(int i=0;i<9;i++){
            for(int j=0;j<7;j++){
                if(j==0){
                    System.out.print("*");
                }
                if(i==0 || i==4 ){
                    System.out.print(" *");
                }
                
            }System.out.println();
        }
    }
    else if(a=='T'){
        for(int i=0;i<10;i++){
            for(int j=0;j<10;j++){
                if(i==0){
                    if(j==8)
                    continue;
                    System.out.print("*");
                }
                if(j==8){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }System.out.println();
        }
    }
    else if(a=='H'){
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
}
