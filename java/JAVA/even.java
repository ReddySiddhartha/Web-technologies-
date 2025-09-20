import java.util.Scanner;

public class even {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int ar[] = new int[size];

        for (int i = 0; i < size; i++) {
            ar[i] = sc.nextInt();
        }
        for (int i = 0; i < size; i++) {
            if (ar[i] % 2 == 0) {
                System.out.print(ar[i] + " ");
            }
        }
    }
}


