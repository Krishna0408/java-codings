public class array2D {
    public static void main(String[] args) {
      int[][] myNumbers = { {1, 2, 3}, {4, 5, 6,} ,{7, 8, 9}};
      for (int i = 0; i < myNumbers.length;i++,System.out.println()) {
        for(int j = 0; j < myNumbers[i].length;j++) {
          System.out.print(myNumbers[i][j]+" ");
        }
        }
    }
  }