/*  get a string and print n times */


import java.util.*;

class n_times_String{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            System.out.print(str);
        }
    }
}