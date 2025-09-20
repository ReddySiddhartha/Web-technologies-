import java.util.Scanner;
public class Fin_Sundays {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
    String day = sc.next();
    int days = sc.nextInt();
    String arr[] = {"sun","mon","Tue","Wed","Thu","Fri","Sat"};
    int ind = -1;
    for(int i=0;i<7;i++){
        if(arr[i].equals(day)){
            ind = i;
        }
    } 
    int FirSun = 7-ind;
    int cnt = 0;
    for(int i=FirSun;i<=days;i+=7){
        cnt++;

    }
    System.out.print(cnt);
}  
}

        
    