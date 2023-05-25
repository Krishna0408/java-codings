import java.util.*;

public class diagonalsquare {
	private static Scanner sc;
	
	public static void main(String[] args) {
		sc = new Scanner(System.in);	
		
		System.out.print("Enter size = ");
		int size = sc.nextInt();			
		for (int i = 1; i <= size; i++ ) 
		{
			for (int j = 1 ; j <= size; j++ ) 
			{
				if (i == 1 || i == size || i == j || j == 1 || j == size || j == size - i + 1) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}