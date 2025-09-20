import java.util.Scanner;

class rightzero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        int ans[] = new int[size];
        int j = 0;
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < size; i++) {
            if (arr[i] != 0) {
                ans[j] = arr[i];
                j++;
            }
        }
        for (int a : ans) {
            System.out.print(a + " ");
        }
        sc.close();
    }

}

