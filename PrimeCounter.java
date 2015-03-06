public class PrimeCounter {

  public static void main(String[] args) {

    int maxAmt = new int[1000000];

    for (int i = 2; i <= maxAmt; i++) {
      int counter = 0;
      for (int n = 0; n < i; n++) {
        if (n % i == 0) {
          counter++;
        }
      }

      if (counter == 0) {
        System.out.println(i);
      }
    }
  }
}