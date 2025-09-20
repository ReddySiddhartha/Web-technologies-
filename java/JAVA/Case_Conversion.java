
import java.util.*;
public class Case_Conversion {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         String a = sc.next();
         String b = sc.next();
         String c = "";
         // upper case to lower case
         for(int i=0;i<a.length();i++){
            if(a.charAt(i)>='A' &&  a.charAt(i)<='Z'){
                c+=(char)(a.charAt(i)+32);
            }
            else{
                c+=a.charAt(i);
            }
        }
             for(int i=0;i<b.length();i++){
            if(b.charAt(i)>='a' &&  b.charAt(i)<='z'){
                c+=(char)(b.charAt(i)-32);
            }
            else{
                c+=b.charAt(i);
            }


         }
         System.out.print(c);
        }      
        
    }
 

