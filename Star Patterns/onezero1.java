public class onezero1{
  public static void main(String[] args) {
      int n = 7;
      for (int i = 0; i < n; i++) {
          for (int j = 0; j < n; j++) {
              if (i == 0 || i == n - 1 || j == 0 || j == n - 1 || i == j || i + j == n - 1) {
                  System.out.print("1");
              } else {
                  System.out.print("0");
              }
          }
          System.out.println();
      }
  }
}
