import java.util.*;
public class merge_sorted {
    static int[] merge(int[] ar,int []br,int m ,int n){
        int res[] = new int[m+n];
        int i=0, j=0, k=0;
        while(i<m && j<n){
            if(ar[i]<br[j]){
                res[k] = ar[i];
                i++;
                k++;
            }
            else{
                res[k] = br[j];
                j++;
                k++;         
            }
        }
        while(i<m){
            res[k] = ar[i];
            i++;
            k++;
        }
        while(j<n){
            res[k] = br[j];
            j++;
            k++;
        }
        return res;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int[] ar = new int[m];
        for(int i=0;i<m;i++){
            ar[i] = sc.nextInt();
        }
        int n = sc.nextInt();
        int br[] = new int[n];

        for(int i=0;i<n;i++){
            br[i] = sc.nextInt();
        }
        int res [] = merge(ar,br,m,n);
        for(int i=0;i<res.length;i++){
            System.out.println(res[i]+" ");
        }
    }
    
}
