public class JavaFuckingAround {

  public static void print(Object obj) {
    System.out.print(obj);
  }

  public static void println(Object obj) {
    System.out.println(obj);
  }

  public static void main(String[] args) {

    java.util.Scanner input = new java.util.Scanner(System.in);

    int[][] values = {{3, 4, 5, 1}, {33, 6, 1, 2}};

    int v = values[0][0];
    for (int row = 0; row < values.length; row++) {
      for (int column = 0; column < values[row].length; column++) {
        if (v < values[row][column]) {
          v = values[row][column];
        }
      }
    }

    println(v);

  }

}