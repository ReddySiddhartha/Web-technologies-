public class charnum {
    public static void main(String[] args) {
        String a ="aaaabbbbbccccccdddddddeeeeeeee";
        String b = "";
        for(int i = 0; i < a.length(); i++) {
            char c = a.charAt(i);
            i++;
            int cnt = 1;
            while(i<a.length() && c== a.charAt(i)){
                cnt++;
                i++;
            }
            b+=c;
            b+=cnt;
            i--;
    }
        System.out.println(b);
    }
}