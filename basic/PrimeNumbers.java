public class PrimeNumbers {
    public static void main(String[] args) {
        int limit = 50; // Change this to your desired range

        System.out.println("Prime numbers from 1 to " + limit + " are:");

        for (int num = 2; num <= limit; num++) {
            boolean isPrime = true;

            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.print(num + " ");
            }
        }
    }
}
