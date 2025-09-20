import java.util.*;
public class maxsubarray {
    static int maxsum(int[]arr,int size){
        int max = Integer.MIN_VALUE;
    for(int i=0;i<size;i++){
        int sum =0;
        for(int j=i;j<size;j++){
            sum = sum + arr[j];
            if(sum>max){
                max = sum;
            }

        }
    }
    return max;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(maxsum(arr, size));


        
    }
    
}
