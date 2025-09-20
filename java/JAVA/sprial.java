import java.util.*;
public class sprial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int arr[][] = new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr[i][j] = sc.nextInt();
            }
        }

        int top = 0 ; int bottom = row-1;int left = 0; int right = col-1;
        while(top<=bottom && left<=right){
            for(int i=left;i<=right;i++){
                System.out.print(arr[top][i]+" ");
            }
            top++;
        }
        for(int i= top;i<=bottom;i--){
            System.out.print(arr[i][right]+" ");
        }
        right--;
        if(top<=bottom){
            for(int i=right;i>=left;i--){
                System.out.print(arr[bottom][i]+" ");
            }
            bottom--;
        }
        if(left<=right){
            for(int i=bottom;i>=top;i--){
                System.out.print(arr[i][left]+" ");
            }
            left++;
        }
    }
    
}
