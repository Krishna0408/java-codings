/* tofind whether there is a number in string */

import java.util.*;

public class isdigit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            if(Character.isDigit(c)){
            System.out.println("True");
            break;
            }
            //else{System.out.println("False");}

        }
    }
}
