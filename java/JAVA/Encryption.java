import java.util.*;
public class Encryption {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        int lim = sc.nextInt();
        int sum = 0;
        String res = "";
        for(int i=0;i<n.length();i++){
            char c = n.charAt(i);
            sum+= c;
            if(sum>lim){
                break;
            }
            res+=c;
        }
        System.out.print(res);
    }
    
}
