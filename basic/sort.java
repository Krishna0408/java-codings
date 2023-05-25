/*  sort in ascending or descending order */

import java.util.*;

public class sort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String str[]=new String[n];
        for(int i=0;i<n;i++){
            str[i]=sc.next();
        }
        Arrays.sort(str);  
// Ascending
        for(int i=0;i<n;i++){
            System.out.println(str[i]);  
        }
        System.out.println(Arrays.toString(str));

// Descending
        for(int i=n-1;i>=0;i--){
        System.out.println(str[i]);  
        }

        Arrays.sort(str, Collections.reverseOrder());   
        System.out.println(Arrays.toString(str));

    }
}