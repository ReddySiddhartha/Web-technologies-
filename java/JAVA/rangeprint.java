import java.util.Scanner;

public class rangeprint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        int st = sc.nextInt();
        int en = sc.nextInt();
        for (int i = 0; i < size; i++) {
            if (arr[i] > st && arr[i] < en) {
                System.out.print(arr[i] + " ");
            }
        }
        sc.close();
    }

}
