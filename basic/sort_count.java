import java.util.Scanner;

public class sort_count {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr={8,4,2,1};
        int count=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
            if(arr[i]>arr[j]){
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
                count++;
            }
        }
    }
    System.out.println(count);
    }
}
