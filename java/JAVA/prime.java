import java.util.Scanner;
public class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int ar[] = new int[size];

        for (int i = 0; i < size; i++) {
            ar[i] = sc.nextInt();
        }

        System.out.print("Prime numbers: ");
        for (int n : ar) {
            if (n <= 1) continue;
            boolean isPrime = true;
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime)
                System.out.print(n + " ");
        }
    }
}

