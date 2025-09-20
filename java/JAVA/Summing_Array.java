import java.util.*;
public class Summing_Array {
    public static int[] Summing(int[] arr,int size){
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]==9){
                arr[i]=0;
            }
            else{
                arr[i]=arr[i]+1;
                return arr;
            }
        }
        arr = new int[size+1];
        arr[0]=1;
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        int[] res =Summing(arr ,size);
        System.out.println(Arrays.toString(res));
        sc.close();


    }
    
}
