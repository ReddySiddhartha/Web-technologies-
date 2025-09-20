import java.util.Scanner;
public class Word_Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String res = "";
        for(int i=0;i<a.length();i++){
            String tem ="";
            while(i<a.length() && a.charAt(i)!=' '){
                tem+=a.charAt(i);
                i++;
            }
            String rev ="";
            for(int j = tem.length()-1;j>=0;j--){
                rev+=tem.charAt(j);
            }
            if(rev.equals(tem)){
                res+="$"+rev+"$"+" ";
            }
            else{
                res+=rev+" ";
            }
        }
        res=res.trim();
        System.out.print(res);        
    }
    
}
