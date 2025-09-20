import java.util.*;
public class  target {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int arr[][] = new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        int target = sc.nextInt();
        boolean find = false;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(arr[i][j]== target){
                    find = true;
                }
            }
        }
        System.out.print(find);
    }
    
}
