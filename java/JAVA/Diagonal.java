import java.util.*;
public class Diagonal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int arr[][]= new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr[i][j] = sc.nextInt();  
            }
        }
        for(int c=0;c<col;c++){
            int i=0, j=c;
            while(i<row && j>=0){
                System.out.print(arr[i][j]+" ");
                i++;
                j--;

            }
            System.out.println();
        }
        for(int r=0;r<row;r++){
            int i=r,j = col-1;
            while(i<row && j>=0){
             System.out.print(arr[i][j]+" ");
            i++;
            j--;
        }
        System.out.println();
      }
    }

    
}
