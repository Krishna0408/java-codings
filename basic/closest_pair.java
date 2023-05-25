/* 
Given a sorted array and a number x, find a pair in an array whose sum is closest to x.
Examples:
Input: arr[] = {10, 22, 28, 29, 30, 40}, x = 54
Output: 22 and 30
Input: arr[] = {1, 3, 4, 7, 10}, x = 15
Output: 4 and 10
 */

import java.util.*;

public class closest_pair {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[] = {1,3,4,7,10};
        int n=arr.length;
        int x=15;
        int num1=0,num2=0;
        int temp=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(Math.abs(arr[i]+arr[j]-x)<temp){
                    num1=i;num2=j;
                    temp=Math.abs(arr[i]+arr[j]-x);
                }
            }
        }
        System.out.println(arr[num1] +" And "+arr[num2]);
    }
}
