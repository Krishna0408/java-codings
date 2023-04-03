public class onezero {
    public static void main(String[] args) {
      for (int i = 0; i <= 4; i++) {
        for (int j = 0; j <= 4; j++) {
          if ((i == 1 && j==2) || (i == 2 && j==1) ||  (i == 3 && j==2) || (i == 2 && j==3)) {
            System.out.print("0 ");
          } else {
            System.out.print("1 ");
          }
        }
        System.out.println();
      }
    }
  }
  