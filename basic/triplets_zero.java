/*
 Given an array of distinct elements. The task is to find triplets in the array whose sum is zero.
Examples: 
Input: arr[] = {0, -1, 2, -3, 1}
Output: (0 -1 1), (2 -3 1)
Explanation: The triplets with zero sum are 0 + -1 + 1 = 0 and 2 + -3 + 1 = 0  
Input: arr[] = {1, -2, 1, 0, 5}
Output: 1 -2  1
Explanation: The triplets with zero sum is 1 + -2 + 1 = 0   
 */

import java.util.*;

public class triplets_zero {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[] = {0, -1, 2, -3, 1};
        int n=arr.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                for(int k=j+1;k<n;k++){
                    if(arr[i] + arr[j] + arr[k] == 0){
                        System.out.println(arr[i]+" "+arr[j]+" "+arr[k]);
                    }
                }
            }
        }
    }
}