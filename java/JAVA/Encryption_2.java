import java.util.*;
public class Encryption_2 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String c = "";
        for(int i=0;i<s.length();i++){
            char k = s.charAt(i);
            char b = (char)((k-'a'+4)%26+'a');
            c+=b;
        }
        System.out.println(c);

    }
    
}
