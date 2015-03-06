import java.util.Scanner;

public class PrimeCounter {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    String primeNumbers = " ";

    System.out.print("Please enter a number for n: ");

    int n = scan.nextInt();

    for (int i = 1; i <= n; i++) {

      int counter = 0;
      for (int num = i; num >= 1; num--) {
        if (i % num == 0) {
          counter++;
          continue;
        }
      }
      if (counter == 2) {
        primeNumbers = primeNumbers + i + " ";
      }
    }

    System.out.println("Prime numbers from 1 to n are :");
    System.out.println(primeNumbers);
  }
}