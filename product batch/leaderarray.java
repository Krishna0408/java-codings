import java.util.*;

class leaderarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] =new int[n];
        for (int i=0;i<n;i++) {
            a[i]=sc.nextInt();
        }
            for (int i=0;i<n;i++)
            {
                int j;
                for (j=i+1;j<n;j++)
                {
                    if (a[i]<=a[j])
                        break;
                }
                if (j==n)
                    System.out.print(a[i] + " ");
            }
        }
    
    }
