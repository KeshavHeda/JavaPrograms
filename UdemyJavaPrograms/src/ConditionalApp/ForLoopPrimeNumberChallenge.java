package ConditionalApp;

public class ForLoopPrimeNumberChallenge {
    public static void main(String[] args) {

        System.out.println("********** Prime Number Check **********");
        int numbersCount = 0;

        for (int i = 10; i < 50; i++) {
            boolean primeNumber = isPrime(i);

            if (primeNumber) {
                numbersCount++;
                System.out.println("The prime number at position " + numbersCount + " = " + i);
            }

            if (numbersCount == 5) {
                System.out.println("Exiting for loop");
                break;
            }
        }

    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }

        for (int i = 2; i <= n /2; i++) {
            System.out.println("Looping " + i);
            if (n % i == 0) {
                System.out.println("Not a Prime : " + n);
                return false;
            }
        }

        // Optimize performance
//        for (int i = 2; i <= (long) Math.sqrt(n); i++) {
//        System.out.println("Looping " + i);
//            if (n % i == 0) {
//                return false;
//            }
//        }

        return true;
    }

}
