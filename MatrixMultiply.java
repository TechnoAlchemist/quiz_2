/* Gabe Lafontant glafonta@gmail.com*/

import java.util.Scanner;

public class MatrixMultiply {

  public static void main(String[] args) {

    int first[][] = new int[3][3]; 
    
    int second[][] = new int[3][3];
    
    int multiply[][] = new int[3][3];

    int i, j, k, sum = 0;

    Scanner scan = new Scanner(System.in);

    System.out.println("Enter the elements of the first matrix");

    // Load the first array with values
    for (i = 0; i < first.length; i++) {
      for (j = 0; j < first[i].length; j++) {
        first[i][j] = scan.nextInt();

      }
    }


    System.out.println("Enter the elements of the second matrix");

    // Load the first array with value

    for (i = 0; i < second.length; i++) {
      for (j = 0; j < second[i].length; j++) {
        second[i][j] = scan.nextInt();
      } 
    }

    for (i = 0; i < first.length; i++) {
      for (j = 0; j < second[i].length; j++) {
        for (k = 0; k < second.length; k++) {
          sum = sum + first[i][k] * second[k][j];
        }

        multiply[i][j] = sum;
        sum = 0;
      }
    }

    System.out.println("Product of entered matrices: ");

    for (i = 0; i < first.length; i++) {
      for (j = 0; j < second[i].length; j++) {
        System.out.print(multiply[i][j] + "\t");
      }
      System.out.print("\n");
    }
  





  }
}