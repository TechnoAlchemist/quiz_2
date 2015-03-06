import java.util.Scanner;

public class PrimeCounter {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    System.out.print("Please enter a number for n: ");

    int n = scan.nextInt();

    boolean isPrime = false;

    if (n == 2 || n == 3) {
      isPrime = true;
    }

    for (long i = 2; i <= (long) Math.sqrt(n); i++) {
      if (n % i == 0) {
        isPrime = false;
        break;
      }
      else {
        isPrime = true;
      }
    }

    System.out.println(n + " " + isPrime);
  }
}