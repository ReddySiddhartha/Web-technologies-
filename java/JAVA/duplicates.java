import java.util.*;
public class duplicates{
    static boolean check(int[]ar, int n){
        Arrays.sort(ar);
        for(int i=0;i<n-1;i++){
            if(ar[i]==ar[i+1]){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ar = new int[n];
        for(int i=0;i<n;i++){
            ar[i] = sc.nextInt();
        }
        System.out.println(check(ar, n));
    }
}