
    import java.util.Scanner;
public class alternate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < size / 2; i++) {
            if (i % 2 != 0) {
                int temp = arr[size - i - 1];
                arr[size - i - 1] = arr[i];
                arr[i] = temp;
            }
        }
        for (int x : arr) {
            System.out.print(x + " ");
        }
        sc.close();
    }

}


